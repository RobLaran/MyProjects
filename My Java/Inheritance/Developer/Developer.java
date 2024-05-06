package Inheritance.Developer;

// Bonus 10%
// Performance Good
// Work Debug Code
// Programming Language: JavaScript

public class Developer extends Employee{
    private String progLang;

    public Developer(String name, String address, double salary, String jobTitle, String progLang){
        super(name, address, salary, jobTitle);
        this.progLang = progLang;
    }

    public String getLang(){
        return progLang;
    }

    public double calcBonus(){
        return getSalary() * 0.10;
    }

    public String reportPerform(){
        return "Performance Report for " + super.getJobTitle() + " " + super.getName() + ": " + "Good";
    }

    public String workStatus(){
        return super.getJobTitle() + " " + super.getName() + " is debugging code in " + getLang(); 
    }

}
