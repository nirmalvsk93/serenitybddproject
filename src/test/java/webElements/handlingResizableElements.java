package webElements;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class handlingResizableElements extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void resizableElements() throws InterruptedException {
        open();
        withAction().dragAndDropBy($("//*[@id=\"resizable\"]/div[3]"), 400, 500).perform();
    Thread.sleep(5000);
    }
}
