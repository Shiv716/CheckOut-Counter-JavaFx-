package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

//Page that displays the customer to pay through cash and provides a link to go on to window for making payment through  credit card.

public class PAYMENT {
    public Hyperlink link ;

    public void card_pay(ActionEvent actionEvent) throws IOException {
        System.out.println("SUCCESSFULL");
        Parent checkout_1= FXMLLoader.load(getClass().getResource("cardpayment.fxml"));
        Scene checkout1_scene = new Scene(checkout_1);
        Stage app_stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(checkout1_scene);
        app_stage.show();
    }
}
