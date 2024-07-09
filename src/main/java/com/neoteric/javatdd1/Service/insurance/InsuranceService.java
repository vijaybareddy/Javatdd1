package com.neoteric.javatdd1.Service.insurance;

import com.neoteric.javatdd1.model.insurance.Insurance;
import com.neoteric.javatdd1.model.insurance.InsuranceFrom;

import java.util.UUID;

public class InsuranceService {
    public InsuranceFrom getinsurance(Insurance insurance) {
        InsuranceFrom from = null;
        if (insurance.age > 24 && insurance.age < 60) {
            from = new InsuranceFrom();
            from.insuranceName = insurance.insuranceName;
            from.policyNo = "Insurance" + UUID.randomUUID().toString();
            from.price = insurance.price;
        }
        return from;
    }
}



