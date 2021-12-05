package finalProject.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Product {

    private final String productBrand = "Lenovo Legion";

    String productName;
    String productPrice;


    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }


}
