package net.onlinenotepad.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CreateTextUserInterface {

    public static final Target SELECT_RICH_TEXT = Target.the("selection note rich text")
            .locatedBy("(//button[@id='richtextnote-tab'])[1]");
    public static final Target BOLD_BUTTON = Target.the("bold button")
            .locatedBy("(//button[@class='ck ck-button ck-off'])[1]");
    public static final Target TEXT_BOX = Target.the("text box")
            .locatedBy("//div[@id='editor']");
    public static final Target SAVE_BUTTON = Target.the("save button")
            .locatedBy("//button[@class='btn save-file-btn saveNotesBtn richtextnoteBtn']");
    public static final Target NOTE_CREATED = Target.the("note created")
            .locatedBy("//a[contains(text(),'Note_1')]");

}