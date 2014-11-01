package is.ru.tictactoe;
import java.util.Scanner;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class TicTacToe{
    public static char ONE = ' ';
    public static char TWO = ' ';
    public static char THREE = ' ';
    public static char FOUR = ' ';
    public static char FIVE = ' ';
    public static char SIX = ' ';
    public static char SEVEN = ' ';
    public static char EIGHT = ' ';
    public static char NINE = ' ';
    public static char EMPTY = ' ';    

    public static char[][] board;

    public TicTacToe(){
    	board = new char[5][5];
	board[0][0] = ' ';
	board[0][1] = '|';
	board[0][2] = ' ';
	board[0][3] = '|';
	board[0][4] = ' ';
	board[1][0] = '-';
	board[1][1] = ' ';
	board[1][2] = '-';
	board[1][3] = ' ';
	board[1][4] = '-';
	board[2][0] = ' ';
	board[2][1] = '|';
	board[2][2] = ' ';
	board[2][3] = '|';
	board[2][4] = ' ';
	board[3][0] = '-';
	board[3][1] = ' ';
	board[3][2] = '-';
	board[3][3] = ' ';
	board[3][4] = '-';
	board[4][0] = ' ';
	board[4][1] = '|';
	board[4][2] = ' ';
	board[4][3] = '|';
	board[4][4] = ' ';
    }
    public static void main(String[] args)
    {
	test();
	TicTacToe newgame = new TicTacToe();
	getColCount(newgame);
	printBoard(newgame);
    }
    
    public static String test(){
    	return("TicTacToe");
    }

    public static int getRowCount(TicTacToe newgame){
       	return newgame.board.length;
    }
    public static int boardcheck(TicTacToe newgame, int a, int b)
    {
	return newgame.board[a][b];
    }

    public static int getColCount(TicTacToe newgame)
    {
    	return newgame.board[0].length;
    }
    public static void printBoard(TicTacToe newgame)
    {
    	for(int i = 0; i < 5; i++){
	    for(int j = 0; j < 5; j++){
		System.out.print(newgame.board[i][j]);
	    }
	    System.out.println();
	}
    }
	
    public static boolean hasWon(TicTacToe newgame)
    {
	int rounds = 0;
		
	if(newgame.THREE == newgame.FIVE && newgame.THREE == newgame.SEVEN && newgame.THREE != ' '){
	    return true;
	}
	if(newgame.ONE == newgame.TWO && newgame.ONE == newgame.THREE && newgame.ONE != ' '){
	    return true;
	}
	if(newgame.FOUR == newgame.FIVE && newgame.FOUR == newgame.SIX && newgame.FOUR != ' '){
	    return true;
	}
	if(newgame.SEVEN == newgame.EIGHT && newgame.SEVEN == newgame.NINE && newgame.SEVEN != ' '){
	    return true;
	}
	if(newgame.ONE == newgame.FOUR && newgame.ONE == newgame.SEVEN && newgame.ONE != ' '){
	    return true;
	}
	if(newgame.ONE == newgame.FIVE && newgame.ONE == newgame.NINE && newgame.ONE != ' '){
	    return true;
	}
        if(newgame.TWO == newgame.FIVE && newgame.TWO == newgame.EIGHT && newgame.TWO != ' '){
            return true;
        }
        if(newgame.THREE == newgame.SIX && newgame.THREE == newgame.NINE && newgame.THREE != ' '){
            return true;
        }

	    return false;
    }

    public static boolean checkifDraw(int rounds)
    {
	if(rounds >= 9)
	    return true;
	else
       	    return false;
    
     }

    public void resetBoard()
    {
	board[0][0] = ' ';
        board[0][2] = ' ';
        board[0][4] = ' ';
        board[2][0] = ' ';
        board[2][2] = ' ';
        board[2][4] = ' ';
        board[4][0] = ' ';
        board[4][2] = ' ';
        board[4][4] = ' ';
        ONE = ' ';
        TWO = ' '; 
        THREE = ' '; 
        FOUR = ' '; 
        FIVE = ' '; 
        SIX = ' '; 
        SEVEN = ' ';
        EIGHT = ' ';
        NINE = ' ';
	}

     public static boolean goAgain(TicTacToe tc){
	StdOut.println();
	StdOut.print("do you wand to go again? (y/n): " );
	Scanner in = new Scanner(System.in);
	String again = in.nextLine();
	if(again.equals("y")) {
		//rounds = 0;
		tc.resetBoard();
		return true;
	}
	else
	return false;
	}


      public static boolean goAgainTEST(String n){
	 TicTacToe tc = new TicTacToe();
         StdOut.println();
         StdOut.print("do you wand to go again? (y/n): " );
         if(n =="y") {
                 //rounds = 0;
                 tc.resetBoard();
                 return true;
         }       
         else
         return false;
         }
 }

