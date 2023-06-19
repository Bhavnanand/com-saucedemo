package homework;

import org.omg.CORBA.UShortSeqHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser ="Chrome";
    static String Url = "https://www.saucedemo.com/";
    static WebDriver  driver;

    public static void main(String[] args) throws InterruptedException {
        //1. Setup multibrowser
        if (browser.equalsIgnoreCase("Chrome")){
            WebDriver driver= new ChromeDriver();
        } else if(browser.equalsIgnoreCase("Edge")){
            WebDriver driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            WebDriver driver= new FirefoxDriver();
        } else System.out.println("Invalid browser");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        //2. Open URL
        driver.get(Url);
        System.out.println("URL name is  :"+ Url);

        //3. Print the title of the page
        driver.getTitle();
        System.out.println("Title of page is :"+driver.getTitle());

        //4. Print the current url
        driver.getCurrentUrl();
        System.out.println("Name of current URL  :"+driver.getCurrentUrl());
        //5. Print the page source
        driver.getPageSource();
        System.out.println("Page Source :"+ driver.getPageSource());

        //6. Enter the email to email field
        driver.findElement(By.id("user-name"));
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("admin");

        //7. Enter the password to password field
        WebElement passwordField =driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        Thread.sleep(5000);
        //8. Close the browser
        driver.close();
    }
}
