package tests;

import static helpers.FakeUsersData.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPracticeForm;

public class TestPracticeForm extends BaseTest {
    @Test (description = "Тест первый")
    public void testNumberOne() {
        AutomationPracticeForm automationPracticeForm = new AutomationPracticeForm()
                .openPracticePage()
                .fillFirstName(getFirstName())
                .fillLastName(getLastName())
                .fillEmail(getEmail())
                .clickFemale()
                .fillMobile(getMobile())
                .selectDateOfBirth()
                .fillSubjects(getSubjects())
                .clickHobbies()
                .downloadPicture(System.getProperty("user.dir") + "\\images\\image.jpg")//и тут что
                .fillCurrentAddress(getCurrentAddress())
                .fillStateSelector(getSTATE())
                .fillCitySelector(getCITY())
                .clickSubmit();


        Assert.assertTrue((automationPracticeForm.getFormConfirmation()).isDisplayed());
        automationPracticeForm
                .checkResults(getFirstName())
                .checkResults(getLastName())
                .checkResults(getEmail())
                .checkResults(getFemale())
                .checkResults(getMobile())
                .checkResults(getSubjects())
                .checkResults(getHOBBY())
                .checkResults(getCurrentAddress())
                .checkResults(getSTATE())
                .checkResults(getCITY());


    }
}
