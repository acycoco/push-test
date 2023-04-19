module com.example.pushtest {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pushtest to javafx.fxml;
    exports com.example.pushtest;
}