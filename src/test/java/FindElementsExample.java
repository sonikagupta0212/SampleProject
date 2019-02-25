import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsExample {
    @Test
    public void findElementsExample(){
        System.setProperty("webdriver.chrome.driver", "D:\\2019\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        //System.out.println(driver.findElement(By.xpath("//div[@class='desktop-navLinks']/div[2]/div/a")).getText());
        List <WebElement> ls = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
        System.out.println("Menu Listing - ");
        for(int i=0;i<ls.size();i++){
            WebElement we = ls.get(i);
             System.out.println(we.getText());
        }
        driver.close();
    }
}
