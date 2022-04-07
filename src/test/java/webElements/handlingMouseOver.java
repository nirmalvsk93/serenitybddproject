package webElements;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.List;


@RunWith(SerenityRunner.class)
public class handlingMouseOver extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void mouseOver() throws InterruptedException {
        open();
        withAction().moveToElement($("//*[@id=\"navbar-collapse-1\"]/ul/li[3]/a")).perform();
        $("//*[@id=\"navbar-collapse-1\"]/ul/li[3]/ul/li[2]/a").click();

    Thread.sleep(5000);
    }
}
