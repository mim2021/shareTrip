import org.testng.annotations.Test;

public class BookRoundTripFlightTest extends DriverSetUp{
    @Test(priority = 0)
    public void flightBookingRoundTrip() throws InterruptedException {
        BookRoundTripFlight roundTripFlightBooking = new BookRoundTripFlight(driver);
        roundTripFlightBooking.clickProfileIconRoundTrip();
        roundTripFlightBooking.clickSignInIconRoundTrip();
        roundTripFlightBooking.eMailLogInRoundTrip();
        roundTripFlightBooking.passWordLogInRoundTrip();
        roundTripFlightBooking.clickLogInButtonRoundTrip();
        roundTripFlightBooking.inputFlyingFromRoundTrip();
        roundTripFlightBooking.inputFlyingToRoundTrip();
        roundTripFlightBooking.inputFlyingToRoundTrip();
        roundTripFlightBooking.setDateRoundTrip();
        roundTripFlightBooking.cabinClassRoundTrip();
        roundTripFlightBooking.searchFlightRoundTrip();
        roundTripFlightBooking.clickBookButtonRoundTrip();
        roundTripFlightBooking.passenger1DetailsRoundTrip();
        roundTripFlightBooking.confirmBookingRoundTrip();
    }
}
