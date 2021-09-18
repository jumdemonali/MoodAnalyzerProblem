package com.bl.moodanalyzer;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.toLowerCase().contains("any")) {
            return "HAPPY";
        }
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return null;
        }
    }
}
