package Methods;

import java.util.Scanner;

public class CountVowels {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String string = " ";

        string = inputString(string);
        
        System.out.println("Number of Vowels in the string: " + countVowel(string));
    }

    static String inputString(String string){
        System.out.print("Input a string: ");
        string = scan.nextLine();

        return string;
    }

    private static int countVowel(String string){
        int count = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for(int i = 0; i < string.length(); i++){
            for(int j = 0; j < vowels.length; j++){
                if(string.toLowerCase().charAt(i) == vowels[j]){
                    count++;
                }
            }
        }

        return count;

    }

}
