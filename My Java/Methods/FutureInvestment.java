package Methods;

import java.text.DecimalFormat;

public class FutureInvestment {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat(".##");
        
        double principal = 1000;
        double rate = 0.10;
        double years = 5;

        System.out.println("Years" + "\t" + "Future Value");
        for(int i = 1; i < years + 1; i++){
            System.out.println(i + "\t" + decimalFormat.format(futureInvest(principal, rate, i)));
        }

    }

    static double futureInvest(double principal, double rate, double years){

        double amount = principal * Math.pow(1 + (rate / 12), 12 * years);
        
        return amount;

    }

}
