package StepDefinition;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pages.HerokuLanding;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {


private WebDriver driver;
HerokuLanding HL;

@Before
public void setup()
{
BaseClass.initializeDriver();
this.driver=BaseClass.getDriver();
HL=new HerokuLanding(driver);


}

@Given("I open herokuapp website")
public void i_open_herokuapp_website()
{
    HL.HerokuHomepage();

}

@Then("I navigate to A\\/B Testing page")
public void i_navigate_to_a_b_testing_page() 
{
    HL.ABTestingPage();

}

@Then("I navigate to Checkboxes page")
public void i_navigate_to_checkboxes_page()
{

    HL.CheckBoxesPage();

}

@And("I check the first Checkbox")

public void i_check_the_first_checkbox()
{
    HL.Check();

}


@And("I uncheck the second Checkbox")
public void i_uncheck_the_second_checkbox()
{
HL.uncheck();

}



@Then("I navigate to Dropdown page")
public void i_navigate_to_Dropdown_page()
{
    HL.dropdownpage();
}

@And("I select {string} from the Dropdown menu")
public void i_select_from_the_dropdown_menu(String options)
{
    HL.selectfromdown(options);
}




@After
public void tearDown()
{

    if (driver!=null)
    {
        driver.quit();
    }
}

}
