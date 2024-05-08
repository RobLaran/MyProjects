package Leetcode.Easy;

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.


// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

// Example 1:
// Input: s = "III"
// Output: 3
// Explanation: III = 3.

// Example 2:
// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.

// Example 3:
// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

public class RomanToInteger {
    public static void main(String[] args) {
        
        System.out.println(romToInt("CCXLIX"));

    }

    // Symbol       Value
    // I             1
    // V             5
    // X             10
    // L             50
    // C             100
    // D             500
    // M             1000

    public static int romToInt(String str){
        int sum = 0;
        int j = 1;

        for(int i = 0; i < str.length(); i++){
            if(i == str.length() - 1){
                j -= 1;
            }
            
            switch (str.charAt(i)) {
                case 'I':
                    if (str.charAt(i + j) == 'V'){
                        sum += 4;
                        i++;
                    } else if (str.charAt(i + j) == 'X'){
                        sum += 9;
                        i++;
                    } else {
                        sum += 1;
                    }
                    
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (str.charAt(i + j) == 'L'){
                        sum += 40;
                        i++;
                    } else if (str.charAt(i + j) == 'C'){
                        sum += 90;
                        i++;
                    } else {
                        sum += 10;
                    }
                    
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (str.charAt(i + j) == 'D'){
                        sum += 400;
                        i++;
                    } else if (str.charAt(i + j) == 'M'){
                        sum += 900;
                        i++;
                    } else {
                        sum += 100;
                    }
                    
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    break;
            }            
        }


        return sum;
    }

    
}
