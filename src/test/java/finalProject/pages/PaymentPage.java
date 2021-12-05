package finalProject.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {

    private final By choiceOfPayment = By.id("payment_unused_22");

    public void goToThePayment() {
        $(choiceOfPayment).click();
    }
}
