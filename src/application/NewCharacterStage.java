package application;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import mechanics.GameCharacter;

public class NewCharacterStage {
	
	public static void draw(){
		GameCharacter character = new GameCharacter();
		Stage stage = new Stage();
		stage.setTitle("Add new character");
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 200, 200);
		stage.setScene(scene);
		stage.show();
		
	}

}
