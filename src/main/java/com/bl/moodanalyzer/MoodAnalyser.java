package com.bl.moodanalyzer;

public class MoodAnalyser {
    public String message="I am in happy Mood";
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
            if (message.toLowerCase().contains("happy")) {
                return "HAPPY";
            }
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return null;
            }
        }
    }


