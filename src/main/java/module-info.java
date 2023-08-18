module com.example.m5_assignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.m5_assignment to javafx.fxml;
    exports com.example.m5_assignment;
}