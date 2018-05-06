package animal2;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

 
public class ComboBoxSample extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override public void start(Stage stage) {
        stage.setTitle("ComboBoxSample");
        Scene scene = new Scene(new Group(), 300, 150);
        
        final ComboBox animalComboBox = new ComboBox();
        final Button button = new Button ("Apply");
        animalComboBox.getItems().addAll(
        	"Animal",
            "Weight",
            "Lifetime");
        
        button.setOnAction(event ->{
        	String w = (String) animalComboBox.getValue();
        	try {
				Dispatcher.main(w);
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        		);
        
        GridPane grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 5, 15));
        grid.add(new Label("Select a sorting method: "), 0, 0);
        grid.add(animalComboBox, 1, 0);
        grid.add(button, 1, 2);
        
        Group root = (Group)scene.getRoot();
        root.getChildren().add(grid);
        stage.setScene(scene);
        stage.show();
    }    
}
