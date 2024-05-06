package OOP.Dog;

public class Main {

    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Burn", "Golden Retriever");
        Dog dog2 = new Dog("Sia", "Samoyed");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());

        System.out.println("Set the new Breed of dog1 and name of dog2");

        dog1.setBreed("German Shepherd");
        dog2.setName("Sofy");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());

    }

}
