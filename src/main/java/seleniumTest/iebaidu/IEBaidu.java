package seleniumTest.iebaidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEBaidu {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability("ignoreProtectedModeSettings",true);
        WebDriver webDriver = new InternetExplorerDriver(capabilities);

        webDriver.get("https://www.baidu.com/");
        WebElement baiduInput = webDriver.findElement(By.id("kw"));
        baiduInput.sendKeys("hellohellohellohellohellohellohellohellohellohellohellohello");
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
