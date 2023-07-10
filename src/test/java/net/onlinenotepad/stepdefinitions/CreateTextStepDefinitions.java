package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.onlinenotepad.questions.CreateTextQuestion;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.onlinenotepad.driver.WebDriversSetup;
import net.onlinenotepad.tasks.CreateText;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.onlinenotepad.utils.GlobalData.URL;

public class CreateTextStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario ingresa a la pagina online notepad")
    public void elUsuarioIngresaALaPaginaOnlineNotepad() {
        WebDriversSetup.withChromeOptions();
        OnStage.theActorCalled("CamiloRuiz").can(BrowseTheWeb.with(WebDriversSetup.on(URL)));
    }

    @When("el usuario crea un texto enriquecido en negrita")
    public void elUsuarioCreaUnTextoEnriquecidoEnNegrita() {
        OnStage.theActorCalled("CamiloRuiz").attemptsTo(CreateText.onPage());
    }

    @Then("el usuario visualiza la nota creada")
    public void elUsuarioVisualizaLaNotaCreada() {
        theActorInTheSpotlight().should(seeThat(CreateTextQuestion.on()));
    }
}