package com.bridgelabz.moodanalyser;

public class MoodAnalyser{
	String message;
	public MoodAnalyser() {
		this.message ="This is a happy message";
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}
	public String analyzeMood() throws MoodAnalyserException {
		try {
			if(message.length()==0) {
				throw new MoodAnalyserException(exceptionType.ENTERED_EMPTY,"Please Enter Proper Message!");
			}
			if(message.toLowerCase().contains("sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
			catch(NullPointerException e) {
				throw new MoodAnalyserException(exceptionType.ENTERED_EMPTY,"Please Enter Proper Message!");
			}
		}
}
