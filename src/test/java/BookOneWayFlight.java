
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class BookOneWayFlight extends DriverSetUp {
    public  BookOneWayFlight(WebDriver driver) {
        this.driver = driver;
    }

    By profileIcon = By.xpath("//div[@class='image flex-img d-flex align-items-center justify-content-center']");
    By logInIcon = By.xpath("//li[normalize-space()='Log In']");
    By eMail = By.id("email");
    By passWord = By.id("password");
    By logInButton = By.xpath("//button[@type='submit']");
    By oneWayTab = By.xpath("//span[normalize-space()='One Way']");
    By flyingFromOneWayTab = By.id("autocompleteundefined");
    By bkkPopUp = By.xpath("//small[normalize-space()='Thailand, Suvarnabhumi Airport (BKK)']");
    By flyingToOneWayTab = By.xpath("//input[@class='form-control autocompleteyourdestination']");
    By kuaPopUp = By.xpath("//small[normalize-space()='Malaysia, Kuantan Airport (KUA)']");
    By selectDateOneWayTab = By.id("date_input");
    By rightArrowOneWayTab = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root mdi mdi-chevron-right']");
    By setDateOneWayTab = By.xpath("//td[@aria-label='Monday, October 24, 2022']//span[@class='d'][normalize-space()='24']");
//    By increaseAdultOneWayTab = By.xpath("//body[1]/div[7]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]");
//    By increaseChildOneWayTab = By.xpath("//body[1]/div[7]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]");
//    By childBirthDateInputOneWayTab = By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl']");
//    By childBirthMonthDropDownOneWayTab = By.xpath("//select[@class='react-datepicker__month-select']");
//    By childBirthYearDropDownOneWayTab = By.xpath("//select[@class='react-datepicker__year-select']");
//    By increaseInfantOneWayTab = By.xpath("//body[1]/div[7]/div[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[4]/div[2]/button[2]");
    By cabinClassEconomyOneWayTab = By.xpath("//span[normalize-space()='Economy']");
    By searchFlightButtonOneWayTab = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained submit-btn fw-600 fz20 MuiButton-containedPrimary']");
    By bookButtonOneWayTab = By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[3]//a[1]");
    By givenName = By.xpath("//input[@name='givenName']");
    By surName = By.xpath("//input[@name='surName']");
    By titleField = By.xpath("//div[@id='mui-component-select-titleName']");
    By selectMs = By.xpath("//li[normalize-space()='Ms']");
    By phoneNumber = By.xpath("//input[@name='mobileNumber']");
    By dateOfBirthField = By.xpath("//input[@value='12/09/2022']");
    By birthYear = By.xpath("//select[@class='react-datepicker__year-select']");
    By birthMonth = By.xpath("//select[@class='react-datepicker__month-select']");
    By birthDate = By.xpath("//div[@aria-label='Choose Saturday, October 18th, 1980']");
    By postCode = By.xpath("//input[@name='postCode']");

    public void clickProfileIcon() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(profileIcon).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void clickSignInIcon() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(logInIcon).click();
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
        driver.findElement(flyingFromOneWayTab).sendKeys("BKK");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement clickKey1 = driver.findElement(bkkPopUp);
        Actions act1 = new Actions(driver);
        act1.sendKeys(clickKey1, Keys.ARROW_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        act1.sendKeys(clickKey1, Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void inputFlyingToOneWayTab() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingToOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingToOneWayTab).sendKeys("KUA");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement clickKey2 = driver.findElement(kuaPopUp);
        Actions act2 = new Actions(driver);
        act2.sendKeys(clickKey2, Keys.ARROW_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        act2.sendKeys(clickKey2, Keys.ENTER);
        act2.sendKeys(clickKey2, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
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
//    public void passengerNumberOneWayTab() {
//        driver.findElement(increaseAdultOneWayTab).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        driver.findElement(increaseChildOneWayTab).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        driver.findElement(childBirthDateInputOneWayTab).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        Select childBirthMonthDropDownOneWayTab1 = new Select(driver.findElement(childBirthMonthDropDownOneWayTab));
//        childBirthMonthDropDownOneWayTab1.selectByVisibleText("November");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        Select childBirthYearDropDownOneWayTab1 = new Select(driver.findElement(childBirthYearDropDownOneWayTab));
//        childBirthYearDropDownOneWayTab1.selectByVisibleText("2016");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        driver.findElement(increaseInfantOneWayTab).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//    }
    public void cabinClassOneWayTab(){
        driver.findElement(cabinClassEconomyOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void searchFlightOneWayTab(){
        WebElement clickable = driver.findElement(searchFlightButtonOneWayTab);
        new Actions(driver).doubleClick(clickable).perform();
        clickable.click();
    }
    public void clickBookButtonOneWayTab(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(bookButtonOneWayTab));
        driver.findElement(bookButtonOneWayTab).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }

    public void passenger1Details(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        ArrayList<String> currentWindow = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(currentWindow.get(1));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(titleField));
        driver.findElement(titleField).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(selectMs).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(givenName).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(givenName).sendKeys("Jannatul");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(surName).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        WebElement clickSurName1 = driver.findElement(surName);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        Actions act1 = new Actions(driver);
        act1.sendKeys(clickSurName1, Keys.BACK_SPACE).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        act1.sendKeys(clickSurName1, Keys.BACK_SPACE).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(surName).sendKeys("Mim");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,450)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(phoneNumber).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(dateOfBirthField).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        Select drpBirthYear = new Select(driver.findElement(birthYear));
        drpBirthYear.selectByVisibleText("1980");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        Select drpBirthDate = new Select(driver.findElement(birthMonth));
        drpBirthDate.selectByVisibleText("October");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(birthDate).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(postCode).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(postCode).sendKeys("1349");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));





//        driver.findElement(postCode1).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        driver.findElement(postCode1).sendKeys("1349");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
}
