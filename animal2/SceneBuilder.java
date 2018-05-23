package animal2;

import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SceneBuilder extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override 
    public void start(Stage stage) {
    	Button button = new Button ("Apply");
    	Label statusLabel = new Label("Ready for input");
    	Label label = new Label("Select a sorting method: ");
    	stage.setTitle("Sorting of animals");
    	stage.setMinHeight(120);
    	stage.setMinWidth(290);
    	Scene scene = new Scene(new Group(), 300, 150);
    	final ComboBox animalComboBox = new ComboBox();
    	animalComboBox.getItems().addAll(
    			"Animal",
    			"Weight",
    			"Lifetime");
    	animalComboBox.setValue("Choose");
   
    	GridPane grid = new GridPane();
    	grid.add(statusLabel, 0, 0);
    	grid.add(label,  0, 1); //column - line
    	grid.setVgap(4);
    	grid.setHgap(10);
    	grid.setPadding(new Insets(15, 15, 15, 15));
 
    	grid.add(animalComboBox, 1, 1);
    	grid.add(button, 1, 2);
    	Group root = (Group)scene.getRoot();
    	root.getChildren().add(grid);
    	stage.setScene(scene);
    	stage.show();
	 
    	button.setOnAction(event ->{
    		String w = (String) animalComboBox.getValue();
    		if (w.equals("Choose")){
    			statusLabel.setText("Error.");
    			label.setText("You should select a method.");		 
    		}else {
    			label.setText("Select a sorting method: ");
    			SceneBuilder.status(button, statusLabel, true, "Wait");
    			try {
    				Dispatcher.handler(w);
    				SceneBuilder.status(button, statusLabel, false, "Completed");
    			} catch (IOException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    			);
    }
    public static void status(Button button, Label statusLabel, 
 			boolean buttonStatus, String labelStatus) {
 		if(labelStatus.equals("Wait")) {
 			statusLabel.setText("Wait");
 		}else if(labelStatus.equals("Completed")) {
 			statusLabel.setText("Completed");
 		}
 		button.setDisable(buttonStatus);
 	}
    public static void showDialog(String s) {
		Alert dialog = new Alert(AlertType.INFORMATION);
		String info = "You need to check the input data.";
		if (s == null)
			dialog.setContentText("Something went wrong." + "\n" + info);
		dialog.setContentText(s + "\n" + info);
		dialog.setTitle("Error");
		dialog.setHeaderText(null);
		dialog.showAndWait();
    }
}
    
