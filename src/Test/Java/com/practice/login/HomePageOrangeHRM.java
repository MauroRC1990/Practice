package Test.Java.com.practice.login;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class HomePageOrangeHRM {
    WebDriver driver;

    public HomePageOrangeHRM(WebDriver sentDriver, Wait<WebDriver> sentWait){
        this.wait = sentWait;
        this.driver = sentDriver;
    }

    String addEmployeeButtonXpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";

    String firstNameXpath = "//input[@name='firstName']";

    String middleNameXpath = "//input[@name='middleName']";

    String lastNameXpath = "//input[@name='lastName']";

    String employeeIdXpath = "//label[text()='Employee Id']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input[@class='oxd-input oxd-input--active']";

    String createLoginDetailsSwitchXpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']";

    String usernameXpath = "//input[@autocomplete='off']";

    String selectStatusEnabledXpath = "//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']";

    String passwordXpath = "//input[@type='password']";

    String confirmPasswordXpath = "//input[@type='password']/following::input";

    String saveButtonXpath = "//button[@type='submit']";

    String bloodTypeMenuXpath = "//label[text()='Blood Type']//following::div[@class='oxd-select-text oxd-select-text--active']";

    String bloodTypeXpath = "//span[text()='O+']//parent::div";

    String saveButton2Xpath = "//h6[text()='Custom Fields']//following::button[@type='submit']";

    String trashCanXpath = "//div[text()='Hermann Pirate']//ancestor::div[contains(@class,'oxd-table-card')]//i[@class='oxd-icon bi-trash']";

    String confirmDeleteEmployeePopUpXpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']";

    String selectEmployeeProfileXpath = "//div[(text()=1000)]//ancestor::div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']";

    String nicknameFieldXpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class]//child::input[@class='oxd-input oxd-input--active']";

    String nationalityXpath = "//div[@class='oxd-select-text oxd-select-text--active']";

    String argentineanNationalityXpath = "//span[text()='Argentinean']";

    String maritalStatusXpath = "//label[text()='Marital Status']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//div[@class='oxd-select-wrapper']";

    String singleStatusXpath = "//span[text()='Single']";

    String dateOfBirthXpath = "//label[text()='Date of Birth']//following::i[@class='oxd-icon bi-calendar oxd-date-input-icon']";

    String selectMonthMenuXpath = "//div[@class='oxd-calendar-selector-month-selected']";

    String selectMonthXpath = "//li[text()='October']";

    String selectYearMenuXpath = "//li[@class='oxd-calendar-selector-year']";

    String selectYearXpath = "//li[text()='1990']";

    String selectDayXpath = "//div[text()='15']";

    String genderXpath = "//label[text()='Male']";

    String militaryServiceXpath = "//label[text()='Military Service']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//child::div[@class]//child::input";

    String contactDetailsXpath = "//a[@class='orangehrm-tabs-item']";

    String street1Xpath = "//label[text()='Street 1']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input";

    String stateProvinceXpath = "//label[text()='State/Province']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']//input";

    Wait<WebDriver> wait;

    public void selectAddEmployee() {
        WebElement addEmployee = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addEmployeeButtonXpath)));
        addEmployee.click();
    }
    public void setFirstName(String firstName) {
        WebElement firstNameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(firstNameXpath)));
        firstNameField.sendKeys(firstName);
    }
    public void setMiddleName(String middleName) {
        WebElement middleNameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(middleNameXpath)));
        middleNameField.sendKeys(middleName);
    }
    public void setLastName(String lastName) {
        WebElement lastNameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(lastNameXpath)));
        lastNameField.sendKeys(lastName);
    }
    public void setEmployeeId(String employeeId) {
        WebElement employeeIdInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(employeeIdXpath)));
        employeeIdInput.sendKeys(Keys.CONTROL + "a");
        employeeIdInput.sendKeys(Keys.DELETE);
        employeeIdInput.sendKeys(employeeId);
    }
    public void createLoginDetailsSwitch() {
        WebElement loginDetailsSwitch = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(createLoginDetailsSwitchXpath)));
        loginDetailsSwitch.click();
    }
    public void setUserName(String userName) {
        WebElement userNameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(usernameXpath)));
        userNameField.sendKeys(userName);
    }
    public void statusEnabled() {
        WebElement selectEnabled = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectStatusEnabledXpath)));
        selectEnabled.click();
    }
    public void setPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(passwordXpath)));
        passwordField.sendKeys(password);
    }
    public void setConfirmPassword(String confirmPassword) {
        WebElement confirmPasswordField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmPasswordXpath)));
        confirmPasswordField.sendKeys(confirmPassword);
    }
    public void saveButton() {
        WebElement save = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(saveButtonXpath)));
        save.click();
    }
    public void selectBloodTypeMenu() {
        WebElement bloodTypeMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(bloodTypeMenuXpath)));
        bloodTypeMenu.click();
    }
    public void selectBloodType() {
        WebElement bloodType = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(bloodTypeXpath)));
        bloodType.click();
    }
    public void saveButton2() {
        WebElement save2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(saveButton2Xpath)));
        save2.click();
    }
    public void trashCan() {
        WebElement delete = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(trashCanXpath)));
        wait.until(ExpectedConditions.visibilityOf(delete));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", delete);
        delete.click();
    }
    public void clickConfirmEmployeeDelete() {
        WebElement confirmDelete = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmDeleteEmployeePopUpXpath)));
        wait.until(ExpectedConditions.visibilityOf(confirmDelete));
        confirmDelete.click();
    }
    public void selectEmployeeProfile() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectEmployeeProfileXpath)));
        WebElement selectProfile = driver.findElement(By.xpath(selectEmployeeProfileXpath));
        wait.until(ExpectedConditions.visibilityOf(selectProfile));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", selectProfile);
        selectProfile.click();
    }
    public void setNickname(String setNickname) {
        try {
            Thread.sleep(3000);
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        WebElement nicknameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(nicknameFieldXpath)));
        nicknameField.sendKeys(Keys.CONTROL + "a");
        nicknameField.sendKeys(Keys.DELETE);
        nicknameField.sendKeys(setNickname);
    }
    public void selectNationality() {
        WebElement nationalityMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(nationalityXpath)));
        nationalityMenu.click();
    }
    public void selectArgentineanNationality() {
        WebElement argentineanNationality = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(argentineanNationalityXpath)));
        argentineanNationality.click();
    }
    public void selectMaritalStatus() {
        WebElement maritalStatusMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(maritalStatusXpath)));
        maritalStatusMenu.click();
    }
    public void selectDateOfBirth() {
        WebElement dateOfBirth = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(dateOfBirthXpath)));
        dateOfBirth.click();
    }
    public void selectCalendarMonthMenu() {
        WebElement calendarMonthMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectMonthMenuXpath)));
        calendarMonthMenu.click();
    }
    public void selectMonth() {
        WebElement month = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectMonthXpath)));
        month.click();
    }
    public void selectCalendarYearMenu() {
        WebElement calendarYearMenu = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectYearMenuXpath)));
        calendarYearMenu.click();
    }
    public void selectYear() {
        WebElement year = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectYearXpath)));
        year.click();
    }
    public void selectDay() {
        WebElement day = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(selectDayXpath)));
        day.click();
    }
    public void selectSingleStatus() {
        WebElement singleStatus = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(singleStatusXpath)));
        singleStatus.click();
    }
    public void selectGender() {
        WebElement genderOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(genderXpath)));
        genderOption.click();
    }
    public void setMilitaryService(String MilitaryService) {
        WebElement militaryService = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(militaryServiceXpath)));
        militaryService.sendKeys(Keys.CONTROL + "a");
        militaryService.sendKeys(Keys.DELETE);
        militaryService.sendKeys(MilitaryService);
    }
    public void selectContactDetails() {
        WebElement contactDetailsTab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(contactDetailsXpath)));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", contactDetailsTab);
        contactDetailsTab.click();
    }
    public void setStreet1(String street) {
        WebElement street1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(street1Xpath)));
        try {
            Thread.sleep(3000);
        } catch (Exception exp) {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        street1.sendKeys(Keys.CONTROL + "a");
        street1.sendKeys(Keys.DELETE);
        street1.sendKeys(street);
    }
    public void setStateProvince(String stateProvince) {
        WebElement stateOrProvince = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(stateProvinceXpath)));
        stateOrProvince.sendKeys(Keys.CONTROL + "a");
        stateOrProvince.sendKeys(Keys.DELETE);
        stateOrProvince.sendKeys(stateProvince);
    }
}
