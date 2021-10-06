package AutomationFirstTest;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegressionTestSuite {

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
    String browserName = "chrome";
    static String baseURL = "http://automationpractice.com/index.php";
    String eMail = "pdharmendra374@gmail.com";
    static String title1 = "Mr";
    String firstName = "Dee";
    String lastName = "Patel";
    static String date1 = "6  ";
    static String month1 = "June ";
    static String year1 = "1976  ";
    String signUpForNewsLetter = "Yes";
    static String state = "Alaska";

    //Open Browser and goto baseUrl website
    //Instantiating browser
    public WebDriver driver;

    //create the browser profile and provide the path
    public void openBrowser() {
        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src//BrowserDriver//chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src//BrowserDriver//geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "IE":
                System.setProperty("webdriver.ie.driver", "src//BrowserDriver//IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                break;
            // default:
        }
        //opening the baseUrl
        driver.get(baseURL);
        //Maximise the browser
        driver.manage().window().maximize();

    }

    //Goto sign in page enter valid email and click create member
    public void createMember() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.cssSelector("#email_create")).sendKeys(eMail);
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    //Enter user details
    public void selectTitle(String title) {
        if (title.equalsIgnoreCase("Mr")) {
            WebDriverWait wait = new WebDriverWait(driver,10);
            WebElement t = driver.findElement(By.cssSelector("input#id_gender1"));
            if(t.isDisplayed())
            driver.findElement(By.cssSelector("input#id_gender1")).click();
        } else {
            driver.findElement(By.cssSelector("#id_gender2")).click();
        }
    }

    public void enterFName() {
        WebElement fName = driver.findElement(By.cssSelector("#customer_firstname"));
        fName.sendKeys(firstName);
    }

    public void enterLName() {
        WebElement lName = driver.findElement(By.cssSelector("#customer_lastname"));
        lName.sendKeys(lastName);
    }


    public void enterDOB(String date, String month, String year) {
        selectusingText(driver.findElement(By.cssSelector("#days")), date);
        selectusingText(driver.findElement(By.cssSelector("#months")), month);
        selectusingText(driver.findElement(By.cssSelector("#years")), year);
    }

    public void selectusingText(WebElement element, String inPutText) {
        Select select = new Select(element);
        select.selectByVisibleText(inPutText);

    }

    public void selectStateName(String stateName) {
        Select stateName1 = new Select(driver.findElement(By.cssSelector("#id_state")));
        stateName1.selectByVisibleText(state);
    }

    public void clicktoRegister() {
        driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
    }

    public void closeBrowser() {
        driver.close();
    }

    public void verifityMendatoryField() {
        //String verifymsg = driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]")).getText();
        String verifymsg = driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
        System.out.println(verifymsg);

    }

    //Main method
    public static void main(String[] args) {
        RegressionTestSuite regressionTestSuite = new RegressionTestSuite();
        regressionTestSuite.openBrowser();
        regressionTestSuite.createMember();

        regressionTestSuite.selectTitle(RegressionTestSuite.title1);
        regressionTestSuite.enterFName();
        regressionTestSuite.enterLName();
        regressionTestSuite.enterDOB(date1, month1, year1);
        regressionTestSuite.selectStateName(state);
        regressionTestSuite.clicktoRegister();
        regressionTestSuite.verifityMendatoryField();
        // regressionTestSuite.closeBrowser();

    }
}

