package com.hknyildz.oopj.ch10_67.car;

public class AccountClient {


    public void sendMoneyTo(Account account1, Account account2, double balance) {
        if (account1.getBalance()<balance)
        {
            System.out.println("Balance is not enough");
            System.out.println("You can send "+account1.getBalance()+"Max");
        }
        else
        {
            account1.setBalance(account1.getBalance() - balance);
            account2.setBalance(account2.getBalance() + balance);
        }

    }

    public void depositMoney(Account account, double cash) {
        account.setBalance(account.getBalance() + cash);
    }

    public void withdrawMoney(Account account, double cash) {
        if (account.getBalance() < cash) {
            System.out.println("Balance is not enough");
            System.out.println("Current balance is: " + account.getBalance());
        } else {
            account.setBalance(account.getBalance() - cash);
        }

    }


}
