package net.onlinenotepad.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class DeleteItemUserInterface {

    public static final Target TASK_LIST_BUTTON = Target.the("task list button")
            .locatedBy("(//button[@id='tasklist-tab'])[1]");
    public static final Target ADD_NEW_TASK = Target.the("add new task")
            .locatedBy("//input[@id='my-list']");
    public static final Target CHECK_BUTTON = Target.the("check button")
            .locatedBy("//button[@id='addnewlist']");
    public static final Target BUTTON_DELETE_ARTICLE = Target.the("button delete article")
            .locatedBy("(//img[@class='me-2 remove_list_item'])[3]");
    public static final Target ITEM = Target.the("item")
            .locatedBy("(//label[@class='form-check-label'])[3]");
}