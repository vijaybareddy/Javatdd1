package com.neoteric.javatdd1;

public class InsuranceFrom {
    public String FullName;
    public String DOB;
    public String Gender;

    public String Address;
    public String PhNo;

    public String email;
    public String employerName;
    public String JobDetl;
    public String AnnualIncome;
    public String PlanType;
    public String PayMentDetails;

    @Override
    public String toString() {
        return "InsuranceFrom{" +
                "FullName='" + FullName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Address='" + Address + '\'' +
                ", PhNo='" + PhNo + '\'' +
                ", email='" + email + '\'' +
                ", employerName='" + employerName + '\'' +
                ", JobDetl='" + JobDetl + '\'' +
                ", AnnualIncome='" + AnnualIncome + '\'' +
                ", PlanType='" + PlanType + '\'' +
                ", PayMentDetails='" + PayMentDetails + '\'' +
                '}';
    }
}
