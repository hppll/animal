package animal2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
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
    	
    	final ComboBox animalComboBox = new ComboBox();
    	animalComboBox.getItems().addAll(
    			"Animal",
    			"Weight",
    			"Lifetime");
    	animalComboBox.setValue("Choose");
    	
     /*	BorderPane bPane = new BorderPane();  
    	Scene scene = new Scene(bPane);
    	bPane.setTop(statusLabel);
    	bPane.setCenter(animalComboBox);
    	bPane.setBottom(button);
    	bPane.setLeft(label);
    	*/
    	Scene scene = new Scene(new Group(), 300, 150);
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
    				Dispatcher dispatcher = new Dispatcher();
    				dispatcher.handler(w);
    			}catch (NoSuchFileException e) {
    				showDialog(e.getMessage());
    			}catch(NumberFormatException e) {
    				showDialog(e.getMessage());
    			}catch(IllegalArgumentException e) {
    				showDialog(e.getMessage());
    			}catch(SecurityException e) {
    				showDialog(e.getMessage());
    			}catch(FileNotFoundException e) {
    				showDialog(e.getMessage());
    			}catch (IOException e) {
    				showDialog(null);
    			}
    			SceneBuilder.status(button, statusLabel, false, "Completed");
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
    public void showDialog(String s) {
		Alert dialog = new Alert(AlertType.ERROR);
		String info = "You need to check the input data.";
		if (s == null) {
			dialog.setContentText("Something went wrong." + "\n" + info);
		}else{ 
			dialog.setContentText(s + "\n" + info);
		}
		dialog.setTitle("Error");
		dialog.setHeaderText(null);
		dialog.showAndWait();
    }
}
    
