package com.kh.oop.constructor;

public class SnackRun {
    public static void main(String[] args) {
        Snack sr1 = new Snack();
        sr1.setType("초코칩 쿠키");
        sr1.setPrice(2000);
        sr1.setFlavor("달콤한 초코맛");

        Snack sr2 = new Snack("새우깡", 1200, "짭짤한 새우맛");

        System.out.println(sr1);
        System.out.println(sr2);
    }
}
