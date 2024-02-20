import factory.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FormPage;

import java.time.Duration;

public class NonPassant extends BaseTest {
    private FormPage formPage;

    @BeforeMethod
    public void injectDriver(){
        formPage = new FormPage(driver);
        driver.get(Config.URL);
    }

    @Test
    public void verifyCaseWithoutEmail() throws InterruptedException {

        formPage.fillFormWithData("John", "Doe", "", "Le Sujet", "My message is right here.");
        String errorSubmit = formPage.getErrorMailMessage().getText();
        Assert.assertEquals(errorSubmit, "This field is required");
    }

    @Test
    public void verifyCaseWithoutLastname() throws InterruptedException {

        formPage.fillFormWithData("John", "", "John.Doe@orange.fr", "Le Sujet", "My message is right here.");
        String errorSubmit = formPage.getErrorLastnameMessage().getText();
        Assert.assertEquals(errorSubmit, "This field is required");
    }

    @Test
    public void verifyCaseWithoutMessage() throws InterruptedException {

        formPage.fillFormWithData("John", "Doe", "john.doe@gmail.com", "Le Sujet", "");
        String errorSubmit = formPage.getErrorMessageMessage().getText();
        Assert.assertEquals(errorSubmit, "This field is required");
    }
}
