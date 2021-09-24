package com.bridgelabz.moodanalyser;

public class MoodAnalyser{
	String message;
	public MoodAnalyser() {
		this.message ="This is a happy message";
		this.message ="This is a sad message";
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyzeMood() {
		if(message.toLowerCase().contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
