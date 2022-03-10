package sample.checkout;

import sample.product.Product;

import java.util.ArrayList;
import java.util.List;

// Empty list where all the scanned products are added :-

public class Checkout {
    private List<Product> checkoutList = new ArrayList<>();


    public List<Product> getCheckoutList() {
        return checkoutList;
    }

    public String getTotal() {
        Double totalPrice = 0.0;
        for (Product product1 : getCheckoutList()) {
            totalPrice += product1.getPrice();
        }
        return totalPrice.toString();
    }
}

