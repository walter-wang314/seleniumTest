package seleniumTest.chromebaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Walter on 2017/6/18.
 */
public class ChromeBaidu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com/");
        WebElement baiduInput = webDriver.findElement(By.id("kw"));
        baiduInput.sendKeys("hellohellohellohellohellohellohellohellohellohellohellohello");
        WebElement baiduyixiaButton = webDriver.findElement(By.id("su"));
        baiduyixiaButton.click();
        try {
            System.out.println("begin to Sleep");
            Thread.sleep(5000);
            System.out.println("finished Sleeping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.close();
    }
}
