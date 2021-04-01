package letskodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.mustache.Value;

import java.util.List;

public class LetkodeitExcecute extends HelpClass {

    @Test(priority = 1)

    public static void Browser() {
        driver.get("https://learn.letskodeit.com/p/practice");
    }

    @Test(priority = 2)
    public static void SelectRadioButton() {
        LetkodeitExcecute.Browser();
        driver.findElement(By.xpath("//input[@id='benzradio']")).click();
    }

    @Test(priority = 3)
    public static void SelectDropDown() {
        LetkodeitExcecute.Browser();
        driver.findElement(By.cssSelector("[id='carselect']")).click();
        WebElement selectDropDown = driver.findElement(By.cssSelector("[id='carselect']"));
        Select leaveType = new Select(selectDropDown);
        leaveType.selectByVisibleText("Benz");
    }

    @Test(priority = 4)
    public static void MultiSelect() {

        LetkodeitExcecute.Browser();
        WebElement SelectMulti = driver.findElement(By.name("multiple-select-example"));
        Select fruits = new Select(SelectMulti);
        fruits.selectByVisibleText("Orange");
        fruits.selectByVisibleText("Apple");

    }

    @Test(priority = 5)
    public static void SelectCheckBox() {
        LetkodeitExcecute.Browser();
        String selectCheck = "Benz";

        List<WebElement> checkList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Number of Check Boxes :" + checkList.size());

        for (int i = 0; i < checkList.size(); i++) {
            if (checkList.get(i).getAttribute("value").equalsIgnoreCase(selectCheck)) {
                checkList.get(i).click();
            }
        }

    }

}
