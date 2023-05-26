package br.com.icev.estruturadedados.testScores;

import java.time.LocalDate;

public class TestScores {

	double testScore;
	LocalDate testDay;

	//constructor metthod
	public TestScores(double testScore, LocalDate testDay) {
		super();
		this.testScore = testScore;
		this.testDay = testDay;
	}

	//getter and setters
	public double getTestScore() {
		return testScore;
	}

	public void setTestScore(double testScore) {
		this.testScore = testScore;
	}

	public LocalDate getTestDay() {
		return testDay;
	}

	public void setTestDay(LocalDate testDay) {
		this.testDay = testDay;
	}

	@Override
	public String toString() {
		return "TestScores [testScore=" + testScore + ", testDay=" + testDay + "]";
	}

	//toString method
	
}
