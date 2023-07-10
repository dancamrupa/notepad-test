package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.onlinenotepad.questions.DeleteItemQuestion;
import net.onlinenotepad.tasks.DeleteItem;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RemoveItemStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("el usuario elimina un articulo de una lista")
    public void elUsuarioEliminaUnArticuloDeUnaLista() {
        OnStage.theActorCalled("CamiloRuiz").attemptsTo(DeleteItem.onPage());
    }

    @Then("el usuario podra visualizar que se elimino un articulo de la lista")
    public void elUsuarioPodraVisualizarQueSeEliminoUnArticuloDeLaLista() {
        theActorInTheSpotlight().should(seeThat(DeleteItemQuestion.on()));
    }
}