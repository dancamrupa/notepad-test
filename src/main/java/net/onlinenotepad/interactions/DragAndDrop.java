package net.onlinenotepad.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.core.Serenity.getDriver;

public class DragAndDrop implements Interaction {

    WebDriver driver = getDriver();

    private final String FROM;
    private final String TO;

    public DragAndDrop(String from, String to) {
        FROM = from;
        TO = to;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Actions actions = new Actions(driver);

        WebElement from = driver.findElement(By.xpath(FROM));
        WebElement to = driver.findElement(By.xpath(TO));

        actions.dragAndDrop(from, to).build().perform();

    }

    public static DragAndDrop on(String from, String to) {
        return Instrumented.instanceOf(DragAndDrop.class).withProperties(from, to);
    }

}