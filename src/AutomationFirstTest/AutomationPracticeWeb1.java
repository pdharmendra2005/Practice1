package AutomationFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class AutomationPracticeWeb1 {

    public WebDriver driver;
    //Test Data
    String baseUrl = "http://automationpractice.com/index.php";
    String username = "vicky_sturd@hotmail.com";
    String password = "Vivek321";
    String browserName = "chrome";

    public static void main(String[] args) {
        AutomationPracticeWeb1 automation1 = new AutomationPracticeWeb1();

        //Verify that user can search an item using search box
        automation1.invokeBrowser(automation1.browserName);
        automation1.searchItem("T-shirt");
        automation1.closeBrowser();

        //Verify that user can Navigate to Women's category
        automation1.invokeBrowser(automation1.browserName);
        automation1.gotoWomenCategory();
        automation1.closeBrowser();

        //Verify that user can logIn successfully
        automation1.invokeBrowser(automation1.browserName);
        automation1.goToSignInPage();
        automation1.logInAs(automation1.username, automation1.password);
        //automation1.closeBrowser();

    }

    public void gotoWomenCategory() {

        driver.findElement(By.cssSelector("li a[title='Women']")).click();
        //waitForPageLoad(3l);
    }

    public void waitForPageLoad(Long second) {
        //wait for page to load
        driver.manage().timeouts().pageLoadTimeout(second , TimeUnit.SECONDS);
    }

    public void searchItem(String itemName) {
        driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys(itemName);

        driver.findElement(By.cssSelector("[name='submit_search']")).click();
        waitForPageLoad(3l);
    }

    public void closeBrowser(){
        //Close the Browser
        driver.close();
    }

    public void invokeBrowser(String browserName){

        switch (browserName){
            case "chrome" :
                System.setProperty("webdriver.chrome.driver","src//BrowserDriver//chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox" :
                System.setProperty("webdriver.gecko.driver","src//BrowserDriver//geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "IE":
                System.setProperty("webdriver.ie.driver","src//BrowserDriver//IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
           // default:
            //    throw new IllegalStateException("Unexpected value: " + browserName);
        }

        //opening the baseUrl
        driver.get(baseUrl);
        //Maximise the browser
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        waitForPageLoad(5l);
    }
/*
public void invokeBrowser(String browserName){

        switch (browserName){
            case "chrome" :

        }
        //create the browser profile and provide the path
        System.setProperty("webdriver.chrome.driver","src//BrowserDriver//chromedriver.exe");
        //Instatiating the webdriver variable and assign the webdriver object
        // WebDriver driver;
        driver = new ChromeDriver();
        //opening the browser
        driver.get(baseUrl);
        //Maximise the browser
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
 */

    public void goToSignInPage(){
        //click the signin link
        //find out the webelement of signInLink
       // WebElement signInLink = driver.findElement(By.ByCssSelector(".login");
        WebElement signInLink = driver.findElement(By.cssSelector(".login"));
        signInLink.click();
        //wait for page to load
        waitForPageLoad(3l);
    }
    public void logInAs(String UName, String PassWrd){
    //Enter the UserName
        //Find the webElement of the SignIntextField , Enter the UseName
        WebElement userNameTextField = driver.findElement(By.cssSelector("[name=email]"));
        userNameTextField.sendKeys(UName);
    //Enter the Password
        //Find the webElement of the PasswordField
        WebElement passwdTextField = driver.findElement(By.cssSelector("#passwd"));
        passwdTextField.sendKeys(PassWrd);

    //Click on the SignIn button
        //Find the webElement of the SignIn button
        WebElement signInButton = driver.findElement(By.cssSelector("#SubmitLogin"));
        signInButton.click();

        waitForPageLoad(3l);
    }
}