package finalProject.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import finalProject.hooks.Hooks;
import finalProject.orderLenovo1alv.OrderLenovo;

public class HomePage {
    OrderLenovo orderLenovo = new OrderLenovo();
    Hooks hooks = new Hooks();

    @Given("Open Homepage")
    public void openHomepage() {
        hooks.openHomepage1alv();
    }

    @And("Write in search Lenovo")
    public void writeInSearchLenovo() {
        orderLenovo.changeCategory();
    }

    @And("Choose category Legion")
    public void chooseCategoryLegion() {
        orderLenovo.chooseCategoryLegion();
    }

    @And("Choose and open product")
    public void chooseAndOpenProduct() {
        orderLenovo.chooseAndOpenProduct();
    }

    @When("Remember the name and the price product")
    public void rememberTheNameAndThePriceProduct() {
        orderLenovo.rememberProduct();
    }

    @And("Put in the basket")
    public void putInTheBasket() {
        orderLenovo.putInTheBasket();
    }

    @And("Open the basket")
    public void openTheBasket() {
        orderLenovo.openTheBasket();
    }

    @And("Compare correctly choice product")
    public void compareCorrectlyChoiceProduct() {
        orderLenovo.compareCorrectlyChoiceProduct();
    }

    @Then("Proceed to checkout")
    public void proceedToCheckout() {
        orderLenovo.proceedToCheckout();
    }

    @And("Write email and log in for unregistered")
    public void writeEmailAndLogInForUnregistered() {
        orderLenovo.logIn();
    }

    @And("Choose how to get order")
    public void chooseHowToGetOrder() {
        orderLenovo.chooseHowToGetOrder();

    }

    @And("Fill in all required fields for order")
    public void fillInAllRequiredFieldsForOrder() {
        orderLenovo.arrangeDelivery();
    }

    @And("Check user data")
    public void checkUserData() {
        orderLenovo.checkUserData();
    }

    @And("Go to the payment")
    public void goToThePayment() {
        orderLenovo.goToThePayment();
    }

    @And("Check order details")
    public void checkOrderDetails() {
        orderLenovo.checkOrder();
    }

    @And("Close page")
    public void closePage() {
        hooks.closePage1alv();
    }
}


