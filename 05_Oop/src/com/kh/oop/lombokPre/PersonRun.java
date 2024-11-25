package com.kh.oop.lombokPre;

public class PersonRun {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("leo");
        person1.setAge(24);

        Person person2 = new Person("leo", 24);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
