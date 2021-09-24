package com.bridgelabz.moodanalyser;

public class MoodAnalyser{
	String message;
	public MoodAnalyser() {
		
	}
	public void MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyzeMood(String message) {
		if(message.contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
