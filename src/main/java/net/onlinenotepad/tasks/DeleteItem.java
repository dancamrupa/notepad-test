package net.onlinenotepad.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.onlinenotepad.userInterface.DeleteItemUserInterface.*;

public class DeleteItem implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TASK_LIST_BUTTON),
                Enter.theValue("A").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Enter.theValue("B").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Enter.theValue("ELIMINAR ESTE TEXTO").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Enter.theValue("D").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Enter.theValue("E").into(ADD_NEW_TASK),
                Click.on(CHECK_BUTTON),
                Click.on(BUTTON_DELETE_ARTICLE)
        );
    }

    public static DeleteItem onPage() {
        return Instrumented.instanceOf(DeleteItem.class).withProperties();
    }
}
