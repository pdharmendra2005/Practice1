package RahulShettyExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TableRawCount {

    public static WebDriver driver;
    static String baseURL= "https://www.google.com/search?q=southall+travel&rlz=1C1CHZL_enGB824GB824&oq=sou&aqs=chrome.0.69i59j46i39i175i199j69i57j46i199i433i465i512j0i433i512j0i67j0i67i457j0i67j46i199i433i465i512j46i512.2956j0j15&sourceid=chrome&ie=UTF-8";

    @Test
    public void openBrowserToCheckRaw(){

        System.setProperty("webdriver.chrome.driver", "src//BrowserDriver//ChromeNew//chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(baseURL);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        List<WebElement> raws =  driver.findElements(By.xpath("//table/tbody"));

        int countRaw = raws.size();
        System.out.println("No. of Raws is "+countRaw);
    }



}
