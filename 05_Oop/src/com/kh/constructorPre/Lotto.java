package com.kh.constructorPre;

public class Lotto {
    public int[] lotto = new int[6];

    public Lotto() {
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45 + 1);
        }
    }

    public void randomNumber() {
        int count = 0;
        boolean 중복확인 = false;
        int num = 0;

        while (count < 6) {
            num = (int) (Math.random() * 45 + 1);


            for (int i = 0; i < lotto.length; i++) {
                if (num == lotto[i]) {
                    중복확인 = true;
                    break;
                }
            }
        }
        if (!중복확인) {
            lotto[count] = num;
            count ++;
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
