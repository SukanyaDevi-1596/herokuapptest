package StepDefinition;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pages.HerokuLanding;
import io.cucumber.java.After;
import io.cucumber.java.Before;
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









@After
public void tearDown()
{

    if (driver!=null)
    {
        driver.quit();
    }
}

}
