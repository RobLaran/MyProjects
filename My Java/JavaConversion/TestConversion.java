package JavaConversion;

import java.util.Random;

public class TestConversion {
    public static void main(String[] args) {
        Random random = new Random();

        int rand, rand2;
        String str, str2;

        for(int i = 0; i <= 10; i++){
        rand = random.nextInt(99999999);
        rand2 = random.nextInt(99);

        str = Integer.toString(rand);
        str2 = Integer.toString(rand2);

        System.out.println(str + str2);
        }
        // System.out.println(str + str2);
    }
}
