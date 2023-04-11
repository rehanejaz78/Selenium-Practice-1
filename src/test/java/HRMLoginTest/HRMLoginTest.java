package HRMLoginTest;

import Pages.Dashboard;
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

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    }


    @Test(priority = 1)
    public void login() throws InterruptedException {
        HRMLOGIN hrmlogin = new HRMLOGIN(driver);
        hrmlogin.enterUsername();
        hrmlogin.enterPassword();
        hrmlogin.clickLoginbtn();
        hrmlogin.verifyUserLoggedIn();
    }

    @Test(priority = 2)
    public void newUserTest() throws InterruptedException {
        Dashboard obj = new Dashboard(driver);
        obj.clickAdmin();
        obj.adduser();
        obj.selectDDoption();
        obj.ename();
        obj.username();
        obj.password();
        obj.ConfirmPassword();
        obj.setSaveBtn();


    }

    @AfterClass
    public void terdown(){
        System.out.println("Completed successfully !! ");
        driver.quit();
    }
}
