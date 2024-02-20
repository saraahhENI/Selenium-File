package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
    private final WebDriver driver;
    public Menu(WebDriver driver){this.driver = driver;}
    public WebElement getMenuBurger() {return driver.findElement(By.id("menu-toggle"));}
    public WebElement getLoginMenu() {return driver.findElement(By.xpath("//*[text()='Login']"));}

}

