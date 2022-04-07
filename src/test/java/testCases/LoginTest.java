package testCases;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

    @Managed (driver = "chrome")
    WebDriver driver;

    @FindBy(name="q")
    WebElement googleSearch;

    @Title("Executing Login Test")
    @Test
    public void doLogin() throws InterruptedException {
        open();
        System.out.println(getTitle());
        //driver.get("http://google.com");
        //getDriver().findElement(By.name("q")).sendKeys("Hello Serenity!!");
        //find(By.xpath("//*[@name = 'q']")).sendKeys("Hello Serenity!!");
        //$(By.xpath("//*[@name = 'q']")).sendKeys("Hello Serenity!!");
        //typeInto($(By.xpath("//*[@name = 'q']")),"Hello Serenity!!");
        //typeInto(googleSearch,"Hello Serenity!!");
        WebElementFacade textBox = find(By.name("q"));
        textBox.shouldBePresent();
        textBox.typeAndEnter("Emirates");
        Thread.sleep(3000);
    }
}
