package com.bl.moodanalyzer;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        String messageForEmptyString = "Message cannot be empty";
        String messageForNullString = "Message cannot be null";
        try {
            if (message.length() == 0 )
                throw new MoodAnalysisException("Message cannot be empty",MoodAnalysisException.TypeOfException.ENTERED_EMPTY);
            if (message.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Message cannot be null",MoodAnalysisException.TypeOfException.ENTERED_NULL);
        }
    }
}


