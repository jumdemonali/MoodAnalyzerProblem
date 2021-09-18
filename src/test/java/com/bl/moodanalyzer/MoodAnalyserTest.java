package com.bl.moodanalyzer;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {


    @Test
    public void whenGivenMessageAbilityToAnalyseAndRespondHappy_shouldReturnTrue() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Any mood");
        String actualMessage = null;
        try {
            actualMessage = moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", actualMessage);
    }

    @Test
    public void whenGivenMessageAbilityToAnalyseAndRespondSad_shouldReturnTrue() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad mood");
        String actualmessage = null;
        try {
            actualmessage = moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", actualmessage);
    }

    @Test
    public void whenGivenNullMessage_shouldThrowException() {

        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String actualMessage = null;
        try {
            actualMessage = moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }
    @Test
    public void whenGivenEmptyMessage_shouldThrowException() {

        MoodAnalyser moodAnalyzer = new MoodAnalyser("");
        String actualMessage = " ";
        try {
            actualMessage = moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println(e);
        }
    }
   }


