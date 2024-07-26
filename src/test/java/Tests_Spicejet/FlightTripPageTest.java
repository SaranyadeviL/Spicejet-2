package Tests_Spicejet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightTripPageTest extends  BaseTest{

    @Test
    public void toFlightTripPage() throws InterruptedException {
        flightTripPage.setOneTrip();
        flightTripPage.setDeparture();
        flightTripPage.setSelectDelhi();
        flightTripPage.setDestination();
        flightTripPage.setSelectMumbai();
        Thread.sleep(3000);

        flightTripPage.setDepartureDate();
        flightTripPage.setReturnDate();
        flightTripPage.setReturnDay();
        flightTripPage.setPassengers();
        flightTripPage.setPassengers1();
        flightTripPage.setSearchFlight();
        Thread.sleep(7000);

        flightTripPage.setContinueButton();
        Thread.sleep(9000);

        bookingPage.setFirstName("SaranyaDevi");
        bookingPage.setLastName("L");
        bookingPage.setMobileNumber("7373329541");
        bookingPage.setEmailId("saranya291295@gmail.com");

        //bookingPage.setCountryMenu();
        bookingPage.setTownCity("Coimbatore");

        //Adding passenger details
        bookingPage.setF_Name("Saranya");
        bookingPage.setL_Name("L");
        bookingPage.setM_Number("1248671562");

        //bookingPage.setClickNext();
        bookingPage.setContinue();
        Thread.sleep(3000);
        Thread.sleep(6000);

        //WebDriverWait wait = new  WebDriverWait (driver, Duration.ofSeconds(40));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("img"))).click();
        String str = driver.getCurrentUrl();
        Assert.assertEquals(str,"https://www.spicejet.com/booking/addons");


    }

    @Test
    public void toFlightTrip1() throws InterruptedException {
        flightTrip.setRoundTrip();
        flightTrip.setDeparture();
        flightTrip.setSelectDelhi();
        flightTrip.setDestination();
        flightTrip.setSelectMumbai();
        Thread.sleep(3000);
        flightTrip.setDepartureDate();
        flightTrip.setReturnDate();
        flightTrip.setReturnDay();
        flightTrip.setPassengers();
        flightTrip.setPassengers1();
        flightTrip.setSearchFlight();
        Thread.sleep(7000);
        flightTrip.setContinueButton();
        Thread.sleep(9000);
        bookingPage.setFirstName("Sowmya");
        bookingPage.setLastName("Bala");
        bookingPage.setMobileNumber("123456789");
        bookingPage.setEmailId("Sowmya123@gmail.com");
        //bookingPage.setCountryMenu();
        bookingPage.setTownCity("Chennai");
        //Adding passenger details
        bookingPage.setF_Name("Sowmya");
        bookingPage.setL_Name("R");
        bookingPage.setM_Number("123456789");
        //bookingPage.setClickNext();
        bookingPage.setContinue();
        Thread.sleep(6000);
        //WebDriverWait wait = new  WebDriverWait (driver, Duration.ofSeconds(40));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("img"))).click();
        String str = driver.getCurrentUrl();
        Assert.assertEquals(str,"https://www.spicejet.com/booking/addons");


    }
    @Test
    public void validatingOneWayAndRoundWay(){
        String expectedValue = "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
        String actualValue = driver.getTitle();
        Assert.assertEquals(actualValue,expectedValue);
    }

}
