package com.bl.moodanalyzer;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {


    @Test
    public void whenGivenMessageAbilityToAnalyseAndRespondHappy_shouldReturnTrue() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy Mood");
            String expectedmessage = "HAPPY";
        String actualmessage = moodAnalyser.analyseMood();
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void whenGivenMessageAbilityToAnalyseAndRespondHappy_shouldReturnFalse() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad mood");
        String actualmessage = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", actualmessage);
    }
    @Test
    public void whenGivenNullMessage_shouldThrowException() {

        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String actualmessage = moodAnalyzer.analyseMood();
        Assert.assertEquals("Happy", actualmessage);
   }

}

