package com.kh.poly.pack2.animalPre;

public class AnimalRun {
    public static void main(String[] args) {
        Dog dog1 = new Dog("바둑이", 3, "진돗개", 2);
        Cat cat1 = new Cat("나비", 2, "흰색", 8);

        System.out.println(dog1.toString());
        System.out.println(cat1.toString());
    }
}
