package AutomationFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class EdurekaExample1 {

    WebDriver mydriver;
    WebElement webElement;
    public void invokeBrowser(){

        try {
            System.setProperty("webdriver.gecko.driver","C:\\DP- 2020\\Inlejii- JAVA Related\\geckodriver.exe");


            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette",true);

            mydriver = new FirefoxDriver(capabilities);
            mydriver.manage().deleteAllCookies();
            mydriver.manage().window().maximize();
            mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            //mydriver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

            mydriver.navigate().to("https://www.google.co.uk");

            System.out.println("i am in search");
            //System.out.println("==="+mydriver.findElement(By.id("lst-ib")).isDisplayed());
            mydriver.findElement(By.className("RveJvd snByac")).click();
            Thread.sleep(3000);
            mydriver.findElement(By.id("lst-ib")).sendKeys("java");
            //webElement.


            //searchCourse();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   /* public void searchCourse(){

        try {
            Thread.sleep(3000);
            System.out.println("i am in search");
            System.out.println("==="+mydriver.findElement(By.id("lst-ib")).isDisplayed());
            mydriver.findElement(By.className("RveJvd snByac")).click();
            Thread.sleep(3000);
            mydriver.findElement(By.id("lst-ib")).sendKeys("java");

            // mydriver.findElement(By.className("new-search-inp")).sendKeys("JAVA");
            //mydriver.findElement((By.id("search-box"))).click();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }*/

    public static void main(String[] args) {

        EdurekaExample1 edu = new EdurekaExample1();
        edu.invokeBrowser();

    }
}
