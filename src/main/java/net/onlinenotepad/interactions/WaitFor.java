package net.onlinenotepad.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class WaitFor implements Interaction {

    int seconds;

    public WaitFor(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static WaitFor time(int seconds) {
        return Instrumented.instanceOf(WaitFor.class).withProperties(seconds);
    }

}
