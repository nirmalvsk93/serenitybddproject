package webElements;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;


@RunWith(SerenityRunner.class)
public class uploadingImage extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void uploadImage() throws InterruptedException {
        open();
        upload("C:\\Users\\dell\\Desktop\\dd.png").to($("/html/body/form/input[1]"));
        Thread.sleep(3000);
        $("/html/body/form/input[2]").click();
        Thread.sleep(3000);
    }
}
