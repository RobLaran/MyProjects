package RecursiveMethods;

public class DigitSumCalculator {
    public static void main(String[] args) {
        int num = 123456;

        int sum = calculateDigitSum(num);

        System.out.println("The sum of the digits of " + num + " is: " + sum);
    }

    static int calculateDigitSum(int number){
        if(number < 10){
            return number;
        }

        int lastDigit = number % 10;
        int remaining = number / 10;

        return lastDigit + calculateDigitSum(remaining);
    }
}
