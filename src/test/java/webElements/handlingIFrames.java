package webElements;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.jruby.RubyProcess;
import org.jruby.ext.weakref.WeakRef;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


@RunWith(SerenityRunner.class)
public class handlingIFrames extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void handlingIFrames() throws InterruptedException {
        open();
        getDriver().switchTo().frame("iframeResult");
        //$("/html/body/button").click();
        //evaluateJavascript("myFunction()");
        evaluateJavascript("arguments[0].style.border='3px solid red'",$("//*[@id=\"mySubmit\"]"));
        getDriver().switchTo().defaultContent();
        //System.out.println(findAll(By.tagName("iframe")).size());

        List <WebElementFacade> frames = findAll(By.tagName("iframe"));
        for (WebElementFacade frame:frames){
            System.out.println(frame.getAttribute("name"));

        }
        System.out.println(frames.size());
        Thread.sleep(5000);
    }
}
