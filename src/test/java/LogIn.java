import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LogIn extends DriverSetUp {
    public LogIn(WebDriver driver) {
        this.driver = driver;
    }

    By profileIcon = By.xpath("//div[@class='image flex-img d-flex align-items-center justify-content-center']");
    By signInIcon = By.xpath("//li[contains(text(),'Sign In')]");
    By eMail = By.id("loginEmail");
    By passWord = By.id("loginPassword");
    By logInButton = By.xpath("//button[@type='submit']");
    By oneWayTab = By.xpath("//span[normalize-space()='One Way']");
    By flyingFromOneWayTab = By.id("autocompleteundefined");
    By flyingToOneWayTab = By.xpath("//input[@class='form-control autocompleteyourdestination']");
    By selectDate = By.id("date_input");


    public void clickProfileIcon() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(profileIcon).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void clickSignInIcon() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(signInIcon).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void eMailLogIn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(eMail).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(eMail).sendKeys("mim@sharetrip.net");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void passWordLogIn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(passWord).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(passWord).sendKeys("vugijugi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void clickLogInButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(logInButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }
    public void clickOneWayTab() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
        driver.findElement(oneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void inputFlyingFromOneWayTab() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingFromOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingFromOneWayTab).sendKeys("DAX", Keys.ENTER);
    }

    public void inputFlyingToOneWayTab() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingToOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingToOneWayTab).sendKeys("BKK", Keys.ENTER);
    }
    public void selectDateOneWayTab(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(selectDate).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }




}