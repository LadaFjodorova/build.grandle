package finalProject.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import finalProject.pages.*;

public class ChooseProduct {
    ProductPage productPage = new ProductPage();
    OrderLenovo orderLenovo = new OrderLenovo();
    ShoppingBasket shoppingBasket = new ShoppingBasket();

    @And("Write in search Lenovo Legion")
    public void writeInSearchLenovoLegion() {
        orderLenovo.changeCategory();
    }

    @And("Choose and open product")
    public void chooseAndOpenProduct() {
        productPage.chooseAndOpenProduct();
    }

    @And("Put in the basket")
    public void putInTheBasket() {
        orderLenovo.putInTheBasket();
    }

    @And("Open the basket")
    public void openTheBasket() {
        shoppingBasket.openTheBasket();
    }
    @Then("Proceed to checkout")
    public void proceedToCheckout() {
        orderLenovo.proceedToCheckout();
    }
}
