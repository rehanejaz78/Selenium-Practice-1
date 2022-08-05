package GooglePage;

import Pages.GoogleSearchObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class googleSearch {


    static WebDriver driver = null ;

@BeforeClass
    public static void Setup(){

        WebDriverManager.chromedriver().setup();
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        GoogleSearchObjects obj = new GoogleSearchObjects(driver);
        driver.get("https://www.google.com");


    }

    @Test (priority = 1)
    public void Google(){

    GoogleSearchObjects obj = new GoogleSearchObjects(driver);

    obj.enterSearchText("Rehan Ejaz");
    obj.setSearchButton();

    }

    @AfterClass
    public void tearDown(){

    driver.quit();
    }


}
