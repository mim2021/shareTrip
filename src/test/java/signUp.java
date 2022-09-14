import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class signUp extends DriverSetUp {
    public signUp(WebDriver driver){
        this.driver = driver;
    }
    By profileIcon = By.xpath("//div[@class='image flex-img d-flex align-items-center justify-content-center']");
    By selectCreateAccount = By.xpath("//li[contains(text(),'Create An Account')]");
    By eMailCA = By.xpath("//input[@id='email']");
    By passWordCA = By.xpath("//input[@id='password']");
    By passwordConfirmationCA = By.xpath("//input[@id='password_confirmation']");
    By signUpButton = By.xpath("//button[@type='submit']");

    public void clickCA(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(profileIcon).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(selectCreateAccount).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }
    public void createAccountInformation(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(eMailCA).sendKeys("anowaraHaque7@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(passWordCA).sendKeys("M982$uYw");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(passwordConfirmationCA).sendKeys("M982$uYw");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.findElement(signUpButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

}
