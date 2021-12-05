package finalProject.Pages;

import finalProject.models.UserData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ChoiceOfDelivery {
    UserData userData = new UserData();

    private final By choiceOfReceiving  = By.cssSelector("input[value='2']");
    private final By deliveryAddress = By.cssSelector("input[value='3210']");
    private final By name = By.cssSelector("input[name='address[first_name]']");
    private final By lastName = By.cssSelector("input[name='address[last_name]']");
    private final By phoneNumber = By.cssSelector("input[name='address[phone_number]']");
    private final By proceed = By.cssSelector("button[name='button']");

    public void chooseHowToGetOrder() {
        $(choiceOfReceiving).click();
        $(deliveryAddress).click();
    }

    public void arrangeDelivery() {
        $( name).sendKeys(userData.getFirstName());
        $(lastName).sendKeys(userData.getLastName());
        $( phoneNumber).sendKeys(userData.getPhoneNumber());
        $(proceed).click();
    }
}
