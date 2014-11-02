package is.ru.tictactoe;
//import com.googleintrocs.princeton-java-introduction;
import java.util.Scanner;
//import edu.princeton.cs.introcs.In;
//import edu.princeton.cs.introcs.StdOut;

public class TicTacToe{
  //R Initializes the squares that players can put their symbol in
// ONE stands for [0][0]
    public static int rounds = 0;
    public static void main(String[] args)
    {
        System.out.println("*******Welcome to TicTacToe***********");
        play();
        //test();
        //TicTacToe newgame = new TicTacToe();
        //getColCount(newgame);
        //printBoard(newgame);
        //StdOut.println("Virkar");
    }

    public static String test(){
        return("TicTacToe");
    }


        //is prompted in the end of the game
     public static boolean goAgain(Board newgame){
        System.out.println();
        System.out.print("Do you want to go again? (y/n): " );
        Scanner in = new Scanner(System.in);
        String again = in.nextLine();
        if(again.equals("y")) {
            rounds = 0;
            newgame.resetBoard();
            return true;
        }
        else
            return false;
        }

        //couldnt test input so we made a dummy function
    public static boolean goAgainTEST(String n){
         Board newgame = new Board();
         System.out.println();
         System.out.print("do you want to go again? (y/n): " );
         if(n =="y") {
             rounds = 0;
             newgame.resetBoard();
             return true;
         }
         else
             return false;
         }

        //checks if the square is already taken

    public static void play(){
        Board newgame = new Board();
        char symb;
        while(!(newgame.hasWon(rounds))){
            if(newgame.checkIfDraw(rounds)){
                newgame.printBoard();
                System.out.println("!!!DRAW!!!");
                if(goAgain(newgame))
                    play();
                else
                    System.exit(0);
            }
            newgame.printBoard();
            if(rounds%2 == 0){
                System.out.println("Player 1, make your move!");
                symb = 'X';
            }
            else{
                System.out.println("Player 2, make your move!");
                symb = 'O';
            }
            newgame.input(symb);
            if(newgame.hasWon(rounds)){
                newgame.printBoard();
                if(rounds%2 == 0){
                    System.out.println("Congratilation!!! Player 1 WON!!!");
                }
                else{
                    System.out.println("Congratilation!!! Player 2 WON!!!");
                }
                if(goAgain(newgame))
                    play();
                else
                    System.exit(0);
            }
            rounds++;
        }
    }
 }
