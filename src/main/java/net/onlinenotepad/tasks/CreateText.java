package net.onlinenotepad.tasks;

import net.onlinenotepad.interactions.WaitFor;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.onlinenotepad.userInterface.CreateTextUserInterface.*;

public class CreateText implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_RICH_TEXT),
                WaitUntil.the(BOLD_BUTTON, isPresent()),
                Click.on(BOLD_BUTTON),
                WaitUntil.the(TEXT_BOX, isPresent()),
                Enter.theValue(" Esto es un texto en negrita").into(TEXT_BOX),
                Scroll.to(SAVE_BUTTON),
                Click.on(SAVE_BUTTON),
                WaitFor.time(3000),
                Scroll.to(NOTE_CREATED)
        );
    }

    public static CreateText onPage() {
        return Instrumented.instanceOf(CreateText.class).withProperties();
    }
}