package tests;
import  static helpers.FakeUsersData.*;
import org.testng.annotations.Test;
import pages.AutomationPracticeForm;

public class TestPracticeForm extends BaseTest {
    @Test
    public void testNumberOne(){
        AutomationPracticeForm automationPracticeForm = new AutomationPracticeForm()
                .openPracticePage()
                .fillFirstName(getFirstName())
                .fillLastName(getLastName())//не проходит по данным
                .fillEmail(getEmail())
                .clickFemale()//не кликает
                .fillMobile(getMobile())
                .selectDateOfBirth()
                .fillSubjects(getSubjects())//отвалилось возможно из за css
              //  .clickHobbies()
                .fillCurrentAddress(getCurrentAddress())
                .fillStateSelector()
                .fillCitySelector();


    }
}
