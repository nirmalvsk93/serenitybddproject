package webElements;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


@RunWith(SerenityRunner.class)
public class handlingLinks extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void webElementTest() throws InterruptedException {
        open();
        //List<WebElementFacade> links = findAll(By.tagName("a"));
        //System.out.println("Total values in list : "+links.size());

        //--print all 322 links in the page along with URL
       //for (WebElementFacade link:links) {
            //System.out.println("The Link Text is : "+link.getText()+" -------Printing URL------------ "+link.getAttribute("href"));
      // }

       //print links with in a section of the page
        WebElementFacade section = $("//*[@id=\"www-wikipedia-org\"]/div[7]/div[3]");
        List<WebElementFacade> links = section.thenFindAll(By.tagName("a"));
        System.out.println("Total values in list : "+links.size());
        for (WebElementFacade link:links) {
            System.out.println("The Link Text is : "+link.getText()+" -------Printing URL------------ "+link.getAttribute("href"));
             }
    //Thread.sleep(5000);
    }
}
