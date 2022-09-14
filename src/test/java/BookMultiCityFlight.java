import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class BookMultiCityFlight extends DriverSetUp {
    public BookMultiCityFlight(WebDriver driver){
        this.driver = driver;
    }

    By profileIcon = By.xpath("//div[@class='image flex-img d-flex align-items-center justify-content-center']");
    By logInIcon = By.xpath("//li[normalize-space()='Log In']");
    By eMail = By.id("email");
    By passWord = By.id("password");
    By logInButton = By.xpath("//button[@type='submit']");
    By multiCity = By.xpath("//span[normalize-space()='Multi-City']");
    By flyingFrom1 = By.xpath("//input[@id='autocomplete0origin']");
    By bkkPopUp = By.xpath("//small[normalize-space()='Thailand, Suvarnabhumi Airport (BKK)']");
    By flyingTo1 = By.xpath("//input[@id='autocomplete0destination']");
    By kuaPopUp = By.xpath("//small[normalize-space()='Malaysia, Kuantan Airport (KUA)']");
    By selectDate1 = By.id("date_input");
    By rightArrow1 = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root mdi mdi-chevron-right']");
    By setDate1 = By.xpath("//td[@aria-label='Monday, October 24, 2022']//span[@class='d'][normalize-space()='24']");
    By passengerArea1 = By.xpath("//div[@class='TravellerCalulate']");
    By cabinClassEconomy1 = By.xpath("//span[normalize-space()='Economy']");
    By flyingFrom2 = By.xpath("//input[@id='autocomplete1origin']");
    By kuaPopUp1 = By.xpath("//small[normalize-space()='Malaysia, Kuantan Airport (KUA)']");
    By flyingTo2 = By.xpath("//input[@id='autocomplete1destination']");
    By sinPopUp = By.xpath("//small[normalize-space()='Singapore, Singapore Changi Airport (SIN)']");
    By selectDate2 = By.xpath("//div[@class='FlightTabs-tabs-content']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]");
    By rightArrow2 = By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root mdi mdi-chevron-right']");
    By setDate2 = By.xpath("//td[@aria-label='Tuesday, October 25, 2022']//span[@class='d'][normalize-space()='25']");
    By searchFlightButtonMultiCity = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained submit-btn fw-600 fz20 MuiButton-containedPrimary']");
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


    public void clickProfileIconMultiCity() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(profileIcon).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void clickSignInIconMultiCity() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(logInIcon).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void eMailLogInMultiCity() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(eMail).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(eMail).sendKeys("csemim18@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void passWordLogInMultiCity() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(passWord).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(passWord).sendKeys("Vugijugi7");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void clickLogInButtonMultiCity() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(logInButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void clickMultiCity() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(28));
        driver.findElement(multiCity).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void inputFlyingFromMultiCity1() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingFrom1).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingFrom1).sendKeys("BKK");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement clickKey1 = driver.findElement(bkkPopUp);
        Actions act1 = new Actions(driver);
        act1.sendKeys(clickKey1, Keys.ARROW_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        act1.sendKeys(clickKey1, Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void inputFlyingToMultiCity1() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingTo1).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingTo1).sendKeys("KUA");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement clickKey2 = driver.findElement(kuaPopUp);
        Actions act2 = new Actions(driver);
        act2.sendKeys(clickKey2, Keys.ARROW_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        act2.sendKeys(clickKey2, Keys.ENTER);
        act2.sendKeys(clickKey2, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void selectDateMultiCity1(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(selectDate1).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(rightArrow1).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(setDate1).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void cabinClassMultiCity1(){
        driver.findElement(passengerArea1).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(cabinClassEconomy1).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }


    public void inputFlyingFromMultiCity2() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(flyingFrom2)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingFrom2).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingFrom2).sendKeys("KUA");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement clickKey1 = driver.findElement(kuaPopUp1);
        Actions act1 = new Actions(driver);
        act1.sendKeys(clickKey1, Keys.ARROW_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        act1.sendKeys(clickKey1, Keys.RETURN);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void inputFlyingToMultiCity2() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingTo2).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(flyingTo2).sendKeys("SIN");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        WebElement clickKey2 = driver.findElement(sinPopUp);
        Actions act2 = new Actions(driver);
        act2.sendKeys(clickKey2, Keys.ARROW_DOWN).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        act2.sendKeys(clickKey2, Keys.ENTER);
        act2.sendKeys(clickKey2, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void selectDateMultiCity2(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        driver.findElement(selectDate2).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//        driver.findElement(rightArrow2).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        wait.until(ExpectedConditions.presenceOfElementLocated(setDate2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(selectDate2).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(rightArrow2).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(setDate2).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
//
//    public void cabinClassMultiCity2(){
//        driver.findElement(cabinClassEconomy).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
//    }

    public void searchFlightButtonMultiCity(){
//        WebElement clickable = driver.findElement(searchFlightButtonMultiCity);
//        new Actions(driver).doubleClick(clickable).perform();
//        clickable.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(searchFlightButtonMultiCity).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }
    public void clickBookButtonMultiCity(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(bookButton));
        driver.findElement(bookButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
    }
    public void passenger1DetailsMultiCity() {
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
    public void confirmBookingMultiCity(){
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
