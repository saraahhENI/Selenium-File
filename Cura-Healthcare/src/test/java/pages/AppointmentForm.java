package pages;

import factory.Facility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static factory.Facility.*;

public class AppointmentForm {
    private final WebDriver driver;

    public AppointmentForm(WebDriver driver){
        this.driver = driver;
    }

    public void fillMedicalForm(Facility facility, String healthcare, String check, String date, String comment ){
        getSelectFacility(facility);
        getHealthcareProgram(healthcare);
        getCheckReadmission(check);
        getDateVisit(date);
        getCommentInput(comment);
        getSubmitButton().click();
    }
    public void getSelectFacility(Facility facility){
        Select dropdown = new Select (driver.findElement(By.id("combo_facility")));

        switch (facility){
            case HONGKONG:
                dropdown.selectByVisibleText(Facility.HONGKONG.getFacilityName());
                break;
            case SEOUL:
                dropdown.selectByVisibleText(Facility.SEOUL.getFacilityName());
                break;
            default:
                dropdown.selectByVisibleText(Facility.TOKYO.getFacilityName());
                break;
        }

       /*if(facility.equals(HONGKONG)){
           dropdown.selectByVisibleText("Hongkong CURA Healthcare Center");
       } else if (facility.equals(SEOUL)) {
           dropdown.selectByVisibleText("Seoul CURA Healthcare Center");
       } else {
           dropdown.selectByVisibleText("Tokyo CURA Healthcare Center");
       }*/
    }
    public void getHealthcareProgram(String healthcareProgram){

        switch (healthcareProgram){
            case "medicaid" -> driver.findElement(By.id("radio_program_medicaid")).click();
            case "none" -> driver.findElement(By.id("radio_program_none")).click();
            case "medicare" -> driver.findElement(By.id("radio_program_medicare")).click();
        }
    }
    public void getDateVisit(String date){
        driver.findElement(By.id("txt_visit_date")).sendKeys(date);
    }
    public void getCheckReadmission(String check){
        if(check.equals("true")){
            driver.findElement(By.id("chk_hospotal_readmission")).click();
        }
    }
    public void getCommentInput(String comment){
        driver.findElement(By.id("txt_comment")).sendKeys(comment);}
    public WebElement getTitleForm(){ return  driver.findElement(By.xpath("//*[@id=\"summary\"]/div/div/div[1]/h2"));}
    public WebElement getSubmitButton(){ return driver.findElement(By.id("btn-book-appointment"));}
}
