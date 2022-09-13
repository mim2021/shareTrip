import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class BookRoundTripFlight extends DriverSetUp {
    public BookRoundTripFlight(WebDriver driver) {
        this.driver = driver;
    }

    By profileIcon = By.xpath("//div[@class='image flex-img d-flex align-items-center justify-content-center']");
    By logInIcon = By.xpath("//li[normalize-space()='Log In']");
    By eMail = By.id("email");
    By passWord = By.id("password");
    By logInButton = By.xpath("//button[@type='submit']");
    By flyingFrom = By.id("autocompleteundefined");
    By bkkPopUp = By.xpath("//small[normalize-space()='Thailand, Suvarnabhumi Airport (BKK)']");
    By flyingTo = By.xpath("//input[@class='form-control autocompleteyourdestination']");
    By kuaPopUp = By.xpath("//small[normalize-space()='Malaysia, Kuantan Airport (KUA)']");
    By departOn = By.id("date_input");
    By rightArrow = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root mdi mdi-chevron-right']");
    By departDate = By.xpath("//td[@aria-label='Monday, November 21, 2022']//span[@class='d'][normalize-space()='21']");
//    By returnDateField = By.xpath("//td[@aria-label='Selected. Friday, November 25, 2022']//div[@class='stdate']");
    By returnDate = By.xpath("//td[@aria-label='Friday, November 25, 2022']//div[@class='stdate']");
    By cabinClassEconomy = By.xpath("//span[normalize-space()='Economy']");
    By searchFlightButton = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained submit-btn fw-600 fz20 MuiButton-containedPrimary']");
    By bookButton = By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[3]//a[1]");
    By givenName = By.xpath("//input[@name='givenName']");
    By surName = By.xpath("//input[@name='surName']");
    By titleField = By.xpath("//div[@id='mui-component-select-titleName']");
    By selectMs = By.xpath("//li[normalize-space()='Ms']");
    By phoneNumber = By.xpath("//input[@name='mobileNumber']");
    By dateOfBirthField = By.xpath("//div[@class='react-datepicker__input-container']//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl']");
    By birthYear = By.xpath("//select[@class='react-datepicker__year-select']");
    By birthMonth = By.xpath("//select[@class='react-datepicker__month-select']");
    By birthDate = By.xpath("//div[@aria-label='Choose Saturday, October 18th, 1980']");
    By postCode = By.xpath("//input[@name='postCode']");
    By clickAgreeCheckbox = By.xpath("//input[@name='checkedB']");
    By payNowButton = By.xpath("//span[normalize-space()='Pay now']");
    By passportNumber = By.xpath("//input[@name='passportNumber']");



    public void clickProfileIconRoundTrip() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(profileIcon).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void clickSignInIconRoundTrip() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(logInIcon).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void eMailLogInRoundTrip() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(eMail).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(eMail).sendKeys("csemim18@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void passWordLogInRoundTrip() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(passWord).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(passWord).sendKeys("Vugijugi7");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void clickLogInButtonRoundTrip() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(logInButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void inputFlyingFromRoundTrip() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingFrom).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingFrom).sendKeys("BKK");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement clickKey1 = driver.findElement(bkkPopUp);
        Actions act1 = new Actions(driver);
        act1.sendKeys(clickKey1, Keys.ARROW_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        act1.sendKeys(clickKey1, Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void inputFlyingToRoundTrip() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingTo).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingTo).sendKeys("KUA");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement clickKey2 = driver.findElement(kuaPopUp);
        Actions act2 = new Actions(driver);
        act2.sendKeys(clickKey2, Keys.ARROW_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        act2.sendKeys(clickKey2, Keys.ENTER);
        act2.sendKeys(clickKey2, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void setDateRoundTrip(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(departOn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(rightArrow).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(departDate).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        driver.findElement(returnDateField).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        Actions act = new Actions(driver);
//        act.doubleClick(driver.findElement(returnDate)).click();
        driver.findElement(returnDate).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void cabinClassRoundTrip(){
        driver.findElement(cabinClassEconomy).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void searchFlightRoundTrip(){
        WebElement clickable = driver.findElement(searchFlightButton);
        new Actions(driver).doubleClick(clickable).perform();
        clickable.click();
    }
    public void clickBookButtonRoundTrip(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(bookButton));
        driver.findElement(bookButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }

    public void passenger1DetailsRoundTrip() {
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
        driver.findElement(surName).sendKeys("Mim");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(phoneNumber).click();
        driver.findElement(phoneNumber).sendKeys("01234567891");
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
        driver.findElement(passportNumber).sendKeys("AB457862");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }
    public void confirmBookingRoundTrip(){
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        js1.executeScript("window.scrollBy(0,450)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(clickAgreeCheckbox).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.findElement(payNowButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }



}

