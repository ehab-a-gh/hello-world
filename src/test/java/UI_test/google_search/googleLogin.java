package UI_test.google_search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.SystemClock;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

/**
 * Created by ehab on 4/22/17.
 */
public class googleLogin {

    @Test
    public void navigateToRL() {
        String assertResut;


        System.setProperty("webdriver.chrome.driver", "/home/ehab/Desktop/chromedriver");
        WebDriver Driver = new ChromeDriver();
//
        Driver.get("http://www.landmarkgroup.com/retail/ecommerce/landmarkshopscom/?country=uae");

        WebDriverWait Wait = new WebDriverWait(Driver, 15);
        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/h1/a")));
        Driver.findElement(By.xpath("//*[@id=\"header\"]/h1/a")).isDisplayed();

        Driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div[1]/ul/li[1]/div/a/img")).click();

        if (Driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/a[1]/img")).isDisplayed()) {
            assertResut = "testing passed";
            System.out.println(assertResut);
        } else {
            System.out.println("testing failed");
        }
        if (Driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/a[1]/img")).toString().equalsIgnoreCase("Centrepoint")){
            System.out.println("text is matched");
        }else {
            System.out.println("text not matched");
        }
        Driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[2]/a/span/strong")).click();

        Driver.findElement(By.id("storecity")).sendKeys("dubai");

        Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/ul/li")));
        Driver.findElement(By.xpath("/html/body/div[3]/ul/li")).click();
        Driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        Driver.close();
    }

}

