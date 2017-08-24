package seleniumTest.iebaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Walter on 2017/6/18.
 */
public class IEBaidu {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
        WebDriver webDriver = new InternetExplorerDriver();

        webDriver.get("https://www.baidu.com/");
        WebElement baiduInput = webDriver.findElement(By.id("kw"));
        baiduInput.sendKeys("hello world!");
        WebElement baiduyixiaButton = webDriver.findElement(By.id("su"));
        baiduyixiaButton.click();
        try {
            System.out.println("Before quiting");
            Thread.sleep(4000);
            webDriver.close();
            System.out.println("After quiting");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
