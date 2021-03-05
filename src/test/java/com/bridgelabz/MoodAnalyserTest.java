package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MoodAnalyserTest {

    @Test
    public void given_Sad_Should_Return_Sad() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void given_Happy_Should_Return_Happy() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void given_Null_Mood_Should_Handle_Exception() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void given_Empty_Mood_Should_Handle_Exception() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
        String mood = " ";
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY,e.type);
        }
    }
}
