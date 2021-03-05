package com.bridgelabz;

import java.security.PublicKey;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analyseMood(String message) throws MoodAnalysisException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.length() == 0){
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY,"Enter proper input");
            }
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL,"Enter proper input");
        }
    }
}
