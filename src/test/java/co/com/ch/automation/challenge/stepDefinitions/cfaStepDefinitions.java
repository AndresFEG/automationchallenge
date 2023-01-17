package co.com.ch.automation.challenge.stepDefinitions;


import co.com.ch.automation.challenge.questions.Answer;
import co.com.ch.automation.challenge.tasks.Login;
import co.com.ch.automation.challenge.tasks.OpenUp;

import co.com.ch.automation.challenge.tasks.Navigate;
import co.com.ch.automation.challenge.tasks.Register;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class cfaStepDefinitions {

@Before
public void setStage () {
    OnStage.setTheStage(new OnlineCast());
}


    @Given("a user to navigate in the cooperative web page")
    public void aUserToNavigateInTheCooperativeWebPage() {

        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage(), (Login.the())) ;
    }


    @When("^The user click in the Products option$")
    public void theUserClickInTheProductsOption() throws Exception {

        OnStage.theActorInTheSpotlight().wasAbleTo(Navigate.the());

    }

    @Then("^Appear all products of Cooperative$")
    public void appearAllProductsOfCooperative() throws Exception {


    }

    @Given("a user to navigate Log in at the Demo Serenity web page")
    public void a_user_to_navigate_log_in_at_the_demo_serenity_web_page() {
        OnStage.theActorCalled("user").wasAbleTo(OpenUp.thePage(), (Login.the())) ;
    }
    @When("The user to navigate at customer option")
    public void the_user_to_navigate_at_customer_option() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Navigate.the());
    }
    @And("The user fills the customers template")
    public void the_user_fills_the_customers_template() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Register.the());
    }
    @Then("Appear a new customer")
    public void appear_a_new_customer() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/test/resources/properties/test.properties"));


        String question = props.getProperty("testvariable");
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }



}
