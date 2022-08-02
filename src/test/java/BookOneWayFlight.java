
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import org.openqa.selenium.support.FindBy;


public class BookOneWayFlight extends DriverSetUp {
    public  BookOneWayFlight(WebDriver driver) {
        this.driver = driver;
    }

    By profileIcon = By.xpath("//div[@class='image flex-img d-flex align-items-center justify-content-center']");
//    @FindBy(xpath = "//div[@class='image flex-img d-flex align-items-center justify-content-center']")
//    WebElement profileIcon;

    By signInIcon = By.xpath("//li[contains(text(),'Sign In')]");
    By eMail = By.id("loginEmail");
    By passWord = By.id("loginPassword");
    By logInButton = By.xpath("//button[@type='submit']");
    By oneWayTab = By.xpath("//span[normalize-space()='One Way']");
    By flyingFromOneWayTab = By.id("autocompleteundefined");
    By flyingToOneWayTab = By.xpath("//input[@class='form-control autocompleteyourdestination']");
    By selectDateOneWayTab = By.id("date_input");
    By rightArrowOneWayTab = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root mdi mdi-chevron-right']");
    By setDateOneWayTab = By.xpath("//td[@aria-label='Thursday, September 8, 2022']//div[@class='stdate']");

    By increaseAdultOneWayTab = By.xpath("/html[1]/body[1]/div[6]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]");
    By increaseChildOneWayTab = By.xpath("/html[1]/body[1]/div[6]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]");

    By childBirthDateInputOneWayTab = By.xpath("/html[1]/body[1]/div[6]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]");
    By childBirthMonthDropDownOneWayTab = By.xpath("//select[@class='react-datepicker__month-select']");
    By childBirthYearDropDownOneWayTab = By.xpath("//select[@class='react-datepicker__year-select']");

    By increaseInfantOneWayTab = By.xpath("/html[1]/body[1]/div[6]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[2]/button[2]");

    By cabinClassBusinessOneWayTab = By.xpath("//span[normalize-space()='Business']");
    By searchFlightButtonOneWayTab = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained submit-btn fw-600 fz20 MuiButton-containedPrimary']");
    public void clickProfileIcon() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(profileIcon).click();
//        profileIcon.click();
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
        driver.findElement(flyingFromOneWayTab).sendKeys("DAX");
        WebElement clickable = driver.findElement(flyingFromOneWayTab);
        new Actions(driver).click(clickable).perform();
//        WebElement clickable = driver.findElement(flyingFromOneWayTab);
//        new Actions(driver).doubleClick(clickable).perform();
    }

    public void inputFlyingToOneWayTab() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingToOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingToOneWayTab).sendKeys("BKK");
        WebElement clickable = driver.findElement(flyingToOneWayTab);
        new Actions(driver).click(clickable).perform();
    }
    public void selectDateOneWayTab(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(selectDateOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(rightArrowOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(setDateOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }
    public void passengerNumberOneWayTab() {
        driver.findElement(increaseAdultOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(increaseChildOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(childBirthDateInputOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Select childBirthMonthDropDownOneWayTab1 = new Select(driver.findElement(childBirthMonthDropDownOneWayTab));
        childBirthMonthDropDownOneWayTab1.selectByVisibleText("October");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Select childBirthYearDropDownOneWayTab1 = new Select(driver.findElement(childBirthYearDropDownOneWayTab));
        childBirthYearDropDownOneWayTab1.selectByVisibleText("2016");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(increaseInfantOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }
    public void cabinClassOneWayTab(){
        driver.findElement(cabinClassBusinessOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void searchFlightOneWayTab(){
        WebElement clickable = driver.findElement(searchFlightButtonOneWayTab);
        new Actions(driver).doubleClick(clickable).perform();
    }

}
