package webElements;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.components.HtmlTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.yecht.Data;

import java.util.List;


@RunWith(SerenityRunner.class)
public class handlingHTMLWebtables extends PageObject {

    @Managed()
    WebDriver driver;

    @Test
    public void webtables() throws InterruptedException {
        open();
        /*WebElementFacade section = $("//*[@id=\"leftcontainer\"]/table/tbody");
        List <WebElementFacade> rows = section.thenFindAll(By.tagName("tr"));
        System.out.println("Total Rows in the Section - "+rows.size());
        for(WebElementFacade row:rows) {
            System.out.println(row.getText());
        }
            WebElementFacade segment = $("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]");
            List<WebElementFacade> columns = segment.thenFindAll(By.tagName("td"));
            System.out.println("Number of columns in a row - "+columns.size());
            for (WebElementFacade column:columns){
                System.out.println(column.getText());
            }*/
        HtmlTable table = new HtmlTable($("//*[@id=\"leftcontainer\"]/table"));
        List<String> headers = table.getHeadings();
        for (String header:headers){
            System.out.println(header);
        }
        List<WebElement> rows = table.getRowElements();
        for (WebElement row:rows){
            System.out.println(row.getText());
        }
        System.out.println("Total Number of rows - "+rows.size());
            Thread.sleep(3000);

        }
    }

