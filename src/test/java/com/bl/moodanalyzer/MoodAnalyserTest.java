package com.bl.moodanalyzer;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void whenGivenMessageAbilityToAnalyseAndRespondHappy_shouldReturnTrue(){
        String message = "I am in Any Mood";
        String expectedmessage = "HAPPY";
        String actualmessage = moodAnalyser.analyseMood(message);
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void whenGivenMessageAbilityToAnalyseAndRespondHappy_shouldReturnFalse(){
        String message = "I am in Sad Mood";
        String expectedmessage = "SAD";
        String actualmessage = moodAnalyser.analyseMood(message);
        Assert.assertEquals(expectedmessage, actualmessage);
    }
}
