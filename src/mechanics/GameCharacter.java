package mechanics;

import java.util.ArrayList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class GameCharacter {
	
	private StringProperty name;
	private IntegerProperty initiative;
	private IntegerProperty hitpoints;
	private IntegerProperty armourClass;
	private IntegerProperty fortitude;
	private IntegerProperty reflex;
	private IntegerProperty willpower;
	private IntegerProperty speed;
	
	public IntegerProperty getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(IntegerProperty hitpoints) {
		this.hitpoints = hitpoints;
	}

	public IntegerProperty getSpeed() {
		return speed;
	}

	public void setSpeed(IntegerProperty speed) {
		this.speed = speed;
	}

	private ArrayList<String> conditions;
	
	public GameCharacter() {
		super();
	}

	public StringProperty getName() {
		return name;
	}

	public void setName(StringProperty name) {
		this.name = name;
	}

	public IntegerProperty getInitiative() {
		return initiative;
	}

	public void setInitiative(IntegerProperty initiative) {
		this.initiative = initiative;
	}

	public IntegerProperty getArmourClass() {
		return armourClass;
	}

	public void setArmourClass(IntegerProperty armourClass) {
		this.armourClass = armourClass;
	}

	public IntegerProperty getFortitude() {
		return fortitude;
	}

	public void setFortitude(IntegerProperty fortitude) {
		this.fortitude = fortitude;
	}

	public IntegerProperty getReflex() {
		return reflex;
	}

	public void setReflex(IntegerProperty reflex) {
		this.reflex = reflex;
	}

	public IntegerProperty getWillpower() {
		return willpower;
	}

	public void setWillpower(IntegerProperty willpower) {
		this.willpower = willpower;
	}

	public ArrayList<String> getConditions() {
		return conditions;
	}

	public void addCondition(String condition) {
		this.conditions.add(condition);
	}

}
