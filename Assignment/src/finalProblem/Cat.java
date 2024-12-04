package finalProblem;

public class Cat extends Animal {
    private final String sound = "Meow";

    @Override
    public void makeSound() {
        System.out.println(sound);
    }
}
