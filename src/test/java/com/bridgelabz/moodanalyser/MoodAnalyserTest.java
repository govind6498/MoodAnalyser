package com.bridgelabz.moodanalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {
		MoodAnalyser moodanalyser = new MoodAnalyser("This is a Sad message");
		String mood = moodanalyser.analyzeMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {

		MoodAnalyser moodanalyser = new MoodAnalyser("This is a Happy message");
		String mood = moodanalyser.analyzeMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
	@Test
	public void givenMessage_WhenNul_ShouldReturnHapy() {
		MoodAnalyser moodanalyser = new MoodAnalyser(null);
		String mood = moodanalyser.analyzeMood();
		Assert.assertEquals("HAPPY",mood);
	}
}