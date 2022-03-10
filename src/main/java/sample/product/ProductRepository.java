package sample.product;

import java.util.HashMap;
import java.util.Map;

// This contains all the products that are available to buy :-

public class ProductRepository {
    private static Map<String, Product> productList= new HashMap<>();

    static {
        productList.put("P001", new Product("POO1", "CUP", 1.00));
        productList.put("P002", new Product("POO2", "CAP", 0.50));
        productList.put("P003", new Product("POO3", "WATCH", 3.00));
        productList.put("P004", new Product("POO4", "PILLOW", 0.30));
        productList.put("P005", new Product("POO5", "BLANKET", 3.20));
        productList.put("P006", new Product("POO6", "JACKET", 5.50));
        productList.put("P007", new Product("POO7", "EARPHONES", 12.30));
        productList.put("P008", new Product("POO8", "DRINK", 1.30));
        productList.put("P009", new Product("POO9", "PIZZA", 1.00));
        productList.put("P010", new Product("P010", "SUNGLASSES", 2.70));
    }

    public static Map<String, Product> getProductList(){
        return productList;
    }
    public static Product getProduct(String code){
       return productList.get(code);
    }
}
