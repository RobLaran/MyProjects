package OOP.Airplane;

import java.time.LocalTime;

public class Airplane {

    private String flightNumber;
    private String destination;
    private LocalTime scheduledTimeDeparture;
    private int delayedTime = 0;

    public Airplane(String number, String destination, int hour, int minutes){
        this.flightNumber = number;
        this.destination = destination;
        this.scheduledTimeDeparture = LocalTime.of(hour, minutes);
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public LocalTime getSchedule(){
        return scheduledTimeDeparture;
    }

    public void setFlightNumber(String number){
        this.flightNumber = number;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setScheduleDeparture(LocalTime timeDeparture){
        this.scheduledTimeDeparture = timeDeparture;
    }

    public void setDelayTime(int time){
        this.delayedTime = time;
    }

    public void checkStatus(){
        if(delayedTime == 0){
            System.out.println("Flight " + flightNumber + "is on time.");
        } else {
            System.out.println("Flight " + flightNumber + "is delayed by " + delayedTime + " minutes.");
        }
    }

}
