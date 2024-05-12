package RecursiveMethods;

import java.util.ArrayList;
import java.util.List;

// First, we define a class "StringPermutationGenerator" that includes a recursive method generatePermutations() to generate all possible permutations of a given string str.

// The generatePermutations() method has two cases:

// Base case: If the string is empty (str.isEmpty()), we add the current permutation (current) to the list of permutations.

// Recursive case: For any non-empty string, we iterate through each character in the string and generate permutations by appending the character to the current permutation. We then recursively call the method with the remaining characters as the new string. This process continues until the string is reduced to an empty string.

// In the main() method, we demonstrate the generatePermutations() method by generating all possible permutations of the string "abc" and printing the result.

// Sample Output:

// Permutations of "abc":
// abc
// acb
// bac
// bca
// cab
// cba

public class StringPermutationGenerator {
    public static void main(String[] args) {
        List<String> permutations = generatePermutations("abc");

        System.out.println("Permutations of \"abc\":");

        for(String s: permutations){
            System.out.println(s);
        }
    }

    static void recursion(String str, String temp, List<String> permutation){
        if(str.isEmpty()){
            permutation.add(temp);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char firstChar = str.charAt(i);
            String remainder = str.substring(0, i) + str.substring(i + 1);
            recursion(remainder, temp + firstChar, permutation);
        }
    }

    static List<String> generatePermutations(String str){
        List<String> permutations = new ArrayList<String>();
        recursion(str, "", permutations);
        return permutations;
    }


}
