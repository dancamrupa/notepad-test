package net.onlinenotepad.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class MoveItemUserInterface {
    public static final String FROM = "(//div[@class='d-flex justify-content-between delete'])[5]";
    public static final String TO = "(//div[@class='d-flex justify-content-between delete'])[1]";
    public static final Target MOVE_ITEM = Target.the("Move item")
            .locatedBy("//span[contains(text(),'MOVER ESTE TEXTO')]");
}