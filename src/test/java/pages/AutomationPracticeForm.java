package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeForm extends BasePage {
    @FindBy(css = "#firstName")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id = 'lastName']")
    private WebElement lastNameField;

    @FindBy(css = "input#userEmail")
    private WebElement userEmailField;

    @FindBy(xpath = "//*[text()=\"Female\"]")
    private WebElement getFemaleButtons;

    @FindBy(xpath = " //input[@id=\"userNumber\"]")
    private WebElement userNumberField;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthInput;

    @FindBy(xpath = "//div[text()=15]")
    private WebElement dateOfBirthValue;

    @FindBy(xpath = "//div[@id=\"subjectsContainer\"]//input[@id=\"subjectsInput\"]")
    private WebElement subjectsContainerField;

    @FindBy(xpath = "//*[text()=\"Music\"]")
    private WebElement readingCheckbox;

    //узнать про выбор файла

    @FindBy(xpath = "//textarea[@id=\"currentAddress\"]")
    private WebElement currentAddressField;

    @FindBy(xpath = "//*[@id=\"state\"]")
    private WebElement stateSelector; //Uttar Pradesh

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement citySelector; //Lucknow

    public AutomationPracticeForm() {

        PageFactory.initElements(driver, this);
    }

    public AutomationPracticeForm openPracticePage() {
        driver.get("https://demoqa.com/automation-practice-form");
        return new AutomationPracticeForm();
    }

    public AutomationPracticeForm fillFirstName (String firstName){
        firstNameField.sendKeys(firstName);
        return new AutomationPracticeForm();
    }

    public AutomationPracticeForm fillLastName (String lastName){
        lastNameField.sendKeys(lastName);
        return new AutomationPracticeForm();
    }
     public AutomationPracticeForm clickFemale (){
        getFemaleButtons.click();
         return new AutomationPracticeForm();
     }
    public AutomationPracticeForm fillEmail (String EmailFill){
       userEmailField.sendKeys(EmailFill);
        return new AutomationPracticeForm();
    }
    public AutomationPracticeForm fillMobile (String numberFill){
        userNumberField.sendKeys(numberFill);
        return new AutomationPracticeForm();
    }
    public AutomationPracticeForm selectDateOfBirth (){
        dateOfBirthInput.click();
        dateOfBirthValue.click();
        return new AutomationPracticeForm();
    }
    public AutomationPracticeForm fillSubjects(String subjectFill){
        subjectsContainerField.sendKeys(subjectFill);
        subjectsContainerField.sendKeys(Keys.RETURN);
        return new AutomationPracticeForm();
    }
    public AutomationPracticeForm clickHobbies(){
        readingCheckbox.click();
        return new AutomationPracticeForm();
    }
    public AutomationPracticeForm fillCurrentAddress(String addressFill){
        currentAddressField.sendKeys(addressFill);
        return new AutomationPracticeForm();
    }
    public AutomationPracticeForm fillStateSelector (){
        stateSelector.click();
        stateSelector.sendKeys("Uttar Pradesh");
        stateSelector.sendKeys(Keys.RETURN);
        return new AutomationPracticeForm();
    }
    public AutomationPracticeForm fillCitySelector (){
        citySelector.click();
        citySelector.sendKeys("Lucknow");
        citySelector.sendKeys(Keys.RETURN);
        return new AutomationPracticeForm();
    }

}
