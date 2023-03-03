package SeleniumEssentialTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Part6_Form {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yarus/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("White");
        driver.findElement(By.id("job-title")).sendKeys("QA Tester");
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("03/03/23");
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        System.out.println(driver.getCurrentUrl());
        driver.quit();



    }
}
