package class3Homework_answerKey;

public class Cup {

	String drink;
	boolean isEmpty;
	boolean isBroken;

	public Cup() {
		drink = "water";
		isEmpty = false;
		isBroken = false;
	}

	public Cup(String drink, boolean isEmpty, boolean isBroken) {
		this.drink = drink;
		this.isEmpty = isEmpty;
		this.isBroken = isBroken;
	}

	public void printDrink() {
		if (!isEmpty) {
			System.out.println(drink);
		} else {
			System.out.println("The cup is empty.");
		}
	}

	public void drink() {
		isEmpty = true;
	}

	public void refillDrink(String drink) {
		if (isBroken) {
			System.out.println("The cup is broken and cannot be refilled.");
		} else if (!isEmpty) {
			System.out.println("There is still " + drink + " in the cup.");
		} else {
			this.drink = drink;
		}
	}

	public void dropCup() {
		isBroken = true;
		isEmpty = true;
		drink = "nothing";
	}
}