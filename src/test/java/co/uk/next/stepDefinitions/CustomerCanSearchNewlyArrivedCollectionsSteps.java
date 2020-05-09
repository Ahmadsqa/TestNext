package co.uk.next.stepDefinitions;

import co.uk.next.pages.BasePage;
import co.uk.next.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class CustomerCanSearchNewlyArrivedCollectionsSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);


    @Given("i navigate to next homepage")
    public void i_navigate_to_next_homepage() {
        launchUrl();
    }

    @When("i click on Men link")
    public void i_click_on_Men_link() {
        homePage.clickOnMenMenue();
    }

    @When("i click on Newly in link")
    public void i_click_on_Newly_in_link() {

    }

    @When("i click on Brand")
    public void i_click_on_Brand() {

    }

    @When("i click on Next")
    public void i_click_on_Next() {

    }

    @When("i click on colour")
    public void i_click_on_colour() {

    }

    @When("i click on Blue")
    public void i_click_on_Blue() {

    }

    @When("i click on size type")
    public void i_click_on_size_type() {

    }

    @When("i click on Big")
    public void i_click_on_Big() {

    }

    @When("i click on size")
    public void i_click_on_size() {

    }

    @When("i click on {int}IN")
    public void i_click_on_IN(Integer int1) {

    }

    @When("i click on shirt of my choice")
    public void i_click_on_shirt_of_my_choice() {

    }

    @Then("the details desction of the selected shirt is displayed.")
    public void the_details_desction_of_the_selected_shirt_is_displayed() {

    }

}
