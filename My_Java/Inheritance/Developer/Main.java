package Inheritance.Developer;

public class Main {
    public static void main(String[] args) {
        Manager man = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager");
        Developer dev = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "JavaScript");
        Programmer prog = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Java");

        System.out.println(man.getJobTitle() + "'s Bonus: $" + man.calcBonus());
        System.out.println(dev.getJobTitle() + "'s Bonus: $" + dev.calcBonus());
        System.out.println(prog.getJobTitle() + "'s Bonus: $" + prog.calcBonus() + "\n");

        System.out.println(man.reportPerform());
        System.out.println(dev.reportPerform());
        System.out.println(prog.reportPerform() + "\n");

        System.out.println(man.workStatus());
        System.out.println(dev.workStatus());
        System.out.println(prog.workStatus());

    }
}
