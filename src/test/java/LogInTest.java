import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogInTest extends DriverSetUp {
    public void LogInTest(WebDriver driver){
        this.driver=driver;
    }

    @Test
    public void logInTestRun() throws InterruptedException {
        LogIn login = new LogIn(driver);
        login.clickProfileIcon();
        login.clickSignInIcon();
        Thread.sleep(1000);
        login.eMailLogIn();
        Thread.sleep(1000);
        login.passWordLogIn();
        Thread.sleep(1000);
        login.clickLogInButton();
        Thread.sleep(1000);



//        login.clickOneWayTab();
        System.out.println("Successfully Running");

    }

}
