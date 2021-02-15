package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lombok.Getter;
import lombok.Setter;

@Getter

//using lombok - by adding following in build.gradle
// implementation "org.projectlombok:lombok:1.18.6"
// annotationProcessor "org.projectlombok:lombok:1.18.6"
public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath="//*[@id=\"div-details\"]")
    WebElement loginPanel;

}