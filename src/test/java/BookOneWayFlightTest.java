import org.testng.annotations.Test;
public class BookOneWayFlightTest extends DriverSetUp {
    @Test
    public void flightBookingOneWay() throws InterruptedException {
        BookOneWayFlight oneWayFlightBooking = new BookOneWayFlight(driver);
        oneWayFlightBooking.clickProfileIconOneWay();
        oneWayFlightBooking.clickSignInIconOneWay();
        oneWayFlightBooking.eMailLogInOneWay();
        oneWayFlightBooking.passWordLogInOneWay();
        oneWayFlightBooking.clickLogInButtonOneWay();
        oneWayFlightBooking.clickOneWayTabOneWay();
        oneWayFlightBooking.inputFlyingFromOneWay();
        oneWayFlightBooking.inputFlyingToOneWay();
        oneWayFlightBooking.selectDateOneWay();
        oneWayFlightBooking.cabinClassOneWay();
        oneWayFlightBooking.searchFlightOneWay();
        oneWayFlightBooking.clickBookButtonOneWay();
        oneWayFlightBooking.passenger1DetailsOneWay();
        oneWayFlightBooking.confirmBookingOneWay();
        Thread.sleep(5000);
    }

}
