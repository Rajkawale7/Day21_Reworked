package com.bridgelabz;

public class MoodAnalyser {
        public static String message;

        // Constructor
        public MoodAnalyser(String message) {
            this.message = message;
            analyseMood();
        }

        //Getter
        public String getMessage() {
            return message;
        }

        //Setter
        public void setMessage(String message) {
            this.message = message;
        }

        public String analyseMood() {

            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else if (message.toLowerCase().contains("happy")) {
                return "Happy";
            } else if (message.isEmpty() || message == null)
                try {
                    throw new MoodAnalysisException("Invalid Mood");
                } catch (MoodAnalysisException e) {
                    e.printStackTrace();
                }
            else
                return "No Match";
                return null;
        }
    }