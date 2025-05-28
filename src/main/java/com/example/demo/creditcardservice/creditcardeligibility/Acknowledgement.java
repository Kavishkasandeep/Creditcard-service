package com.example.demo.creditcardservice.creditcardeligibility;

public class Acknowledgement {

    private boolean isEligible;
    private String message;

    public boolean getIsEligible() {
        return isEligible;
    }
    public void setIsEligible(boolean isEligible) {
        this.isEligible = isEligible;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}

