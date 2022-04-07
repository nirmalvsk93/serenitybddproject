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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.SECONDS;

@RunWith(SerenityRunner.class)
public class SerenityGmailTest extends PageObject {

    @Managed (driver = "chrome")
    WebDriver driver;

    @Title("Executing Login Test")
    @Test
    public void doLogin() throws InterruptedException {
        open();
        //--to check default timeouts
        System.out.println(getImplicitWaitTimeout());
        System.out.println(getWaitForTimeout());

        //--set global implicit timeout
        //setImplicitTimeout(10,SECONDS);
        //System.out.println(getImplicitWaitTimeout());

        find(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div[2]/form/div[1]/input")).sendKeys("Nirmal.V.SunilKumarReni@student.uts.edu.au");
        find(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/main/div/div/div[2]/form/button")).click();

        //--defining Explicit Timeouts
        //withTimeoutOf(Duration.ofSeconds(5)).find(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div[2]/form/div[2]/input")).type("Nirmal123**");
        //waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div[2]/form/div[2]/input"))).sendKeys("Nirmal123**");

        //--Defining Fluent Wait
        //waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div[2]/form/div[2]/input"))).sendKeys("Nirmal123**");

        //--Fluent Wait with custom message
        waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).withMessage("Exeption while finding ELEMENT").until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div/main/div/div/div[2]/form/div[2]/input"))).sendKeys("Nirmal123**");

        //find(By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/main/div/div/div[2]/form/button")).click();
        //Thread.sleep(8000);
        
    }
}
