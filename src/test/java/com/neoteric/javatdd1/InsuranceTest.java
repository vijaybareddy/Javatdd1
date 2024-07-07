package com.neoteric.javatdd1;

import org.junit.jupiter.api.Test;

public class InsuranceTest {
    @Test
    public void test(){
        InsuranceFrom insuranceFrom=new InsuranceFrom();
        insuranceFrom.FullName="VijayBareddy";
        insuranceFrom.Address="Hyd";
        insuranceFrom.DOB="19.02.2000";
        insuranceFrom.AnnualIncome="300000";
        insuranceFrom.Gender="Male";
        insuranceFrom.email="Vijaybareddy143@gmail.com";
        insuranceFrom.employerName="Vijay";
        insuranceFrom.JobDetl="Neoteric";
        insuranceFrom.PhNo="9154788755";
        insuranceFrom.PayMentDetails="nanziuj123";
        insuranceFrom.PlanType="10000000";
        System.out.println("InsuranceFrom");
    }
}
