package net.onlinenotepad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.onlinenotepad.userInterface.MoveItemUserInterface.MOVE_ITEM;

public class MoveItemQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MOVE_ITEM.resolveFor(actor).getText().equals("MOVER ESTE TEXTO");
    }

    public static MoveItemQuestion on() {
        return new MoveItemQuestion();
    }
}