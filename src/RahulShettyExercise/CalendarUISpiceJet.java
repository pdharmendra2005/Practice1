package RahulShettyExercise;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class CalendarUISpiceJet {
    WebDriver driver;
    String baseUrl = "https://book.spicejet.com/";
    String browserName = "chrome";
    static int numOfPassengers = 4;

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
    public void selectPassenger(int noOfPassenger){

        driver.findElement(By.id("divpaxinfo")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();

        Select NoOfPassenger = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        NoOfPassenger.selectByIndex(noOfPassenger-1);
        }

        /*noOfPassenger = 1;
        int j =0 ;
        while(noOfPassenger < numOfPassengers){
            driver.findElement(By.id("hrefIncAdt")).click();
            noOfPassenger++;
            j = noOfPassenger;
        }
        // driver.manage().timeouts().pageLoadTimeout(10l, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".buttonN")).click();
        //verify that Four Adult selected
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult");
        //System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        //System.out.println(j);*/


    public void checkBoxSelect(){
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id *='SeniorCitizenDiscount']")).isSelected());
        // System.out.println(driver.findElement(By.cssSelector("input[id *='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id *='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id *='SeniorCitizenDiscount']")).isSelected());


        List<WebElement> allchkbox = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(allchkbox.size());
        //allchkbox.set(3,)

    }

    public static void main (String[]args){
        CalendarUISpiceJet chkBox = new CalendarUISpiceJet();

        //staticDropSelect.InvokeBrowser("chrome");
        chkBox.InvokeBrowser("firefox");
        chkBox.selectPassenger(numOfPassengers);
        chkBox.checkBoxSelect();

    }

}

