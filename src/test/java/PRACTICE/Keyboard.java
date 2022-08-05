package PRACTICE;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;

public class Keyboard {


    @Test
    public void moveToElement(WebDriver driver){


        WebElement name = driver.findElement(By.id("name"));
        //Actions action = new Actions(driver) ;
       // action.moveToElement(name);
        name.sendKeys("rehan ejaz");

        WebElement date = driver.findElement(By.id("date"));

        date.sendKeys("04/05/2022");

        terminate(driver);


    }

    @AfterClass
    public void terminate(WebDriver driver)
    {
        driver.quit();
    }



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/rehanejaz/Trainings/Selenium/SeleniumPractice/src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");

        driver.manage().window().maximize();

        Keyboard obj = new Keyboard();

        //obj.getAtags(driver);
      obj.alertclick(driver);

       // obj.moveToElement(driver);

        //obj.terminate(driver);

    }

    private void alertclick(WebDriver driver) {

        WebElement alert = driver.findElement(By.id("alert-button"));
        alert.click();

        Alert alert1 = driver.switchTo().alert();

        alert1.accept();

        driver.quit();

    }

    private void getAtags(WebDriver driver) {

        List<WebElement> tags = driver.findElements(By.tagName("a"));

        System.out.println("tags : " +tags.size() );

    }
}


