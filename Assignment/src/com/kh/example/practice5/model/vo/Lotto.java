package com.kh.example.practice5.model.vo;

public class Lotto {
    public int[] lotto = new int[6];

    public Lotto() {
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45 + 1);
        }
    }

    public int[] getLotto() {
        return lotto;
    }

    public void setLotto(int[] lotto) {
        this.lotto = lotto;
    }

    public void information() {
        for (int i : lotto) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
