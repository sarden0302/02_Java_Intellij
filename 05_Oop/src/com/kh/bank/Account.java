package com.kh.bank;

public class Account {
    private double balance;
    private String name;
    private String accountNumber;
    private String password;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(this.name + "의 현재 잔액 : " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("출금 금액보다 잔액이 부족합니다.");
            System.out.println("현재 계좌 잔액 : " + balance + "원");
            return;
        }
        this.balance -= amount;
        System.out.println("현재 계좌 잔액 : " + balance + "원");
    }

    public void print() {
        if (balance < 0) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        System.out.println(this.name + "의 현재 잔액 : " + this.balance);
    }
}
