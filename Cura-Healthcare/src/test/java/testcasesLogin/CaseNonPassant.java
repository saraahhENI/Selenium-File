package testcasesLogin;
import factory.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Menu;

public class CaseNonPassant extends BaseTest {
    private LoginPage loginPage;
    private Menu menuPage;

    @BeforeMethod
    public  void injecter(){
        loginPage = new LoginPage(driver);
        menuPage = new Menu(driver);
        driver.get(LoginPage.URL);
        menuPage.getMenuBurger().click();
        menuPage.getLoginMenu().click();
    }

    @Test(dataProvider = "data-impossible")
    public void verifyWrongData(String username, String password){
        driver.get(LoginPage.URI_LOGIN);
        loginPage.getTitleConnection();
        loginPage.fillConnectionData(username, password);
        loginPage.getErrorconnection();
    }

    @DataProvider(name = "data-impossible")
    public Object[][] dataProviderMethod(){
        return new Object[][]{
                {"", "ThisIsNotAPassword"},
                {"John Doe", ""},
                {"", ""},
                {"username", "password"}
        };
    }

}
