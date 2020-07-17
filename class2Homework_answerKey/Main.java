package class2Homework_answerKey;

public class Main {

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

	public boolean hasTeen(int a, int b, int c) {
		return a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19;
	}

	public boolean makes10(int a, int b) {
		return a == 10 || b == 10 || a + b == 10;
	}
}
