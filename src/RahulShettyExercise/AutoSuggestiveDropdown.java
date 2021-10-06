package RahulShettyExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropdown {
    WebDriver driver;
    String baseUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
    String browserName = "chrome";

    public void InvokeBrowser(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src//BrowserDriver//chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src//BrowserDriver//geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();

    }

    public void autoSuggestiveCity() {

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        for (WebElement option : options) {

            if (option.getText().equalsIgnoreCase("india")) {
                option.click();
                break;
            }

        }
    }
        public static void main (String[]args){
            AutoSuggestiveDropdown autoSuggestive = new AutoSuggestiveDropdown();

            //staticDropSelect.InvokeBrowser("chrome");
            autoSuggestive.InvokeBrowser("firefox");
            autoSuggestive.autoSuggestiveCity();

        }

}

