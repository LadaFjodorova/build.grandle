package finalProject.pages;

import finalProject.models.Product;
import finalProject.models.UserData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class OrderLenovo {

    UserData userData = new UserData();
    Product product = new Product();

    private final By productPrice = By.cssSelector("span[class='price']");
    private final By productName = By.cssSelector("div[class='product-righter google-rich-snippet']");
    private final By cartProductPrice = By.cssSelector("p[class='detailed-cart-item__price']");
    private final By cartProductName = By.cssSelector("a[class='detailed-cart-item__name-link']");
    private final By search = By.id("q");
    private final By searchButton = By.cssSelector("button[type='submit']");
    private final By finalProductPrice = By.cssSelector("span[class='checkout-order-summary-total__price']");


    public void changeCategory() {
        $(search).sendKeys("Lenovo Legion");
        $(searchButton).click();
    }


    public void rememberProduct() {
        product.setProductName(($(productName).find("h1")).getText());
        System.out.println(product.getProductName());
        product.setProductPrice(($(productPrice).find("span").getText()));
        System.out.println(product.getProductPrice());
    }

    public void putInTheBasket() {
        $(By.id("add_to_cart_btn")).click();
    }


    public void compareCorrectlyChoiceProduct() {
        $(cartProductName).shouldHave(text(product.getProductName()));
        $(cartProductPrice).shouldHave(text(product.getProductPrice()));
        System.out.println(product.getProductPrice());

    }

    public void proceedToCheckout() {
        $("input[class='main-button cart-main-button']").click();
    }


    public void checkUserData() {

        $("div[class='name']").shouldHave(text(userData.getFullName()));
        $("div[class='address']").shouldHave(text(userData.getPhoneNumber()));
        $("button[class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']").click();
    }


    public void checkOrder() {
        $(finalProductPrice).shouldHave(text(product.getProductPrice()));
        System.out.println(product.getProductPrice());
        $("div[class='name']").shouldHave(text(userData.getFullName()));
        $("div[class='address']").shouldHave(text(userData.getPhoneNumber()));

    }

}
