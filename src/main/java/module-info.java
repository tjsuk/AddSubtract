module com.example.addsubtract {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.addsubtract to javafx.fxml;
    exports com.example.addsubtract;
}