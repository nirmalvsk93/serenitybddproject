package webElements;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class handlingSlider extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void slider() throws InterruptedException {
        open();
        int size = $("//*[@id=\"slider\"]").getSize().width/2;
        withAction().dragAndDropBy($("//*[@id=\"slider\"]/span"),size,0).perform();

    Thread.sleep(3000);
    withAction().dragAndDropBy($("//*[@id=\"slider\"]/span"),-size/2,0).perform();
    Thread.sleep(3000);
    }
}
