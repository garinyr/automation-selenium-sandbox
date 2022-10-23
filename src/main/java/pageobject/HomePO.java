package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

import java.util.List;


public class HomePO {
  WebDriver driver;
  SeleniumHelpers selenium;

  public HomePO(WebDriver driver){
    this.driver = driver;
    selenium = new SeleniumHelpers(driver);

    //This initElements method will create all WebElements
    PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
  }
  @FindBy(xpath = "//legend")
  private WebElement exampleTitle;

  public String getTitle() {
    return driver.getTitle();
  }

  public void getExampleList(){
    List<WebElement> listTitle = driver.findElements(By.xpath("//legend"));
    for (WebElement webElement : listTitle) {
      System.out.println(webElement.getText());
    }
  }
}

