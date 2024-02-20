package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class FormPage {
        private final WebDriver driver;
        private static By firstNameInput = By.id("ff_3_names_first_name_");
        private static By lastNameInput = By.id("ff_3_names_last_name_");
        private static By emailInput = By.id("ff_3_email");
        private static By subjectInput = By.id("ff_3_subject");
        private static By messageInput = By.id("ff_3_message");
        private static By submitButton = By.xpath("//*[text()='Send Message']");
        private static By successMessage = By.id("fluentform_3_success");
        private static By errorMailMessage = By.xpath("//*[@id='ff_3_email']/../div[@role='alert']");
        private static By errorLastnameMessage = By.xpath("//*[@id='ff_3_names_last_name_']/../div[@role='alert']");
        private static By errorMessageMessage = By.xpath("//*[@id='ff_3_message']/../div[@role='alert']");

        // Constructor
        public FormPage(WebDriver driver) {
            this.driver = driver;
        }

        public void fillFormWithData(String firstName, String lastName, String email, String subject, String message) {
            getFirstnameInput().sendKeys(firstName);
            getLastNameInput().sendKeys(lastName);
            getEmailInput().sendKeys(email);
            getSubjectInput().sendKeys(subject);
            getMessageInput().sendKeys(message);

            getSubmitButton().click();
        }

        public WebElement getFirstnameInput(){
            return driver.findElement(firstNameInput);
        }
        public WebElement getLastNameInput(){
            return driver.findElement(lastNameInput);
        }
        public WebElement getEmailInput(){
            return driver.findElement(emailInput);
        }
        public WebElement getSubjectInput(){
            return driver.findElement(subjectInput);
        }
        public WebElement getMessageInput(){
            return driver.findElement(messageInput);
        }
        public WebElement getSubmitButton(){
            return driver.findElement(submitButton);
        }
        public WebElement getSuccessMessage(){
            return driver.findElement(successMessage);
        }
        public WebElement getErrorMailMessage(){
            return driver.findElement(errorMailMessage);
        }
        public WebElement getErrorLastnameMessage(){
            return driver.findElement(errorLastnameMessage);
        }
        public WebElement getErrorMessageMessage(){
            return driver.findElement(errorMessageMessage);
        }
    }


