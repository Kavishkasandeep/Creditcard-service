package com.example.demo.creditcardservice.creditcardeligibility;

public class CustomerRequest {

    private String customerNIC;
    private int age;
    private double annualIncome;
    private int creditScore;


    public String getCustomerNIC() {
        return customerNIC;
    }

    public void setCustomerNIC(String customerNIC) {
        this.customerNIC = customerNIC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getAnnualIncome(){
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome){
        this.annualIncome=annualIncome;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
