module com.example.client_server_multithread {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.client_server_multithread to javafx.fxml;
    exports com.example.client_server_multithread;
}