package com.neoteric.javatdd1.Service.insurance;

import com.neoteric.javatdd1.model.insurance.Insurance;
import com.neoteric.javatdd1.model.insurance.InsuranceFrom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsuranceTest {
    @Test
    public void insuranceTest(){
        Insurance insurance=new Insurance();
        insurance.FullName="VijayBareddy";
        insurance.Address="Hyd";
        insurance.age=25;
        insurance.price=100000;
        insurance.Gender="Male";
        insurance.email="Vijaybareddy143@gmail.com";
        insurance.employerName="Vijay";
        insurance.JobDetl="Neoteric";
        insurance.PhNo="9154788755";

        InsuranceService service=new InsuranceService();
        service.getinsurance(insurance);

        InsuranceFrom from=service.getinsurance(insurance);

        Assertions.assertEquals(100000,insurance.price);
        Assertions.assertNotNull(insurance);

    }
}
