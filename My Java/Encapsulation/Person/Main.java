package Encapsulation.Person;

public class Main {

    public static void main(String[] args) {
        
        Person person = new Person();

        person.setName("Arthfael Viktorija");    
        person.setAge(25);    
        person.setCountry("United States of America");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());

    }
}
