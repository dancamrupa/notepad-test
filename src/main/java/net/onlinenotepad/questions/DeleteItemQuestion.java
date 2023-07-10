package net.onlinenotepad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.onlinenotepad.userInterface.DeleteItemUserInterface.ITEM;

public class DeleteItemQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return ITEM.resolveFor(actor).isDisplayed();
    }

    public static DeleteItemQuestion on() {
        return new DeleteItemQuestion();
    }
}
