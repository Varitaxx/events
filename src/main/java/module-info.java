module eu.asgardschmiede {
    requires javafx.controls;
    requires javafx.fxml;

    opens eu.asgardschmiede to javafx.fxml;
    exports eu.asgardschmiede;
}
