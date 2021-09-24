package com.bridgelabz.moodanalyser;

public class MoodAnalyser{
	String message;
	public MoodAnalyser() {
		this.message ="This is a happy message";
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyzeMood() {
		try {
			if(message.toLowerCase().contains("sad")) {
				return "SAD";
			}
			return "HAPPY";
		}
		catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}
