package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BoardPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div/h3")
    private WebElement boardInput;

}
