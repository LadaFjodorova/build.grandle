package finalProject.orderLenovo1alv;

import com.codeborne.selenide.Condition;
import finalProject.models.Product;
import finalProject.models.UserData;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class OrderLenovo {

    UserData userData = new UserData();
    Product product = new Product();

    By search = By.id("q");
    By searchButton = By.xpath("//button[@class='main-search-submit']");
    By chooseCategory = By.xpath("//a[@title='Lenovo Legion']");


    public void changeCategory() {
        $(search).sendKeys(product.getProductBrand());
        $(searchButton).click();
    }

    public void chooseCategoryLegion() {
        $(chooseCategory).click();
    }

    public void chooseAndOpenProduct() {
        $(By.xpath("//a[@class='ks-new-product-name']")).click();

    }

    public void rememberProduct() {
        $("span[class='price']").shouldBe(Condition.text("825,00"));
        $("h1").shouldBe(Condition.text("Klēpjdators Lenovo Legion 5-15 82B500HGPB PL, AMD Ryzen™ 5-4600H, spēlēm, 8 GB, 15.6 "));
    }

    public void putInTheBasket() {
        $(By.id("add_to_cart_btn")).click();
    }

    public void openTheBasket() {

      $("a[class='main-button']").click();
    }

    public void compareCorrectlyChoiceProduct() {
        $("p[class='detailed-cart-item__price']").shouldHave(Condition.text(product.getProductPrice()));
        $("a[class='detailed-cart-item__name-link']").shouldHave(Condition.text(product.getProductName()));
    }

    public void proceedToCheckout() {
        $("input[class='main-button cart-main-button']").click();
    }

    public void logIn() {
        $(By.xpath("//div[@class='users-session__content-panel users-session-form']//input[@id ='user_email']")).sendKeys("lada@inbox.lv");
        $(By.xpath("//input[@value ='Turpināt']")).click();
    }

    public void chooseHowToGetOrder() {
        $(By.xpath("//input[@value='2']")).click();
        $("input[value='3210']").click();
    }

    public void arrangeDelivery() {
        $("input[name='address[first_name]']").sendKeys(userData.getFirstName());
        $("input[name='address[last_name]']").sendKeys(userData.getLastName());
        $("input[name='address[phone_number]']").sendKeys(userData.getPhoneNumber());
        $("button[name='button']").click();
    }

    public void checkUserData() {
        assertThat("Lada Krendelj").isEqualTo("Lada Krendelj");
        assertThat("28825524").isEqualTo("28825524");
        $("button[class='main-button upcase fr small-radius button-min-width checkout-shipping-continue-button']").click();
    }

    public void goToThePayment() {
        $(By.xpath("//input[@value='22']")).click();
    }

    public void checkOrder() {
        $("div[class='price fr']").shouldHave(Condition.text("825,00"));
        $("div[class='name']").shouldHave(Condition.text("Lada Krendelj"));
        $("div[class='address']").shouldHave(Condition.text("28825524"));
    }


}
