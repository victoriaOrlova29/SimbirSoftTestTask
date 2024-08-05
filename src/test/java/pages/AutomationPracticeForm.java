package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

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
    private WebElement musicCheckbox;

    //узнать про выбор файла

    @FindBy(xpath = "//textarea[@id=\"currentAddress\"]")
    private WebElement currentAddressField;

    @FindBy(xpath = "//*[@id = 'state']//input")
    private WebElement stateSelector; //Uttar Pradesh

    @FindBy(xpath = "//*[@id= 'city']//input")
    private WebElement citySelector; //Lucknow

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitClick;

    @FindBy(id = "uploadPicture")
    private WebElement uploadButton;

    @FindBy(xpath = "//div[text()='Thanks for submitting the form']")
    private WebElement formConfirmation;

    public AutomationPracticeForm() {

        PageFactory.initElements(driver, this);
    }

    public WebElement getFormConfirmation() {
        return formConfirmation;
    }

    @Step("Открываем страницу")
    public AutomationPracticeForm openPracticePage() {
        driver.get("https://demoqa.com/automation-practice-form");
        return new AutomationPracticeForm();
    }

    @Step("Заполняем First Name")
    public AutomationPracticeForm fillFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return new AutomationPracticeForm();
    }

    @Step("Заполняем Last Name")
    public AutomationPracticeForm fillLastName(String lastName) {
        lastNameField.sendKeys(lastName);
        return new AutomationPracticeForm();
    }

    @Step("Кликаем на gender")
    public AutomationPracticeForm clickFemale() {
        getFemaleButtons.click();
        return new AutomationPracticeForm();
    }
    @Step("Заполняем Email")
    public AutomationPracticeForm fillEmail(String EmailFill) {
        userEmailField.sendKeys(EmailFill);
        return new AutomationPracticeForm();
    }
    @Step("Заполняем Mobile")
    public AutomationPracticeForm fillMobile(String numberFill) {
        userNumberField.sendKeys(numberFill);
        return new AutomationPracticeForm();
    }
    @Step("Заполняем Date of Birth")
    public AutomationPracticeForm selectDateOfBirth() {
        dateOfBirthInput.click();
        dateOfBirthValue.click();
        return new AutomationPracticeForm();
    }
    @Step("Заполняем Subjects")
    public AutomationPracticeForm fillSubjects(String subjectFill) {
        subjectsContainerField.sendKeys(subjectFill);
        subjectsContainerField.sendKeys(Keys.ENTER);
        return new AutomationPracticeForm();
    }
    @Step("Заполняем Hobbies")
    public AutomationPracticeForm clickHobbies() {
        musicCheckbox.click();
        return new AutomationPracticeForm();
    }
    @Step("Заполняем Address")
    public AutomationPracticeForm fillCurrentAddress(String addressFill) {
        currentAddressField.sendKeys(addressFill);
        return new AutomationPracticeForm();
    }
    @Step("Заполняем Picture")
    public AutomationPracticeForm downloadPicture(String filePath) {
        uploadButton.sendKeys(filePath);
        return new AutomationPracticeForm();

    }
    @Step("Заполняем State")
    public AutomationPracticeForm fillStateSelector(String fillState) {
        Actions builder = new Actions(driver);
        builder.moveToElement(stateSelector).perform();
        stateSelector.sendKeys(fillState);
        stateSelector.sendKeys(Keys.ENTER);
        return new AutomationPracticeForm();
    }
    @Step("Заполняем City")
    public AutomationPracticeForm fillCitySelector(String fillCity) {
        citySelector.sendKeys(fillCity);
        citySelector.sendKeys(Keys.ENTER);
        return new AutomationPracticeForm();
    }
    @Step("Кликаем Submit")
    public AutomationPracticeForm clickSubmit() {
        Actions builder = new Actions(driver);
        builder.moveToElement(submitClick).perform();
        submitClick.submit();
        //submitClick.click();
        return new AutomationPracticeForm();
    }
    @Step("Сравниваем результаты")
    public AutomationPracticeForm checkResults(String value) {
        List<WebElement> elements = driver.findElements(By.cssSelector(".table-responsive td:nth-child(2)"));//???
        for (WebElement element : elements) {
            if (element.getText().contains(value)) {
                return this;
            }
        }
        return null;
    }
}


