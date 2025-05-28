package com.example.demo.creditcardservice.service;

import com.example.demo.creditcardservice.creditcardeligibility.Acknowledgement;
import com.example.demo.creditcardservice.creditcardeligibility.CustomerRequest;
import org.springframework.stereotype.Service;


@Service
public class CreditcardEligibilityService {

    public Acknowledgement checkEligibility(CustomerRequest request) {
        Acknowledgement avj = new Acknowledgement();

        if (request.getAge() >= 18 && request.getAnnualIncome() >= 50000 && request.getCreditScore() > 650) {
            avj.setIsEligible(true);
            avj.setMessage("Congratulations! You are eligible for a credit card.");
        } else {
            avj.setIsEligible(false);
            avj.setMessage("Sorry, you do not meet the eligibility criteria.");
        }

        return avj;
    }
}
