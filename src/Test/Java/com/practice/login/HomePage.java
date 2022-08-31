package Test.Java.com.practice.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    String facilitySelectXpath = "//select[@id='combo_facility']";
    String hongkongOptionXpath = "//option[@value='Hongkong CURA Healthcare Center']";
    String applyForHospitalReadmissionXpath = "//input[@type='checkbox']";
    String selectHealthcareProgramXpath = "//input[@value='Medicaid']";
    String visitDateSelectXpath = "//input[@class='form-control']";
    String selectDayXpath = "//*[text() = '17']";
    String CommentXpath = "//textarea[@id='txt_comment']";
    String bookAppointmentButtonXpath = "//button[@id='btn-book-appointment']";


    public void selectFacilityOptions() {
        WebElement facilityOptions = driver.findElement(By.xpath(facilitySelectXpath));
        facilityOptions.click();
    }
    public void selectHongKongFacility() {
        WebElement hongkongOption = driver.findElement(By.xpath(hongkongOptionXpath));
        hongkongOption.click();
    }
    public void selectCheckReadmission() {
        WebElement checkReadmission = driver.findElement(By.xpath(applyForHospitalReadmissionXpath));
        checkReadmission.click();
    }
    public void selectRadioMedicaid() {
        WebElement selectRadioMedicaid = driver.findElement(By.xpath(selectHealthcareProgramXpath));
        selectRadioMedicaid.click();
    }
    public void selectDate() {
        WebElement selectDate = driver.findElement(By.xpath(visitDateSelectXpath));
        selectDate.click();
    }
    public void selectDay() {
        WebElement selectDay = driver.findElement(By.xpath(selectDayXpath));
        selectDay.click();
    }
    public void writeComment(String comment) {
        WebElement writeCommentField = driver.findElement(By.xpath(CommentXpath));
        writeCommentField.sendKeys(comment);
    }
    public void bookAppointment() {
        WebElement bookAppointment = driver.findElement(By.xpath(bookAppointmentButtonXpath));
        bookAppointment.click();
    }
}
