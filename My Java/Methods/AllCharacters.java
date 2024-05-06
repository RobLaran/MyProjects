package Methods;

public class AllCharacters {
    public static void main(String[] args) {

        char firstChar = '(';
        char lastChar = 'z';

        int charPerLine = 20;

        printAllCharacters(firstChar, lastChar, charPerLine);

    }

    static void printAllCharacters(char firstChar, char lastChar, int charLimit){

        for(int i = 1; firstChar <= lastChar; i++, firstChar++){
            System.out.print(firstChar + " ");
            if(i % charLimit == 0){
                System.out.println();
            }
        }

    }

}
