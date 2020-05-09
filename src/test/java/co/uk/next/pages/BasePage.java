package co.uk.next.pages;

import co.uk.next.common.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Driver {


    public String BASE_URL = "https://www.next.co.uk/";
    public Select select;
    public static Actions actions;

    public void launchUrl(){
        driver.navigate().to(BASE_URL);
    }

    public void selectByText(WebElement element, String text){
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value){
        select = new Select(element);
        select.selectByValue(value);
    }

    public  void selectByIndex(WebElement element, int index){
        select = new Select(element);
        select.selectByIndex(index);
    }


    public void dragAndDrop(WebElement element, int startP, int endP){
        actions = new Actions(driver);
        actions.dragAndDropBy(element, startP, endP).build().perform();

    }
}
