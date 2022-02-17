package RahulShettyExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class RadioButtonSouthhall {
    WebDriver driver;
    String baseUrl = "https://www.southalltravel.co.uk/";
    String browserName = "chrome";
    static String currencyChoice = "AED";
    static int numOfPassengers = 5;
    static Select slectGlobal ;
    static String chooseClassCategory ;
    static String chooseAirline = "Air India";
    public void invokeBrowser(String browserName){

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
  /*  public void selectInstance(Select selectCommonInstance){
        this.slectGlobal= selectCommonInstance;
    }
    */
    public void selectClass(String chooseClass){
        slectGlobal = new Select(driver.findElement(By.id("Flightclass")));
        slectGlobal.selectByValue(chooseClass);
    }
    public void selectAirline(String airlineName){
        driver.findElement(By.id("AirLineCode1")).click();
        slectGlobal = new Select((driver.findElement(By.id("AirLineCode1"))));
        slectGlobal.selectByVisibleText(airlineName);

    }
    public void selectPassenger(int noOfPassenger){
        driver.findElement(By.name("passengers")).click();
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);

       // driver.findElement(By.cssSelector("#AdultCnt.sel-01")).click();

        //WebElement PasElement = driver.findElement(By.cssSelector("#AdultCnt.sel-01"));

        slectGlobal = new Select(driver.findElement(By.cssSelector("#AdultCnt.sel-01")));
        slectGlobal.selectByIndex(numOfPassengers-1);


        // driver.manage().timeouts().pageLoadTimeout(10l, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
                //verify that Four Adult selected
        driver.findElement(By.name("passengers")).getText();

    }
   /* public void selectCity(){
       /* //method to select city with index [2]
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement((By.xpath("//a[contains(@text,'Ahmedabad (AMD)')]"))).click();
      //driver.findElement((By.xpath("//a[contains(text(),'Ahmedabad (AMD)')")));
        driver.findElement(By.xpath("(//a[contains(@text,'Bengaluru (BLR)')])[2]")).click();
        driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();  WORKING

        // method to select city with relative x path //xpath //xapth
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement((By.xpath("//a[contains(@text,'Ahmedabad (AMD)')]"))).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='VNS']")).click();
    }
*/
    public static void main(String[] args) {
        RadioButtonSouthhall radioButtonSouthhall = new RadioButtonSouthhall();

        //staticDropSelect.InvokeBrowser("chrome");
        radioButtonSouthhall.invokeBrowser("chrome");
        //staticDropSelect.selectCurrency(currencyChoice);
        radioButtonSouthhall.selectClass("W");
        radioButtonSouthhall.selectAirline(chooseAirline);
        radioButtonSouthhall.selectPassenger(numOfPassengers);
        //staticDropSelect.selectCity();

    }


}
