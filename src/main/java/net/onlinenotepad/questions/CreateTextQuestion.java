package net.onlinenotepad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.onlinenotepad.userInterface.CreateTextUserInterface.NOTE_CREATED;

public class CreateTextQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return NOTE_CREATED.resolveFor(actor).isDisplayed();
    }

    public static CreateTextQuestion on() {
        return new CreateTextQuestion();
    }
}