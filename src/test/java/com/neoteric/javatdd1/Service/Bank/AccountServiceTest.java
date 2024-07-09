package com.neoteric.javatdd1.Service.Bank;

import com.neoteric.javatdd1.Service.Bank.BankService;
import com.neoteric.javatdd1.model.Bank.Account;
import com.neoteric.javatdd1.model.Bank.Address;
import com.neoteric.javatdd1.model.Bank.Bank;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountServiceTest {

        @Test
        public void getAccountAgeGreaterThaneTwenty() {


            Bank customer1 = new Bank();

            customer1.FirstName = "Vijay";
            customer1.age = 24;
            customer1.ContactNumber = 915478875;
            customer1.Date = 19-02-2020;


            Address address = new Address();
            address.StreetName = "MainRoad";
            address.Area = "busstand ";
            address.City = "Kodad";
            address.District = "suryapet";
            address.PinCode = 232222;


            customer1.addresss=String.valueOf(address);
            BankService accountService = new BankService();
            Account account = accountService.getAccount(customer1);
            //System.out.println(customer1);
            //System.out.println(account);
            Assertions.assertEquals(24, customer1.age);
            Assertions.assertNotNull(account.Number);

        }

        @Test
        public void getAccountAgeLessThaneTwenty() {


            Bank customer1 = new Bank();

            customer1.FirstName = "Vijay";
            customer1.age = 19;
            customer1.ContactNumber = 915478875;
            customer1.Date = 19-02-2020;


            Address address = new Address();

            address.StreetName = "MainRoad";
            address.Area = "busstand ";
            address.City = "Kodad";
            address.District = "suryapet";
            address.PinCode = 232222;


            customer1.addresss=String.valueOf(address);
            BankService accountService = new BankService();
            Account account = accountService.getAccount(customer1);
          //  System.out.println(customer1);
            //System.out.println(account);
            Assertions.assertEquals(19, customer1.age);
            Assertions.assertNotNull(account);

        }


    }



