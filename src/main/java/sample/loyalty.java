package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.awt.*;
import java.io.IOException;

import sample.customer_info.customer;

public class loyalty {
    public javafx.scene.control.Button finish;
    public Label alert;
    public TextField memname;
    public javafx.scene.control.TextField memnum;

    // If credentials entered are valid , final window opens up on clicking this , ensuring transaction is made.

    public void pay(ActionEvent actionEvent) throws IOException {
        if (!memname.getText().equals("") && !memnum.getText().isBlank()) {
            try {
                customer cust = customer.getCustomer(Integer.parseInt(memnum.getText()));
                if (cust != null && cust.getName().toUpperCase().equals(memname.getText().toUpperCase())) {
                    System.out.println("SUCCESSFULL");
                    Parent checkout_1 = FXMLLoader.load(getClass().getResource("finalmessage.fxml"));
                    Scene checkout1_scene = new Scene(checkout_1);
                    Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    app_stage.hide();
                    app_stage.setScene(checkout1_scene);
                    app_stage.show();
                }else{
                    alert.setText("Put in valid member name/number");
                }
            } catch (NumberFormatException e) {
                alert.setText("Oops! Invalid credentials");
            }
        } else {
            alert.setText("Oops! Invalid credentials");
        }
    }

    public void alert(MouseEvent mouseEvent) {
    }

    public void memname(ActionEvent actionEvent) {
    }

    public void memnum(ActionEvent actionEvent) {
    }

}
