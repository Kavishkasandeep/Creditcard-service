package com.example.demo.creditcardservice.endpoint;

import com.example.demo.creditcardservice.creditcardeligibility.Acknowledgement;
import com.example.demo.creditcardservice.creditcardeligibility.CustomerRequest;
import com.example.demo.creditcardservice.service.CreditcardEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CreditcardEligibilityEndpoint {


    private static final String NAMESPACE = "com/example/demo/creditcardservice/CreditCardEligibility";

    @Autowired
    private CreditcardEligibilityService creditcardEligibilityService;

    @PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement getCreditcardEligibility(@RequestPayload CustomerRequest request) {
        return creditcardEligibilityService.checkEligibility(request);
    }
}
