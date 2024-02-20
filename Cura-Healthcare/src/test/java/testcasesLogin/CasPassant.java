package testcasesLogin;
import factory.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.Menu;

public class CasPassant extends BaseTest {
    private LoginPage loginPage;
    private Menu menuPage;
    private HomePage homePage;

    @BeforeMethod
    public  void injecter(){
        loginPage = new LoginPage(driver);
        menuPage = new Menu(driver);
        homePage = new HomePage(driver);
        driver.get(LoginPage.URL);
        menuPage.getMenuBurger().click();
        menuPage.getLoginMenu().click();
    }
    @Test
    public void verifyValidCase(){
        driver.get(LoginPage.URI_LOGIN);
        loginPage.getTitleConnection();
        loginPage.fillConnectionData("John Doe", "ThisIsNotAPassword");
        homePage.getMakeAppointment();
    }
}
