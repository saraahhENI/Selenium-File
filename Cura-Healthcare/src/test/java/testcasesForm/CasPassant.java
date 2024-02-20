package testcasesForm;

import factory.BaseTest;
import factory.Facility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppointmentForm;
import pages.HomePage;
import pages.LoginPage;
import pages.Menu;

public class CasPassant extends BaseTest {

    private AppointmentForm appointmentForm;
    private LoginPage loginPage;
    private Menu menuPage;
    private HomePage homePage;

    @BeforeMethod
    public void settings(){
        appointmentForm = new AppointmentForm(driver);
        loginPage = new LoginPage(driver);
        menuPage = new Menu(driver);
        homePage = new HomePage(driver);
        driver.get(LoginPage.URL);
        menuPage.getMenuBurger().click();
        menuPage.getLoginMenu().click();
    }

    @Test
    public void verifyPassingForm() {
        loginPage.fillConnectionData("John Doe", "ThisIsNotAPassword");
        appointmentForm.fillMedicalForm(Facility.SEOUL,"none","true","12/12/2024","This is my comment");
        appointmentForm.getTitleForm();
    }

}
