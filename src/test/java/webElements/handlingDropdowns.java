package webElements;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.jruby.RubyProcess;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


@RunWith(SerenityRunner.class)
public class handlingDropdowns extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void webElementTest() throws InterruptedException {
        open();
        //--selecting values from dropdown >> sendKeys not effective
        //find(By.xpath("//*[@id=\"searchLanguage\"]")).sendKeys("Dansk");

        //find(By.xpath("//*[@id=\"searchLanguage\"]")).selectByVisibleText("Eesti");

        //--selecting non-english/repetitive texts
        //find(By.xpath("//*[@id=\"searchLanguage\"]")).selectByValue("hi");
        WebElementFacade dropdown1 = $("//*[@id=\"searchLanguage\"]");
        List<WebElementFacade> values = dropdown1.thenFindAll(By.tagName("option"));
        System.out.println("Total values in list : "+values.size());
        //--a partcular language
        //System.out.println(values.get(4).getText());
        //--print all values in list using for each loop >> for (0-69)
       for (WebElementFacade value:values) {
            System.out.println(value.getAttribute("lang"));
       }
    //Thread.sleep(5000);
    }
}
