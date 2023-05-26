package br.com.icev.estruturadedados.testScores;

import java.time.LocalDate;

import br.com.icev.estruturadedados.stack.*;

public class TestScoresApp {

	public static void main(String[] args) throws Exception {

		StackGeneric<TestScores> testscore = new StackGeneric<>();
		StackGeneric<TestScores> reversetestscore = new StackGeneric<>();

		// creating new scores to stock
		TestScores score1 = new TestScores(6.3, LocalDate.now());
		TestScores score2 = new TestScores(8.1, LocalDate.now());
		TestScores score3 = new TestScores(4.9, LocalDate.now());

		// inserting the scores on the stack
		testscore.push(score1);
		testscore.push(score2);
		testscore.push(score3);

		// putting the scores in a reverse order on other stack
		while (!testscore.isEmpty()) {

			reversetestscore.push(testscore.top());
			testscore.pop();
		}
		// printing the reverser test scores
		try {
			if (!reversetestscore.isEmpty()) {
				for (int i = 0; i < reversetestscore.size(); i++) {
					System.out.println("Scores" + reversetestscore.get(i));
				}
			}
			// error if the stack is empty
		} catch (Exception e) {
			System.out.println("Stack is empty!");
		}

	}

}
