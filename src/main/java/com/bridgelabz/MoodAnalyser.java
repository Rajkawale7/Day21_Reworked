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

            try {
                if (message.equalsIgnoreCase(message))
                    return "SAD";
                else if (message.equalsIgnoreCase(message))
                    return "HAPPY";
                else if (message.isEmpty() || message == null)
                    throw new MoodAnalysisException("Invalid Mood");
                else
                    return "No Match";

            } catch (MoodAnalysisException e) {
                e.printStackTrace();
                return "Invalid Mood";
            }
        }
}