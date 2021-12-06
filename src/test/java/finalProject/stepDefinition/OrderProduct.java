package finalProject.stepDefinition;

import cucumber.api.java.en.And;
import finalProject.pages.*;

public class OrderProduct {
    ChoiceOfDelivery choiceOfDelivery = new ChoiceOfDelivery();
    LoginPage loginPage = new LoginPage();
    PaymentPage paymentPage = new PaymentPage();


    @And("Write email and log in for unregistered")
    public void writeEmailAndLogInForUnregistered() {
        loginPage.logIn();
    }

    @And("Choose how to get order")
    public void chooseHowToGetOrder() {
        choiceOfDelivery.chooseHowToGetOrder();

    }

    @And("Fill in all required fields for order")
    public void fillInAllRequiredFieldsForOrder() {
        choiceOfDelivery.arrangeDelivery();
    }
    @And("Go to the payment")
    public void goToThePayment() {
        paymentPage.goToThePayment();
    }
}
