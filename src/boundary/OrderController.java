package home;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class OrderController implements Initializable{

    @FXML
    private Pane OrderInfoPane;

    @FXML
    private VBox orderItem;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[10];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("OrderIDItem.fxml"));
                //System.out.println(CustomerItems);

                orderItem.getChildren().add(nodes[i]);



            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Node[] node = new Node[1];
        try {
            node[0] = FXMLLoader.load(getClass().getResource("orderInfo.fxml"));
            OrderInfoPane.getChildren().add(node[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
