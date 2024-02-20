import factory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FormPage;

import java.time.Duration;

public class Passant extends BaseTest {
    private FormPage formPage;

    @BeforeMethod
    public void injectDriver(){
        formPage = new FormPage(driver);
        driver.get(Config.URL);
    }

    @Test (dataProvider = "passing-form")
    public void verifyValidCase(String firstName, String lastName, String email, String subject, String message) throws InterruptedException {
        //formPage.fillFormWithData("John", "Doe", "John.Doe@orange.fr", "Le Sujet", "My message is right here.");

        // If I want to use the DDT, put the parameter in the method up there. And add the data provider near the @Test. Make a function for this DataProviser.
        formPage.fillFormWithData(firstName, lastName, email, subject, message);
        checkMessage();
    }

   @Test
    public void verifyCaseWithoutFirstname() throws InterruptedException {
       formPage.fillFormWithData("", "Doe", "John.Doe@orange.fr", "Le Sujet", "My message is right here.");
        checkMessage();
    }

    @Test
    public void verifyCaseWithoutSubject() throws InterruptedException {
        formPage.fillFormWithData("John", "Doe", "John.Doe@orange.fr", "", "My message is right here.");
        checkMessage();
    }

    @Test
    public void verifyCaseWithoutUnRequired() throws InterruptedException {
        formPage.fillFormWithData("", "Doe", "John.Doe@orange.fr", "", "My message is right here.");
        checkMessage();
    }

    public void checkMessage() throws InterruptedException {
        String successSubmit = formPage.getSuccessMessage().getText();
        Assert.assertEquals(successSubmit, "Thank you for your message. We will get in touch with you shortly");
    }

    // This is to make a DDT test. I will use those data in the test case I want.
    @DataProvider(name="passing-form")
    public Object[][] dataProviderMethod(){
        return new Object[][]{
                {"John","Doe","John.Doe@orange.fr", "", "My message is right here." },
                {"John", "Doe", "John.Doe@orange.fr", "sujet", "My message is right here."}
        };
    }

}
