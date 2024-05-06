import java.util.Scanner;

public class CountingLetters{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter to count: ");
        String letter = scan.nextLine();
        
        System.out.print("Type a phrase/sentence: ");
        String sentence = scan.nextLine();
        int count = 0, i;
        
        scan.close();
        
        for (i = 0; i < sentence.length(); i++){
            String x = Character.toString(sentence.toLowerCase().charAt(i));
            
            if (x.contains(letter)){
                count++;
            }
        }
        
        System.out.println("There are " + count + " letter/s in a Sentence");

    }  
}