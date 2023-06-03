package HW5;

import Utilis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // Click on the checkbox, then, select baby cat from dropdown, then enter text in text box
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        Thread.sleep(2000);

        // Select Baby Cat from dropdown
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Baby Cat");
        Thread.sleep(2000);

        // Then enter text in text box
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Meow meow");
        Thread.sleep(2000);
    }
}

/*
Go to https://chercher.tech/practice/frames click on check box then select bay cat from drop down then
enter text in text box
 */
