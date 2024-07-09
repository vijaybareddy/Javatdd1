package com.neoteric.javatdd1.Service.Bank;

import com.neoteric.javatdd1.model.Bank.Account;
import com.neoteric.javatdd1.model.Bank.Bank;

import java.util.UUID;

public class BankService {


        public Account getAccount(Bank customer1){

            Account account=null;

            if(customer1.age>18){


                account=new Account();


                account.Number="TG"+ UUID.randomUUID().toString();
                account.BranchName="Hyd";

                account.IFSC="SBIIFSC";


            }

            return account;

        }

    }

