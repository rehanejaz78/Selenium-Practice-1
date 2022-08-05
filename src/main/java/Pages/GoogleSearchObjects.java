package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class GoogleSearchObjects {

    //we will get the locators

    By searchbar = By.name("q");
    By  searchButton = By.xpath("(//input[@name='btnK'])[2]");
    WebDriver driver;
    public GoogleSearchObjects(WebDriver driver){
        this.driver = driver;
    }

    public void enterSearchText(String text){
        driver.findElement(searchbar).sendKeys(text);

    }

    public void setSearchButton (){
        driver.findElement(searchButton).sendKeys(Keys.RETURN);
    }



}
