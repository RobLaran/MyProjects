package Polymorphism.Animal;

public class Main{
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal cat = new Cat();

        bird.makeSound();
        cat.makeSound();
    }
}