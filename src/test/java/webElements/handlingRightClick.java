package webElements;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class handlingRightClick extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void rightClick() throws InterruptedException {
        open();
        withAction().contextClick($("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img")).perform();
        withAction().moveToElement($("//*[@id=\"dm2m1i1tdT\"]")).perform();
        withAction().moveToElement($("//*[@id=\"dm2m2i1tdT\"]")).perform();
        withAction().moveToElement($("//*[@id=\"dm2m3i1tdT\"]")).perform();
        $("//*[@id=\"dm2m3i1tdT\"]").click();
        Thread.sleep(5000);
    }
}
