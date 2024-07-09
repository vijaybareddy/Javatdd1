package com.neoteric.javatdd1.Service.Student;

import com.neoteric.javatdd1.model.Student.StudentAdmission;
import com.neoteric.javatdd1.model.Student.StudentFrom;

import java.util.UUID;

public class StudentFromService {
    public StudentAdmission getAddressAdmission(StudentFrom vijay) {
        //input Student
        StudentAdmission studentAdmission = null;
        //procession
        if (vijay.age>6){


             studentAdmission = new StudentAdmission();
        studentAdmission.rollNumber = "TG" + UUID.randomUUID().toString();
        studentAdmission.fee = 10000;
        studentAdmission.standard = vijay.standard;


    }



        return studentAdmission;

    }
}
