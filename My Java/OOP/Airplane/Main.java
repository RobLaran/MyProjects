package OOP.Airplane;

public class Main {
    public static void main(String[] args) {
        Airplane flight1 = new Airplane("CDE345", "London", 10, 30);
        Airplane flight2 = new Airplane("KUI765", "New York", 14, 0);
        Airplane flight3 = new Airplane("JUY456", "Paris", 14, 0);

        System.out.println("Fight Status:");
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();
        System.out.println();

        System.out.println("Current Flight Status");
        flight1.setDelayTime(40);
        flight2.setDelayTime(110);
        flight1.checkStatus();
        flight2.checkStatus();
        flight3.checkStatus();


    }
}
