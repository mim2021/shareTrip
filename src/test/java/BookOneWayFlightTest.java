import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import javax.swing.*;

public class BookOneWayFlightTest extends DriverSetUp{

    @Test(priority = 0)
    public void flightBookingOneWay() throws InterruptedException {
        BookOneWayFlight oneWayFlightBooking = new BookOneWayFlight(driver);
        oneWayFlightBooking.clickProfileIcon();
        oneWayFlightBooking.clickSignInIcon();
        Thread.sleep(1000);
        oneWayFlightBooking.eMailLogIn();
        Thread.sleep(1000);
        oneWayFlightBooking.passWordLogIn();
        Thread.sleep(1000);
        oneWayFlightBooking.clickLogInButton();
        Thread.sleep(1000);
        oneWayFlightBooking.clickOneWayTab();
        Thread.sleep(1000);
        oneWayFlightBooking.inputFlyingFromOneWayTab();
        Thread.sleep(1000);
        oneWayFlightBooking.inputFlyingToOneWayTab();
        Thread.sleep(1000);
        oneWayFlightBooking.selectDateOneWayTab();
        Thread.sleep(2000);
        oneWayFlightBooking.passengerNumberOneWayTab();
        Thread.sleep(2000);
        oneWayFlightBooking.cabinClassOneWayTab();
        Thread.sleep(2000);
        oneWayFlightBooking.searchFlightOneWayTab();
        Thread.sleep(15000);
        oneWayFlightBooking.clickBookButtonOneWayTab();
        Thread.sleep(2000);

    }


}
