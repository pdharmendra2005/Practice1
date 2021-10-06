package JUnitDemoPackage;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class JUnitAutomationPracWeb1 {

    public static WebDriver driver;


    static JUnitAutomationPracWeb1 automation1 = new JUnitAutomationPracWeb1();
    //Test Data
    static String baseUrl = "http://automationpractice.com/index.php";
    static String username = "vicky_sturd@hotmail.com";
    static String password = "Vivek123";
    static String browserName = "firefox";
    static String searchItem = "Dress";

    /*
    public static void main(String[] args) {
        //Verify that user can logIn successfully
        automation1.testCase1();

        //Verify that user can search an item using search box
        automation1.testCase2();

        //Verify that user can Navigate to Women's category
        automation1.testCase3();

    }
*/
    @Test
    public void testCase1() {

        automation1.goToSignInPage();

    }
    @Test
    public void testCase2() {

        automation1.searchItem("Dress");
    }
    @Test
    public void testCase3(){
        automation1.gotoWomenCategory();
    }
    public void gotoWomenCategory() {

        driver.findElement(By.cssSelector("li a[title='Women']")).click();
        waitForPageLoad(3l);
    }
    @Before
    public void waitForPageLoading(){
        automation1.waitForPageLoad(3l);

    }
    public void waitForPageLoad(Long second) {
        //wait for page to load
        driver.manage().timeouts().pageLoadTimeout(second , TimeUnit.SECONDS);
    }

    public void searchItem(String itemName) {
        driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys(itemName);

        driver.findElement(By.cssSelector("[name='submit_search']")).click();
        waitForPageLoad(5l);
    }
    @AfterClass
    public static void closeBrowser(){
        //Close the Browser
        driver.close();
    }
    @BeforeClass
    public static void startBrowser(){
        automation1.invokeBrowser(browserName);
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
        driver.manage().deleteAllCookies();
        waitForPageLoad(5l);
    }

    public void goToSignInPage(){
        //click the signin link

        WebElement signInLink = driver.findElement(By.cssSelector(".login"));
        signInLink.click();
        waitForPageLoad(3l);
        automation1.logInAs(username, password);
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


    }
}