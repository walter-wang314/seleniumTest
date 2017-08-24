package seleniumTest.firefoxbaidu;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

/**
 * Created by Walter on 2017/6/17.
 */
public class FirefoxBaidu {
    public static void main(String[] args) {
        FirefoxDriverManager.getInstance().setup();
        System.setProperty("webdriver.firefox.bin","D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        ProfilesIni pi = new ProfilesIni();
        FirefoxProfile profile = pi.getProfile("default");
        WebDriver webDriver = new FirefoxDriver(profile);

        webDriver.get("https://www.baidu.com/");
        WebElement baiduInput = webDriver.findElement(By.id("kw"));
        baiduInput.sendKeys("hello world!");
        WebElement baiduyixiaButton = webDriver.findElement(By.id("su"));
        baiduyixiaButton.click();
        try {
            System.out.println("Before quiting");
            Thread.sleep(5000);
            webDriver.close();
            System.out.println("After quiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
