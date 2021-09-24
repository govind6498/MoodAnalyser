package com.bridgelabz.moodanalyser;

public class MoodAnalyser{
	public String analyzeMood(String message) {
		if(message.contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
