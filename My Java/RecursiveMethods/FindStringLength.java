package RecursiveMethods;
import java.util.Scanner;

// First, we define a class "StringLengthCalculator" that includes a recursive method calculateStringLength() to find the length of a given string str.

// The calculateStringLength() method has two cases:

// Base case: If the string is empty (str.isEmpty()), we return 0 as the length of an empty string is 0.

// Recursive case: For any non-empty string, we remove the first character using str.substring(1) and recursively call the method with the remaining substring. We then add 1 to the length calculated from the recursive call. This process continues until the string is reduced to an empty string.

// In the main() method, we demonstrate the calculateStringLength() method by finding the length of the string "Hello, World!" and printing the result.

// Sample Output:

// The length of the string "Java Exercises!" is: 15

public class FindStringLength {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String str = promptUser();
        System.out.println("The length of the string \""+ str + "\" is: " + calculateStringLength(str));
    }
    static String promptUser(){
        System.out.print("Enter string: ");
        String string = scan.nextLine();
        return string;
    }
    static int calculateStringLength(String str){
        if(str.isEmpty()){
            return 0;
        }
        return 1 + calculateStringLength(str.substring(1));
    }
}
