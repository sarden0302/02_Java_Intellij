package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] animal;
        animal = new Animal[5];
        animal[0] = new Dog("Leo", "Golden Retriever", 1);
        animal[1] = new Cat("Lion", "cat1", "Seoul", "Black");
        animal[2] = new Dog("Leo", "Golden Retriever", 3);
        animal[3] = new Cat("Lion", "cat2", "Seoul", "White");
        animal[4] = new Dog("Leo", "Golden Retriever", 5);

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].toString());
        }

    }
}
