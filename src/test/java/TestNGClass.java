import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNGClass {

    // Launch Chrome
    @Test
    public void dd1() {
        System.setProperty("webdriver.chrome.driver", "D:\\2019\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
    }

    // Launch Chrome in Headless mode
    @Test
    public void dd2() {
        System.setProperty("webdriver.chrome.driver", "D:\\2019\\Drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions chOptions = new ChromeOptions();
        chOptions.setHeadless(false);
        WebDriver driver = new ChromeDriver(chOptions);
        driver.navigate().to("https://www.google.com");
        driver.close();
    }

    // Launch IE
    @Test
    public void dd3() {
        /*System.setProperty("webdriver.ie.driver", "D:\\2019\\Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com");
        driver.close(); */

        System.setProperty("webdriver.ie.driver", System.getProperty("webdriver.ie.driver", "D:\\2019\\Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe"));
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.close();
    }

    // Launch IE in Headless mode - Headless mode is not available for IE
    @Test
    public void dd4() {
        System.setProperty("webdriver.ie.driver", "D:\\2019\\Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        //ieOptions.setHeadless(true);
        WebDriver driver = new InternetExplorerDriver(ieOptions);
        driver.navigate().to("https://www.google.com");
        driver.close();
    }
     // Launch Firefox
    @Test
    public void dd5() {
        System.setProperty("webdriver.gecko.driver", "D:\\2019\\Drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.close();
    }

    // Launch Firefox in Headless mode
    @Test
    public void dd6() {
        System.setProperty("webdriver.gecko.driver", "D:\\2019\\Drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
        FirefoxOptions ffOptions = new FirefoxOptions();
        ffOptions.setHeadless(false);
        WebDriver driver = new FirefoxDriver(ffOptions);
        driver.navigate().to("https://www.google.com");
        //driver.close();
    }
}
