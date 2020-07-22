package class4Homework_answerKey;

import java.awt.Color;

public class Hat {

	Color color;
	boolean hasBrim;
	String material;

	public Hat() {
		color = Color.BLACK;
		hasBrim = false;
		material = "cloth";
	}

	public Hat(Color color, boolean hasBrim, String material) {
		this.color = color;
		this.hasBrim = hasBrim;
		this.material = material;
	}

	public int getCost() {
		int cost = 5;
		if (!hasBrim) {
			cost--;
		} else {
			cost++;
		}

		if (material.equals("cloth")) {
			cost += 2;
		} else if (material.equals("straw")) {
			cost += 3;
		}

		return cost;
	}

	public boolean isBeachHat() {
		return hasBrim && material.equals("straw");
	}
}