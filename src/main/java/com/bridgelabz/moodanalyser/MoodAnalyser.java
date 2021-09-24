package com.bridgelabz.moodanalyser;

public class MoodAnalyser{
	String message;
	public MoodAnalyser() {
		this.message ="";
	}
	public void MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyzeMood(String message) {
		if(message.toLowerCase().contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
