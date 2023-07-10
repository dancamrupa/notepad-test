package net.onlinenotepad.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.onlinenotepad.interactions.DragAndDrop;
import net.onlinenotepad.interactions.WaitFor;

import static net.onlinenotepad.userInterface.DeleteItemUserInterface.*;
import static net.onlinenotepad.userInterface.MoveItemUserInterface.*;

public class MoveItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TASK_LIST_BUTTON),
                WaitFor.time(2000),
                Enter.theValue("A").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Enter.theValue("B").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Enter.theValue("C").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Enter.theValue("D").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Enter.theValue("MOVER ESTE TEXTO").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                DragAndDrop.on(FROM, TO),
                WaitFor.time(2000)
        );
    }

    public static MoveItem onPage() {
        return Instrumented.instanceOf(MoveItem.class).withProperties();
    }
}