import org.testng.annotations.Test;

public class BookOneWayFlightTest extends DriverSetUp {

    @Test(priority = 0)
    public void flightBookingOneWay() throws InterruptedException {
        BookOneWayFlight oneWayFlightBooking = new BookOneWayFlight(driver);
        oneWayFlightBooking.clickProfileIconOneWay();
        oneWayFlightBooking.clickSignInIconOneWayTab();
        oneWayFlightBooking.eMailLogInOneWayTab();
        oneWayFlightBooking.passWordLogInOneWayTab();
        oneWayFlightBooking.clickLogInButtonOneWayTab();
        oneWayFlightBooking.clickOneWayTabOneWayTab();
        oneWayFlightBooking.inputFlyingFromOneWayTab();
        oneWayFlightBooking.inputFlyingToOneWayTab();
        oneWayFlightBooking.selectDateOneWayTab();
        oneWayFlightBooking.cabinClassOneWayTab();
        oneWayFlightBooking.searchFlightOneWayTab();
        oneWayFlightBooking.clickBookButtonOneWayTab();
        oneWayFlightBooking.passenger1DetailsOneWayTab();
        oneWayFlightBooking.confirmBookingOneWayTab();
    }

}
