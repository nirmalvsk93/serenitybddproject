package webElements;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webelements.Checkbox;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


@RunWith(SerenityRunner.class)
public class handlingCheckboxes extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void checkBoxTest() throws InterruptedException {
        open();
        //--to check an unchecked checkbox - not a good approach
        /*Checkbox checkbox = new Checkbox($("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[1]"));
        System.out.println(checkbox.isChecked());
        checkbox.setChecked(true);
        System.out.println(checkbox.isChecked());*/

        WebElementFacade section = $("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]");

        List<WebElementFacade> checkboxes = section.thenFindAll(By.name("sports"));
        checkboxes.get(3).click();
        //--check a particular box
        System.out.println(checkboxes.size());
        //--check all boxes
        for (WebElementFacade checkbox : checkboxes) {
            System.out.println("The values are : "+checkbox.getAttribute("value"));
            //checkbox.click();

        }
        Thread.sleep(5000);
    }
}
