package com.bridgelabz.moodanalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad message");
		String mood = moodAnalyser.analyzeMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {

		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy message");
		String mood = moodAnalyser.analyzeMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowAnalysisException() {
		try {

			MoodAnalyser moodAnalyser = new MoodAnalyser("");
			moodAnalyser.analyzeMood();
		}
		catch(MoodAnalyserException e) {

			Assert.assertEquals(exceptionType.ENTERED_EMPTY,e.type);			
		}
	}
}