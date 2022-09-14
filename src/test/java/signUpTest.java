import org.testng.annotations.Test;

public class signUpTest extends DriverSetUp{
    @Test
    public void accountCreation() throws InterruptedException {
        signUp createAccount = new signUp(driver);
        createAccount.clickCA();
        createAccount.createAccountInformation();
        Thread.sleep(2000);
    }
}
