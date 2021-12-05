package finalProject.Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {

    private final By searchButton = By.cssSelector("a[class='ks-new-product-name']");

    public void chooseAndOpenProduct() {
          $(searchButton).click();
    }
}