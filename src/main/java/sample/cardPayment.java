package sample;

import com.sun.javafx.scene.paint.GradientUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class cardPayment {
    public Button paybutton;
    public Hyperlink loyalcard;
    public TextField cvv;
    public TextField exp;
    public TextField cdnum;
    public TextField name;
    public Label alert;

    //Proceeds to payment after filling up of details.

    public void payment(ActionEvent actionEvent) throws IOException {
        try {
            if (validate()) {
//            System.out.println("SUCCESSFULL");
                Parent checkout_1 = FXMLLoader.load(getClass().getResource("finalmessage.fxml"));
                Scene checkout1_scene = new Scene(checkout_1);
                Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                app_stage.hide();
                app_stage.setScene(checkout1_scene);
                app_stage.show();

                    System.out.println("SUCCESSFULL");
                app_stage.setScene(checkout1_scene);
                app_stage.show();
            } else {
                alert.setText("Invalid Credentials!");
            }
        }catch (NumberFormatException ex){
            alert.setText("Invalid Credentials!");
        }
    }

    // Here if the customer credentials are non-empty , payment is proceeded , and the credentials must be of right format.

    private boolean validate(){
       return  cdnum.getLength() == 16 && Long.parseLong(cdnum.getText().trim())>0 && cvv.getLength() == 3 &&  Integer.parseInt(cvv.getText())>0 && name.getText().length()>7 && validDate(exp.getText().trim()) ?true :false;
    }

    private boolean validDate(String date ){
        String[] dateParts= date.split("/");
        if(dateParts.length<3) return false;
        if(Integer.parseInt(dateParts[0])<1 && Integer.parseInt(dateParts[0])>31) return false; //date
        if(Integer.parseInt(dateParts[1])<1 && Integer.parseInt(dateParts[1])>12) return false; //month
        if(Integer.parseInt(dateParts[2])<2000 && Integer.parseInt(dateParts[2])>9999) return false; //year
        return true;
    }

//Directs to the window of LOYALTY CARD GUI.

    public void loyalpay(ActionEvent actionEvent) throws IOException {
        System.out.println("SUCCESSFULL");
        Parent checkout_1 = FXMLLoader.load(getClass().getResource("loyalty.fxml"));
        Scene checkout1_scene = new Scene(checkout_1);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(checkout1_scene);
        app_stage.show();
    }

    // Rest of the active buttons , textfields , etc on the GUI.

    public void cnum(ActionEvent actionEvent) {
    }

    public void expnum(ActionEvent actionEvent) {
    }

    public void cardnum(ActionEvent actionEvent) {
    }

    public void cdname(ActionEvent actionEvent) {
    }
}
