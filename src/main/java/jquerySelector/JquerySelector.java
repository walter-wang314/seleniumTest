package jquerySelector;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Walter on 2017/6/27.
 */
public class JquerySelector {



    @Test
    public void jQueryTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("http://www.jquery.com/");
        //在executeScript中调用jQuery.find(jquerySelector);
//        List<WebElement> elements = (List<WebElement>)jse.executeScript("return jQuery.find" +"('.menu-item a:even')");
        List<WebElement> elements = (List<WebElement>)jse.executeScript("return $('.menu-item a:even')");
        Assert.assertEquals(3,elements.size());
        Assert.assertEquals("Download",elements.get(0).getText());
        Assert.assertEquals("Blog",elements.get(1).getText());
        Assert.assertEquals("Browser Support",elements.get(2).getText());
        driver.close();
    }

    public static void main(String[] args) {

    }
}
