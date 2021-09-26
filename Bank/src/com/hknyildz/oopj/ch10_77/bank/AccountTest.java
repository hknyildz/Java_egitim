package com.hknyildz.oopj.ch10_77.bank;

public class AccountTest {

    public static void main(String[] args) {

        Account account1 = new Account("Hakan Yıldız", "0000 0000 0000 0000", "123");
        Account account2 = new Account("Onur Gursoy", "1111 1111 1111 111", "456");
        AccountClient client = new AccountClient();
        client.depositMoney(account1,5000);
        client.depositMoney(account2,2500);
        client.sendMoneyTo(account1, account2, 200);
        client.withdrawMoney(account2,3000);
        client.sendMoneyTo(account2,account1,3000);
        System.out.println("ac1:"+account1.getBalance()+"ac2:"+account2.getBalance());

    }
}
