package OOP.TrafficLight;

public class TrafficLight {

    private String color;
    private int time;

    public TrafficLight(String color, int time){
        this.color = color.toLowerCase();
        this.time = time;
    }

    public String getColor(){
        return color;
    }

    public int getDuration(){
        return time;
    }

    public void changeColor(String newColor){
        this.color = newColor.toLowerCase();
    }

    public void changeDuration(int newTime){
        this.time = newTime;
    }

    public boolean checkRed(){
        return color.equals("red");
    }

    public boolean checkGreen(){
        return color.equals("green");
    }
}
