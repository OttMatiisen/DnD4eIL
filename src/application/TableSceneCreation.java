package application;

import java.util.ArrayList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import mechanics.GameCharacter;

public class TableSceneCreation {

	public static Scene listScene(Stage stage, BorderPane root) {
		Scene scene = new Scene(root, 1200, 800);

		TableView<GameCharacter> table = new TableView<GameCharacter>();
		TableColumn<GameCharacter, StringProperty> nameColumn = new TableColumn<GameCharacter, StringProperty>("Name");
		TableColumn<GameCharacter, IntegerProperty> initiativeColumn = new TableColumn<GameCharacter, IntegerProperty>(
				"Initiative");
		TableColumn<GameCharacter, TableColumn<GameCharacter, IntegerProperty>> hitpointsColumn = new TableColumn<GameCharacter, TableColumn<GameCharacter, IntegerProperty>>(
				"Hit Points");
		TableColumn<GameCharacter, IntegerProperty> currentHPColumn = new TableColumn<GameCharacter, IntegerProperty>("HP");
		TableColumn<GameCharacter, IntegerProperty> temporaryHPColumn = new TableColumn<GameCharacter, IntegerProperty>("Temp");
		TableColumn<GameCharacter, IntegerProperty> maximumHPColumn = new TableColumn<GameCharacter, IntegerProperty>("MAX");
		TableColumn<GameCharacter, TableColumn<GameCharacter, IntegerProperty>> defencesColumn = new TableColumn<GameCharacter, TableColumn<GameCharacter, IntegerProperty>>(
				"Defences");
		TableColumn<GameCharacter, IntegerProperty> armourClassColumn = new TableColumn<GameCharacter, IntegerProperty>("AC");
		TableColumn<GameCharacter, IntegerProperty> fortitudeColumn = new TableColumn<GameCharacter, IntegerProperty>("FORT");
		TableColumn<GameCharacter, IntegerProperty> reflexColumn = new TableColumn<GameCharacter, IntegerProperty>("REF");
		TableColumn<GameCharacter, IntegerProperty> willpowerColumn = new TableColumn<GameCharacter, IntegerProperty>("WILL");
		TableColumn<GameCharacter, IntegerProperty> speedColumn = new TableColumn<GameCharacter, IntegerProperty>("Speed");
		TableColumn<GameCharacter, ArrayList<String>> conditionsColumn = new TableColumn<GameCharacter, ArrayList<String>>(
				"Conditions");
		defencesColumn.getColumns().addAll(armourClassColumn, fortitudeColumn, reflexColumn, willpowerColumn);
		hitpointsColumn.getColumns().addAll(currentHPColumn, temporaryHPColumn, maximumHPColumn);
		table.getColumns().addAll(initiativeColumn, nameColumn, hitpointsColumn, defencesColumn, speedColumn, conditionsColumn);

		root.setCenter(table);
		
		
		HBox dashboardLeft = new HBox();
		dashboardLeft.setPadding(new Insets(20));
		dashboardLeft.setSpacing(40);
		Button addCharacter = new Button("Add GameCharacter");
		Button addList = new Button("Add list of GameCharacters");
		Button sort = new Button("Order by Initiative");
		Button save = new Button("Save list");
		save.setDisable(true);
		sort.setDisable(true);
		addList.setDisable(true);
		dashboardLeft.getChildren().addAll(addCharacter, addList, sort, save);
		
		Label roundCounter = new Label("Round x");
		Button backButton = new Button("Back");
		Button nextButton = new Button("Next turn");
		HBox dashboardRight = new HBox(roundCounter, backButton, nextButton);
		dashboardRight.setPadding(new Insets(20));
		dashboardRight.setSpacing(40);
		BorderPane bottomPane = new BorderPane();
		bottomPane.setLeft(dashboardLeft);
		bottomPane.setRight(dashboardRight);
		
		root.setBottom(bottomPane);
		return scene;
	}

}
