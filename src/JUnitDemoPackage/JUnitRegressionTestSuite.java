package JUnitDemoPackage;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class JUnitRegressionTestSuite {

// Open Browser- Website
// Open add member page
// Click Sign in
// Enter valid email- click create account
// Select Mr (Option to select Mr or MRs)
// Enter First name and Last name
// Select Date of birth
// Click sign up for news letter (option to select another)
// Select State

    //Test Data
    String browser= "firefox";
    static String baseURL= "http://automationpractice.com/index.php";
    String eMail= "pdharmendra@gmail.com";
    static String title1= "Mr";
    String firstName= "Dee";
    String lastName= "Patel";
    static String date1= "06  ";
    static String month1= "June ";
    static String year1= "1976  ";
    String signUpForNewsLetter= "Yes";
    static String state= "Alaska";

    public static WebDriver driver;

    @BeforeClass
    public static void openBrowser(){
        //System.setProperty("webdriver.chrome.driver","src//BrowserDriver//chromedriver.exe");
        //assign the webDriver object
        //driver = new ChromeDriver();
        //Opening the URL
        System.setProperty("webdriver.gecko.driver","src//BrowserDriver//geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get(baseURL);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
    @Before
    public void waitForPageLoading(){
        driver.manage().timeouts().pageLoadTimeout(3l, TimeUnit.SECONDS);

    }

    @Test
    public void createMember(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.cssSelector("#email_create")).sendKeys(eMail);
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    //Goto sign in page enter valid email and click create member
    //Enter user details
    public void selectTitle(String title) {
        if (title.equalsIgnoreCase("Mr")) {
            driver.findElement(By.cssSelector("#id_gender1")).click();
        }
        else {
            driver.findElement(By.cssSelector("#id_gender2")).click();
        }
    }
    public void enterFName(){
        WebElement fName = driver.findElement(By.cssSelector("#customer_firstname"));
        fName.sendKeys(firstName);
    }
    public void enterLName(){
        WebElement lName = driver.findElement(By.cssSelector("#customer_lastname"));
        lName.sendKeys(lastName);
    }


    public void enterDOB(String date, String month, String year){
        selectusingText(driver.findElement(By.cssSelector("#days")),date);
        selectusingText(driver.findElement(By.cssSelector("#months")),month);
        selectusingText(driver.findElement(By.cssSelector("#years")),year);
    }

    public void selectusingText(WebElement element,String inPutText) {
        Select select= new Select(element);
        select.selectByVisibleText(inPutText);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }
    public void selectStateName(String stateName) {
        Select stateName1 = new Select(driver.findElement(By.cssSelector("#id_state")));
        stateName1.selectByVisibleText(state);
    }
    @AfterClass
    public static void closeBrowser(){
        driver.close();
    }
    @Test
    public void userCredentialDetails() {
        selectTitle(title1);
        enterFName();
        enterLName();
        enterDOB(date1,month1,year1);
        selectStateName(state);


    }

}
