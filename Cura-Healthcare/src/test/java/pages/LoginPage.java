package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;
    public static final String URL = "https://katalon-demo-cura.herokuapp.com/";
    public static final String URI_LOGIN = URL+"profile.php#login";
    private static By usernameInput = By.id("txt-username");
    private static By passwordInput = By.id("txt-password");
    private static By loginButton = By.id("btn-login");

    public LoginPage(WebDriver driver){this.driver = driver;}

    public void fillConnectionData(String username, String password){
        getusernameInput().sendKeys(username);
        getpasswordInput().sendKeys(password);

        getloginButton().submit();
    }

    public WebElement getusernameInput(){ return  driver.findElement(usernameInput);}
    public WebElement getpasswordInput(){ return  driver.findElement(passwordInput);}
    public WebElement getloginButton(){ return  driver.findElement(loginButton);}
    public WebElement getTitleConnection(){ return  driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/h2"));}
    //public WebElement getUrlLogin(){ return driver.get(URI_LOGIN);}
    public WebElement getErrorconnection(){return driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[1]/p[2]"));}

}
