package finalProject.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingBasket {



    private final By basket= By.cssSelector("a[class='main-button']");
    public void openTheBasket() {

        $(basket).click();
    }
}
