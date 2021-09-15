package com.example.practise4new;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicInteger;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class HelloController {

    public void actionPerformed(AtomicInteger x, AtomicInteger y){
        // your handle button click code
        int z = x.get();
        int c = y.get();
        if (z > c) {
            Winner_field.setText("Winner: " + "AC Milan");
        } else if (z < c) {
            Winner_field.setText("Winner: " + "Real madrid");
        } else {
            Winner_field.setText("Winner: " + "DRAW");
        }
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button RealMadridScore;

    @FXML
    private Button ACMilanScored;

    @FXML
    private Label Result_field;

    @FXML
    private Label Last_Scorer_field;

    @FXML
    private Label Winner_field;

    @FXML
    void initialize() {
        AtomicInteger x = new AtomicInteger();
        AtomicInteger y= new AtomicInteger();
        assert RealMadridScore != null : "fx:id=\"RealMadridScore\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert ACMilanScored != null : "fx:id=\"ACMilanScored\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Result_field != null : "fx:id=\"Result_field\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Last_Scorer_field != null : "fx:id=\"Last_Scorer_field\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert Winner_field != null : "fx:id=\"Winner_field\" was not injected: check your FXML file 'hello-view.fxml'.";

        ACMilanScored.setOnAction( event -> {
            x.addAndGet(1);
            Result_field.setText("Result: " + y + "X" + x  );
            Last_Scorer_field.setText("Last Scorer: AC Milan" );
            actionPerformed(x, y);
        });
        RealMadridScore.setOnAction( event -> {
            y.addAndGet(1);
            Result_field.setText("Result: " + y + "X" + x  );
            Last_Scorer_field.setText("Last Scorer: Real Madrid" );
            actionPerformed(x, y);
        });


    }
}

