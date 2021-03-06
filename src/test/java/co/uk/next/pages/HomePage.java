package co.uk.next.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#MainNavigation > div > ul > li:nth-child(2)")
    private WebElement menManue;


    public void clickOnMenMenue(){
        menManue.click();
    }

    
}
