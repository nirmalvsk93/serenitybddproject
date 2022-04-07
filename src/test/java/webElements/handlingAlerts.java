package webElements;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class handlingAlerts extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void handlingAlerts() throws InterruptedException {
        open();
        $("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/input[2]").click();
        Alert alert = getAlert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(5000);
    }
}
