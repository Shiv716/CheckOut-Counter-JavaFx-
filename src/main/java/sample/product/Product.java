package sample.product;

// This class contains all the specifics of a product. Also this is used for getting the product details on list_view.

public class Product{
    private String barCode;
    private String name;
    private Double price;

    public Product(String barCode, String name, Double price){
        this.barCode=barCode;
        this.name=name;
        this.price=price;
    }

    public String getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String displayBar=String.format("%1$-" + 12 + "s", barCode);
        String displayName=String.format("%1$-" + 20 + "s", name);
        return displayBar+ displayName;

    }
}
