package Methods;

import java.util.Scanner;

public class CountWords {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String string = "";

        string = inputString(string);

        System.out.println(countWords(string));
    }

    static String inputString(String string){
        System.out.print("Input string: ");
        return string = scan.nextLine();
    }

    public static String countWords(String string){
        int count = 1;

        if(!(" ".equals(string.substring(0,1))) && !(" ".equals(string.substring(string.length() - 1)))){
            for(int i = 0; i < string.length(); i++){
                if((string.charAt(i) == ' ') && ((string.charAt(i + 1) != ' ')) ){
                    count += 1;
                }
            }
            return "Number of words in the string: " + Integer.toString(count);
        }
            
        return "Please start with a letter(not space)";
    }

}
