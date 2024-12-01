module org.example.geneticsimulation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.geneticsimulation to javafx.fxml;
    exports org.example.geneticsimulation;
}