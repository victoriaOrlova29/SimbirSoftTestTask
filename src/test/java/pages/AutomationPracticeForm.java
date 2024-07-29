package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticeForm extends BasePage {
    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@id = 'lastName']")
    private WebElement lastNameField;

    @FindBy(css = "input#userEmail")
    private WebElement userEmailField;

    @FindBy(id = "gender-radio-1")
    private WebElement getMaleButtons;

    @FindBy(xpath = " //input[@id=\"gender-radio-2\"]")
    private WebElement getFemaleButtons;

    @FindBy(css = "input#gender-radio-3")
    private WebElement getOtherButtons;

    @FindBy(xpath = " //input[@id=\"userNumber\"]")
    private WebElement userNumberField;

    @FindBy(xpath = " //input[@id=\"dateOfBirthInput\"]") //оставляем?
    private WebElement dateOfBirthInput;

    @FindBy(xpath = "//div[@class=\"react-datepicker__day react-datepicker__day--015 react-datepicker__day--selected\"]div[@class=\"react-datepicker__month-container\"]")
    //15 число
    private WebElement dateOfBirthValue;

    @FindBy(css = "div#subjectsContainer")
    private WebElement subjectsContainerField;

    @FindBy(xpath = " //input[@id=\"hobbies-checkbox-1\"]")
    private WebElement sportsCheckbox;

    @FindBy(xpath = "  //input[@id=\"hobbies-checkbox-2\"]")
    private WebElement readingCheckbox;

    @FindBy(xpath = "  //input[@id=\"hobbies-checkbox-2\"]")
    private WebElement musicCheckbox;

    //узнать про выбор файла

    @FindBy(xpath = "//textarea[@id=\"currentAddress\"]")
    private WebElement currentAddressField;

    @FindBy(xpath = "//*[@id=\"state\"]div[@class=\" css-1uccc91-singleValue\"]")
    private WebElement StateandCityField; //не получается(


    public AutomationPracticeForm() {
        driver.get("https://demoqa.com/automation-practice-form");
        PageFactory.initElements(driver,this);    }
}
