package JavaProjects.TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    static ArrayList<Integer> player = new ArrayList<Integer>();
    static ArrayList<Integer> cpu = new ArrayList<Integer>();

    public static void main(String[] args) {

        tictactoeGame();
        
    }

    public static void tictactoeGame(){
        char[][] tictacBoard = board();
        boolean flag = true;
        printBoard(tictacBoard);
        while (flag) {
            if(winning()){
                userPlayer(tictacBoard);
            } else {
                printBoard(tictacBoard);
                flag = false;
                break;
            }
            if(winning()){
                userCPU(tictacBoard);
            } else {
                printBoard(tictacBoard);
                flag = false;
                break;
            }
            
            printBoard(tictacBoard);

            System.out.println();
        }
    }

    public static char[][] board(){
        char[][] boardGame = {{' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '},
                              {'-', '+', '-', '+', '-'},
                              {' ', '|', ' ', '|', ' '}};
        return boardGame;
    }

    public static void printBoard(char[][] board){
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
    }

    public static int playerPlacement(){
        System.out.print("Enter placement(1-9): ");
        int pos = scan.nextInt();
        return pos;
    }

    public static void placePiece(char[][] board, int userPos, String user){
        char symb = ' ';
        if(user.equals("Player")){
            symb = 'X';
        } else if(user.equals("CPU")){
            symb = 'O';
        }

        switch (userPos) {
            case 1:
                board[0][0] = symb; 
                break;
            case 2:
                board[0][2] = symb; 
                break;
            case 3:
                board[0][4] = symb; 
                break;
            case 4:
                board[2][0] = symb; 
                break;
            case 5:
                board[2][2] = symb; 
                break;
            case 6:
                board[2][4] = symb; 
                break;
            case 7:
                board[4][0] = symb; 
                break;
            case 8:
                board[4][2] = symb; 
                break;
            case 9:
                board[4][4] = symb; 
                break;

            default:
                break;
        }
    }

    public static void userPlayer(char[][] board){
        int playerPos = playerPlacement();

        while(player.contains(playerPos) || cpu.contains(playerPos)){
            System.out.println("Position Taken!");
            System.out.print("Enter placement(1-9): ");
            playerPos = scan.nextInt();
        }

        placePiece(board, playerPos, "Player");
        player.add(playerPos);
    }

    public static void userCPU(char[][] board){
        int cpuPos = rand.nextInt(9) + 1;

        while(player.contains(cpuPos) || cpu.contains(cpuPos)){
            cpuPos = rand.nextInt(9) + 1;
        }

        placePiece(board, cpuPos, "CPU");
        cpu.add(cpuPos); 
    }

    @SuppressWarnings("rawtypes")
    public static boolean winning(){
        List<List> winningCondition = new ArrayList<List>();

        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,5,7);

        winningCondition.add(topRow);
        winningCondition.add(midRow);
        winningCondition.add(botRow);
        winningCondition.add(leftCol);
        winningCondition.add(midCol);
        winningCondition.add(rightCol);
        winningCondition.add(cross1);
        winningCondition.add(cross2);

        boolean flag = true;

        for(List l: winningCondition){
            if(player.containsAll(l)){
                System.out.println("You win Playa!");
                flag = false;
                break;
            } else if(cpu.containsAll(l)){
                System.out.println("YOu LOSE PLAYA!");
                flag = false;
                break;
            }
            if(player.size() + cpu.size() == 9){
                System.out.println("CAT!");
                flag = false;
                break;  
            }
        }

        return flag;
    }

    
}
