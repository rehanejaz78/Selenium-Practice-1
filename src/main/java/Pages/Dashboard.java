package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {

    By admin = By.id("menu_admin_viewAdminModule");
    By adduser = By.id("btnAdd");

    By name = By.id("systemUser_employeeName_empName");
    By uname = By.id("systemUser_userName");
    By password = By.id("systemUser_password");
    By c_password = By.id("systemUser_confirmPassword");
    By saveBtn = By.id("btnSave");
    WebDriver driver;
    By dropdownClick = By.id("systemUser_userType");

    public Dashboard(WebDriver driver) {
        this.driver = driver;
    }
    public void adduser(){
        driver.findElement(adduser).click();
    }
    public void clickAdmin(){
        driver.findElement(admin).click();
    }

    public void selectDDoption() throws InterruptedException {
        Thread.sleep(2000);

        WebElement abc = driver.findElement(dropdownClick);
        Select admin = new Select(abc);
        admin.selectByVisibleText("Admin");
    }

    public void ename() {
        driver.findElement(name).sendKeys("rehan");
    }

    public void username() {
        driver.findElement(uname).sendKeys("rehanrehan");
    }

    public void password() {
        driver.findElement(password).sendKeys("rehanR@1ehan");
    }

    public void ConfirmPassword() {
        driver.findElement(c_password).sendKeys("rehanR@1ehan");
    }

    public void setSaveBtn() {
        driver.findElement(saveBtn).click();
    }


}
