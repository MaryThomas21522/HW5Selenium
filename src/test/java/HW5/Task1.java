package HW5;

import Utilis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // Click on the last alert button and send something
        WebElement alert3Btn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Alert confirmationAlert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmationAlert3.sendKeys("Duncan");
        Thread.sleep(2000);
        confirmationAlert3.accept();
    }
}

/*
http://practice.syntaxtechs.net/javascript-alert-box-demo.php click on the last alert send keys and
accept it Note: don't worry if the text u send doesn't appear up in the textbox
 */