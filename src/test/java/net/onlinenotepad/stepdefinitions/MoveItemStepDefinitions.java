package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.onlinenotepad.tasks.MoveItem;

import java.io.IOException;

public class MoveItemStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("el usuario mueve un articulo de una lista")
    public void elUsuarioMueveUnArticuloDeUnaLista() {
        OnStage.theActorCalled("CamiloRuiz").attemptsTo(
                MoveItem.onPage()
        );
    }

    @Then("el usuario podra visualizar que movio un articulo de la lista")
    public void elUsuarioPodraVisualizarQueMovioUnArticuloDeLaLista() {

    }
}
