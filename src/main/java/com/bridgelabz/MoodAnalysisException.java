package com.bridgelabz;

public class MoodAnalysisException extends Exception {
    String message;
    public MoodAnalysisException(String message) {
        this.message = message;
    }
}
