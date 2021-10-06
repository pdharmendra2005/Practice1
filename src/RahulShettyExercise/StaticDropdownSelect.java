package RahulShettyExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class StaticDropdownSelect {
    WebDriver driver;
    String baseUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
    String browserName = "chrome";
    static String currencyChoice = "AED";
    static int numOfPassengers = 5;

    public void InvokeBrowser(String browserName){

    if(browserName.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver","src//BrowserDriver//chromedriver.exe");
        driver = new ChromeDriver();
    } else if (browserName.equalsIgnoreCase("firefox")){
        System.setProperty("webdriver.gecko.driver","src//BrowserDriver//geckodriver.exe");
        driver = new FirefoxDriver();
    }
    driver.get(baseUrl);
    driver.manage().window().maximize();

    }
//    public void selectCurrency(String currencyNaam){
//
//       // driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        WebElement moneyelement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        Select selectmoneyType = new Select(moneyelement);
//        selectmoneyType.selectByVisibleText(currencyNaam);
//        selectmoneyType.selectByIndex(3);
//        selectmoneyType.selectByValue("INR");
//        System.out.println(selectmoneyType.getFirstSelectedOption().getText());
//
//
//    }
//
    public void selectPassenger(int noOfPassenger){
        driver.findElement(By.id("divpaxinfo")).click();

        noOfPassenger = 1;
        int j =0 ;
        while(noOfPassenger < numOfPassengers){
            driver.findElement(By.id("hrefIncAdt")).click();
            noOfPassenger++;
            j = noOfPassenger;
        }
       // driver.manage().timeouts().pageLoadTimeout(10l, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".buttonN")).click();
        //verify that Four Adult selected
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        System.out.println(j);
    }
    public void selectCity(){
       /* //method to select city with index [2]
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement((By.xpath("//a[contains(@text,'Ahmedabad (AMD)')]"))).click();
      //driver.findElement((By.xpath("//a[contains(text(),'Ahmedabad (AMD)')")));
        driver.findElement(By.xpath("(//a[contains(@text,'Bengaluru (BLR)')])[2]")).click();
        driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();  WORKING*/

        // method to select city with relative x path //xpath //xapth
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement((By.xpath("//a[contains(@text,'Ahmedabad (AMD)')]"))).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='VNS']")).click();
    }

    public static void main(String[] args) {
    StaticDropdownSelect staticDropSelect = new StaticDropdownSelect();

    //staticDropSelect.InvokeBrowser("chrome");
    staticDropSelect.InvokeBrowser("firefox");
    //staticDropSelect.selectCurrency(currencyChoice);
    staticDropSelect.selectPassenger(numOfPassengers);
    staticDropSelect.selectCity();
    }


}
