package com.bl.moodanalyzer;

public class MoodAnalysisException extends Exception {
    TypeOfException type;

    enum TypeOfException {
        ENTERED_NULL,ENTERED_EMPTY;
    }

    public MoodAnalysisException(String message,TypeOfException type) {
        super(message);
        this.type = type;
    }
}
