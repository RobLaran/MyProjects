package OOP.TrafficLight;

class Main {
    public static void main(String[] args) {
        
        TrafficLight traffic = new TrafficLight("Red", 30);

        System.out.println("The light is red: " + traffic.checkRed());
        System.out.println("The light is green: " + traffic.checkGreen());

        traffic.changeColor("Green");

        System.out.println("The light is now green: " + traffic.checkGreen());
        System.out.println("The light duration is: " + traffic.getDuration());

        traffic.changeDuration(20);

        System.out.println("The light duration is now: " + traffic.getDuration());

    }
}