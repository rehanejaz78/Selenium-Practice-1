package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.security.PublicKey;
import java.time.Duration;

public class HRMLOGIN {

    By username = By.id("txtUsername");
    By password = By.id("txtPassword");

    By loginButton = By.id("btnLogin");

    WebDriver driver;


    public HRMLOGIN(WebDriver driver){
        this.driver= driver;
    }

    public void enterUsername(){
        driver.findElement(username).sendKeys("Admin");
    }

    public void enterPassword(){
        driver.findElement(password).sendKeys("admin123");
    }

    public void clickLoginbtn(){
        driver.findElement(loginButton).click();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("welcome")));


    }


    public void verifyUserLoggedIn(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }


}
