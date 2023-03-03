package Zero;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yarus/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
