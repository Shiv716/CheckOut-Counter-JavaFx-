package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import sample.checkout.Checkout;
import sample.product.Product;
import sample.product.ProductRepository;


public class ControllerCheckout {
    public Label alert;
    public Button SCAN;
    public ListView<Product> list_items= new ListView<>();
    public ListView<String> list_items2= new ListView<>();
    public TextField input_name;
    public Button Checkout;
    public VBox main_box;
    public Label total;
    public sample.checkout.Checkout checkout=new Checkout();

// Loads PAYMENT window.

    public void createList(javafx.event.ActionEvent actionEvent) throws Exception{
        System.out.println("SUCCESSFULL");
        Parent checkout_1= FXMLLoader.load(getClass().getResource("PAYMENT.fxml"));
        Scene checkout1_scene = new Scene(checkout_1);
        Stage app_stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(checkout1_scene);
        app_stage.show();

    }

    // Textfield to enter the bar code that further gets the corresponding product:-

    public void getCode(ActionEvent actionEvent) {
        input_name.getText();
        String d1 = new String(input_name.getText());
        input_name.setText(""+d1);
    }

    // Button that performs the function of getting the product from database into the list_view.

    public void displayProd(ActionEvent actionEvent) {
        String code=input_name.getText();
        Product product=ProductRepository.getProduct(code.toUpperCase());

        if(product!=null){
            checkout.getCheckoutList().add(product);
            list_items.getItems().add(product);
            list_items2.getItems().add(product.getPrice().toString());
            total.setText("total :"+checkout.getTotal());


        }else{
            alert.setText("Product not found");
        }
    }
}

