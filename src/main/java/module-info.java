module com.example.practise4new {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practise4new to javafx.fxml;
    exports com.example.practise4new;
}