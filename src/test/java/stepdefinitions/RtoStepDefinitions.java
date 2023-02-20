package stepdefinitions;

import co.com.choucair.certification.bancolombia.model.Authentication;
import co.com.choucair.certification.bancolombia.questions.Answer;
import co.com.choucair.certification.bancolombia.tasks.Button;
import co.com.choucair.certification.bancolombia.tasks.Login;
import co.com.choucair.certification.bancolombia.tasks.OpenPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RtoStepDefinitions {
    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("Authentication user")
    public void authenticationUser(io.cucumber.datatable.DataTable dataTable) {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenPage.page(Authentication.setData(dataTable).get(0)),
                Login.keys(Authentication.setData(dataTable).get(0)));
    }
    @When("Calculate the correct coordinate of the button and the sum")
    public void calculateTheCorrectCoordinateOfTheButtonAndTheSum() {
            OnStage.theActorInTheSpotlight().attemptsTo(Button.click());
    }
    @Then("challenge completed successfully")
    public void challengeCompletedSuccessfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Felicidades, has terminado la prueba exitosamente")));
    }
}
