package finalProject.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final By insertMail = By.cssSelector("div[class='users-session__content-panel users-session-form'] input[id ='user_email']");
    private final By buttonProceed = By.cssSelector("input[value ='Turpināt']");

    public void logIn() {
        $(insertMail).sendKeys("lada@inbox.lv");
        $(buttonProceed).click();
    }
}
