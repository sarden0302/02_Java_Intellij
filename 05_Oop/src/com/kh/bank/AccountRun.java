package com.kh.bank;

public class AccountRun {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("동그라미");
        acc.setAccountNumber("1234-56-789");
        acc.setBalance(100);
        acc.setPassword("1234");

        System.out.println(acc.getName());
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getBalance());
        System.out.println(acc.getPassword());

        System.out.println("==== 계좌에 입금을 시작합니다 ====");

        acc.deposit(1234);
        acc.deposit(1000000);

        System.out.println(acc);

    }
}
