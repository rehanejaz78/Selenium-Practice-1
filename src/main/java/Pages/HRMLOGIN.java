package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.security.PublicKey;
import java.time.Duration;

public class HRMLOGIN {

    By username = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");

    By loginButton = By.cssSelector("button[type='submit']");

    WebDriver driver;


    public HRMLOGIN(WebDriver driver){
        this.driver= driver;
    }

    public void enterUsername() throws InterruptedException {

      Thread.sleep(2000);

        driver.findElement(username).sendKeys("Admin");
    }

    public void waitForWebElementToAppear(WebElement findBy) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(32));
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }

    public void enterPassword(){
        driver.findElement(password).sendKeys("admin123");
    }

    public void clickLoginbtn(){
        driver.findElement(loginButton).click();


    }


    public void verifyUserLoggedIn(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    }


}
