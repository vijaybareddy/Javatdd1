package com.neoteric.javatdd1.Service.Student;

import com.neoteric.javatdd1.Service.Student.StudentFromService;
import com.neoteric.javatdd1.model.Student.Address;
import com.neoteric.javatdd1.model.Student.StudentAdmission;
import com.neoteric.javatdd1.model.Student.StudentFrom;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StudentFromServiceTest {
    @Test
    public void getStudentAgeGreaterThanSix(){
        StudentFrom vijay=new StudentFrom();
        vijay.firstName="Vijay";
        vijay.age=6;
        vijay.mobileNo="9154788755";
        vijay.address="hyd";
        System.out.println(vijay.firstName);


        Address vijayAddress=new Address();
        vijayAddress.city="Hyd";
        vijayAddress.flatNo="3-187";
        vijayAddress.pinCode="508256";
        vijayAddress.street="Hyd";


        vijay.address= String.valueOf(vijayAddress);

        StudentFromService studentFromService=new StudentFromService();
        StudentAdmission studentAdmission=studentFromService.getAddressAdmission(vijay);
        Assertions.assertEquals(10000,studentAdmission.fee);
        Assertions.assertNotNull(studentAdmission.rollNumber);


    }
    @Test
    public void getStudentAgeLessThanThanSix(){
        StudentFrom vijay=new StudentFrom();
        vijay.firstName="Vijay";
        vijay.age=6;
        vijay.mobileNo="9154788755";
        vijay.address="hyd";
        System.out.println(vijay.firstName);

        Address vijayAddress=new Address();
        vijayAddress.city="Hyd";
        vijayAddress.flatNo="3-187";
        vijayAddress.pinCode="508256";
        vijayAddress.street="Hyd";


        vijay.address= String.valueOf(vijayAddress);

        StudentFromService studentFromService=new StudentFromService();
        StudentAdmission studentAdmission=studentFromService.getAddressAdmission(vijay);
        Assertions.assertEquals(10000,studentAdmission.fee);
        Assertions.assertNull(studentAdmission);










    }

}


