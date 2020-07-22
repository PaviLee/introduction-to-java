package class4Homework_answerKey;

import java.awt.Color;

public class Textbook {

	String subject;
	Color color;
	int numOfPages;
	int currentPage;

	public Textbook() {
		subject = "Java";
		color = Color.WHITE;
		numOfPages = 90;
		currentPage = 0;
	}

	public Textbook(String subject, Color color, int numOfPages) {
		this.subject = subject;
		this.color = color;
		this.numOfPages = numOfPages;
		currentPage = 0;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public void pageForward() {
		if (currentPage < numOfPages) {
			currentPage++;
		}
	}

	public void pageBackward() {
		if (currentPage > 0) {
			currentPage--;
		}
	}
}