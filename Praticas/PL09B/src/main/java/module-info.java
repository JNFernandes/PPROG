module com.example.pl09b {
    requires javafx.controls;
    requires javafx.fxml;


    opens PPROG.pl09b to javafx.fxml;
    exports PPROG.pl09b;
}