package com.bl.moodanalyzer;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
    @Test
    public void whenGivenMessageAbilityToAnalyseAndRespondHappy_shouldReturnTrue() {

        String expectedmessage = "HAPPY";
        String actualmessage = moodAnalyser.analyseMood();
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void whenGivenMessageAbilityToAnalyseAndRespondHappy_shouldReturnFalse() {
        String expectedmessage = "SAD";
        String actualmessage = moodAnalyser.analyseMood();
        Assert.assertEquals(expectedmessage, actualmessage);
    }
}

