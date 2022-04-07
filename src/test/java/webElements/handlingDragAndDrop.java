package webElements;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class handlingDragAndDrop extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void dragAndDrop() throws InterruptedException {
        open();
        //--drag and drop in required box
        //withAction().dragAndDrop($("//*[@id=\"draggable\"]"),$("//*[@id=\"droppable\"]")).perform();

        //drag and drop in any position
        withAction().dragAndDropBy($("//*[@id=\"draggable\"]"),300,200).perform();
    Thread.sleep(5000);
    }
}