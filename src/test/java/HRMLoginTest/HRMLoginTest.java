package HRMLoginTest;

import Pages.GoogleSearchObjects;
import Pages.HRMLOGIN;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HRMLoginTest {


    static WebDriver driver = null;

    @BeforeClass
    public static void Setup() {

        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");


    }


    @Test
    public void login() {
        HRMLOGIN hrmlogin = new HRMLOGIN(driver);
        hrmlogin.enterUsername();
        hrmlogin.enterPassword();
        hrmlogin.clickLoginbtn();
    }


    @AfterClass
    public void terdown(){
        System.out.println("Completed successfully !! ");
        driver.quit();
    }
}
