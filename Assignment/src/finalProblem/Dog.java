package finalProblem;

public class Dog extends Animal{
    private final String sound = "Woof";

    @Override
    public void makeSound() {
        System.out.println(sound);
    }
}
