package com.neoteric.javatdd1;

import org.junit.jupiter.api.Test;

public class StudentFromTest {
    @Test
    public  void test() {
        Student parent1=new Student();
        //System.out.println(" first name :"+parent1.firstName);
        parent1.firstName=new char[]{'v','i','j','a','y'};
        System.out.println(parent1.firstName);

        Student parent2=new Student();
       // System.out.println(" first name :"+parent2.firstName);
       /// parent2.firstName=new char[]{'s','i','m','h','a'};
        char first='s';
        char second='i';
        char third='m';
        char fourth='h';
        char fifth='a';
        parent2.firstName = new char[]{first, second, third, fourth, fifth};
        System.out.println(parent2.firstName);

        Student parent3=new Student();
        //  System.out.println(" first name :"+parent3.firstName);
        parent3.firstName=new char[5];
        parent3.firstName[0]='R';
        parent3.firstName[1]='e';
        parent3.firstName[2]='d';
        parent3.firstName[3]='d';
        parent3.firstName[4]='y';
        System.out.println(parent3.firstName);

Student naveen=new Student();
char naveenName[]=new char[6];
naveenName[0]='N';
naveenName[1]='A';
naveenName[2]='V';
naveenName[3]='E';
naveenName[4]='E';
naveenName[5]='N';
        System.out.println("Naveen");



    }

}


