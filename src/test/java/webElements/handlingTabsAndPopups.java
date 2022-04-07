package webElements;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


@RunWith(SerenityRunner.class)
public class handlingTabsAndPopups extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void tabsAndPopups() throws InterruptedException {
        open();
        $("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]/div/a[1]").click();
        ArrayList <String> newTab = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newTab.get(1));
        $("//*[@id=\"user_email\"]").sendKeys("nirmalvsk92@gmail.com");
        Thread.sleep(5000);
        System.out.println("Title of pop up window: "+getTitle());
        getDriver().close();
        getDriver().switchTo().window(newTab.get(0));
        System.out.println("Title of Main Window: "+getTitle());
        getDriver().close();
    }
}
