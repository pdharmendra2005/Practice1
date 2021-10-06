package AutomationFirstTest;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationChromeDemo1 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C://DP- 2020//Inlejii- JAVA Related//chromedriver.exe");


        //Create Driver Object for ChromeDriver
        WebDriver MyDriver = new ChromeDriver();
        // need to implemnent all methods for webDriver Interface
        MyDriver.get("https://www.google.co.uk");

        System.out.println(MyDriver.getTitle());

        //   MyDriver.findElement(By.id("realbox")).sendKeys("Hello");
        //MyDriver.close();

    }
}
