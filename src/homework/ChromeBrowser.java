package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
        String baseUrl ="https://www.saucedemo.com/";
        //  1. Setup chrome browser
        WebDriver driver = new ChromeDriver();
        //Screen maximize
        driver.manage().window().maximize();

        //Implicite time setting
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

       // 2. Open URL
        driver.get(baseUrl);
        //System.out.println("Name of URL  :" +driver.get(baseUrl));

     //   3. Print the title of the page
        driver.getTitle();
        System.out.println("Title : "+driver.getTitle());

      //  4. Print the current url
        driver.getCurrentUrl();
        System.out.println("Name of current Url  :" + driver.getCurrentUrl());
       // 5. Print the page source
        driver.getPageSource();

       // 6. Enter the email to email field
        driver.findElement(By.name("user-name"));
        WebElement  usernamefield =   driver.findElement(By.name("user-name"));
        usernamefield.sendKeys("standard_user");

       // 7. Enter the password to password field
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        Thread.sleep(2000);
       // 8. Close the browser
        driver.close();
    }
}
