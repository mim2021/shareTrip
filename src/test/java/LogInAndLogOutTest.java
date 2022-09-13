import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogInAndLogOutTest extends DriverSetUp {
    public void LogInAndLogOutTest(WebDriver driver){
        this.driver=driver;
    }

    @Test(priority = 0)
    public void logInTestRun() throws InterruptedException {
        LogInLogOut login = new LogInLogOut(driver);
        login.clickProfileIcon();
        login.clickSignInIcon();
//        Thread.sleep(1000);
        login.eMailLogIn();
//        Thread.sleep(1000);
        login.passWordLogIn();
//        Thread.sleep(1000);
        login.clickLogInButton();
//        Thread.sleep(1000);
    }
    @Test(priority = 1)
    public void logOutTestRun() throws InterruptedException {
        LogInLogOut logout = new LogInLogOut(driver);
        logout.clickLogOut();

    }
}
