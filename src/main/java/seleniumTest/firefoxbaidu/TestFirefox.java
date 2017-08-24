package seleniumTest.firefoxbaidu;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Walter on 2017/6/18.
 */
public class TestFirefox {
    protected WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        FirefoxDriverManager.getInstance().setup();
    }

    @Before
    public void setupTest() {
        System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        driver = new FirefoxDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            try {
                System.out.println("Before quiting");
                Thread.sleep(5000);
                driver.quit();
                System.out.println("After quiting");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void test() {
        driver.get("https://www.baidu.com/");
        WebElement baiduInput = driver.findElement(By.id("kw"));
        baiduInput.sendKeys("hello");
        WebElement baiduyixiaButton = driver.findElement(By.id("su"));
        baiduyixiaButton.click();
    }
}
