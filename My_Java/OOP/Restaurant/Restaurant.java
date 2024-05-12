package OOP.Restaurant;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Restaurant {
    private ArrayList<String> items;
    private ArrayList<Double> prices; 
    private ArrayList<Double> ratings;
    private ArrayList<Double> averageRate;
    private ArrayList<Integer> numOfRates;

    DecimalFormat dec = new DecimalFormat(".0");

    public Restaurant(){
        items = new ArrayList<String>();
        prices = new ArrayList<Double>();
        ratings = new ArrayList<Double>();
        numOfRates = new ArrayList<Integer>();
        averageRate = new ArrayList<Double>();
    }

    public void addItem(String item, double price){
        items.add(item);
        prices.add(price);
        ratings.add(0.0);
        numOfRates.add(0);
        averageRate.add(0.0);
    }

    public void removeItem(String item){
        items.remove(item);
        prices.remove(item.indexOf(item));
    }

    public void addRating(String item ,double rating){
        int index = items.indexOf(item);
        ratings.set(index, rating);
        int count = numOfRates.get(index);
        count += 1;
        numOfRates.set(index, count);
        double total = averageRate.get(index);
        total += rating; 
        averageRate.set(index, total);
    }

    public double getAverageRating(String item){
        int index = items.indexOf(item);
        double average = averageRate.get(index) / numOfRates.get(index);
        return average;
    }

    public double calculateAverageRating(){
        double average = 0;

        for(int i  = 0; i < ratings.size(); i++){
            average += ratings.get(i);
        }

        average /= ratings.size();

        return average;
    }

    public void getMenu(){
        for(int i = 0; i < items.size(); i++){
            System.out.println(items.get(i) + ": $" + prices.get(i));
        }
    }

    public void getAverage(){
        for(int i = 0; i < items.size(); i++){
            double res = averageRate.get(i) / numOfRates.get(i);
            System.out.println(items.get(i) + ": " + dec.format(res));
        }
    }


}
