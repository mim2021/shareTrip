import org.testng.annotations.Test;

public class BookMultiCityFlightTest extends DriverSetUp {
    @Test
    public void flightBookingMultiCity() throws InterruptedException {
        BookMultiCityFlight multiCityFlightBooking = new BookMultiCityFlight(driver);
        multiCityFlightBooking.clickProfileIconMultiCity();
        multiCityFlightBooking.clickSignInIconMultiCity();
        multiCityFlightBooking.eMailLogInMultiCity();
        multiCityFlightBooking.passWordLogInMultiCity();
        multiCityFlightBooking.clickLogInButtonMultiCity();
        multiCityFlightBooking.clickMultiCity();
        multiCityFlightBooking.inputFlyingFromMultiCity1();
        multiCityFlightBooking.inputFlyingToMultiCity1();
        multiCityFlightBooking.selectDateMultiCity1();
        multiCityFlightBooking.cabinClassMultiCity1();
        multiCityFlightBooking.inputFlyingFromMultiCity2();
        multiCityFlightBooking.inputFlyingToMultiCity2();
        multiCityFlightBooking.selectDateMultiCity2();
        multiCityFlightBooking.searchFlightButtonMultiCity();
        multiCityFlightBooking.clickBookButtonMultiCity();
        multiCityFlightBooking.passenger1DetailsMultiCity();
        multiCityFlightBooking.confirmBookingMultiCity();
        Thread.sleep(5000);
    }
}