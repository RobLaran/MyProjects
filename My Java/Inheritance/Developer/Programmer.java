package Inheritance.Developer;

// Programming Language: Java
// Bonus 12$
// Work Write Code
// Performance Excellent

public class Programmer extends Developer{
    public Programmer(String name, String address, double salary, String progLang){
        super(name, address, salary, "Programmer", progLang);
    }

    public double calcBonus(){
        return getSalary() * 0.12;
    }

    public String reportPerform(){
        return "Performance Report for " + super.getJobTitle() + " " + super.getName() + ": " + "Excellent";
    }

    public String workStatus(){
        return super.getJobTitle() + " " + super.getName() + " is writing code in " + super.getLang(); 
    }
}
