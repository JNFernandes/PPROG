package PPROG.pl09b;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label counter;

    @FXML
    private void increment(ActionEvent e) {
        int num = Integer.parseInt(counter.getText());
        counter.setText(Integer.toString(num + 1));
    }


}