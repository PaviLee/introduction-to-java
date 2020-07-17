package class3Homework_answerKey;

import java.awt.Color;

public class Alien {

	Color color;
	String mood;
	boolean canMakeNoise;

	public Alien() {
		color = Color.BLUE;
		mood = "sad";
		canMakeNoise = false;
	}

	public Alien(Color color, String mood, boolean canMakeNoise) {
		this.color = color;
		this.mood = mood;
		this.canMakeNoise = canMakeNoise;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

	public Color getColor() {
		return color;
	}

	public String getMood() {
		return mood;
	}

	public void makeNoise() {
		if (!canMakeNoise) {
			return;
		} else if (mood.equals("sad")) {
			System.out.println("Sadness noises");
		} else if (mood.equals("mad")) {
			System.out.println("Growl");
		} else if (mood.equals("happy")) {
			System.out.println("Purrr");
		}
	}
}
