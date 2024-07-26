package Tests_Spicejet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{

    @Test
    public void testLogin() throws InterruptedException {
        loginPage.setLoginButton();
        Thread.sleep(3000);
        loginPage.setEmailRadioButton();
        loginPage.setEmail("Saranya291295@gmail.com");
        loginPage.setPassword("Saranya@29cse");
        loginPage.setSubmitButton();
        String expectedValue= "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
        String actualValue = driver.getTitle();
        Assert.assertEquals(expectedValue,actualValue);

    }
}
