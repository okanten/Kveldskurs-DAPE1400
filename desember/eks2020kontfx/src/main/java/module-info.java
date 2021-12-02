module com.example.eks2020kontfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eks2020kontfx to javafx.fxml;
    exports com.example.eks2020kontfx;
}