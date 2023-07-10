package net.onlinenotepad.questions;

import net.onlinenotepad.userInterface.DeleteItemUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DeleteItemQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return DeleteItemUserInterface.ITEM.resolveFor(actor).isDisplayed();
    }

    public static DeleteItemQuestion on() {
        return new DeleteItemQuestion();
    }
}
