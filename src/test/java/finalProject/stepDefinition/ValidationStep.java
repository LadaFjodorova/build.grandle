package finalProject.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import finalProject.pages.*;

public class ValidationStep {

    OrderLenovo orderLenovo = new OrderLenovo();

    @When("Remember the name and the price product")
    public void rememberTheNameAndThePriceProduct() {
        orderLenovo.rememberProduct();
    }

    @And("Compare correctly choice product")
    public void compareCorrectlyChoiceProduct() {
        orderLenovo.compareCorrectlyChoiceProduct();
    }


    @And("Check user data")
    public void checkUserData() {
        orderLenovo.checkUserData();
    }


    @And("Check order details")
    public void checkOrderDetails() {
        orderLenovo.checkOrder();
    }
}
