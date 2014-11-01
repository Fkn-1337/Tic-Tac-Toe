package is.ru.tictactoe;
//import com.googleintrocs.princeton-java-introduction;
import java.util.Scanner;
import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class TicTacToe{
  //R Initializes the squares that players can put their symbol in
// ONE stands for [0][0] 
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
//makes two arrays for the board
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
	//StdOut.println("Virkar");
    }
    
    public static String test(){
    	return("TicTacToe");
    }
    
    public static boolean updateBoard(char symb, int i)
    {
    	if(i == 1) {
	    board[0][0] = symb;
	    ONE = symb;
	    return true;
	}
	else
	    return false;
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
	// Wins by diagonal in squares 3, 5, 7
	if(newgame.THREE == newgame.FIVE && newgame.THREE == newgame.SEVEN && newgame.THREE != ' '){
	    return true;
	}
	// Wins by row in squares 1,2,3
	if(newgame.ONE == newgame.TWO && newgame.ONE == newgame.THREE && newgame.ONE != ' '){
	    return true;
	}
	//Wins by row in squares 4,5,6
	if(newgame.FOUR == newgame.FIVE && newgame.FOUR == newgame.SIX && newgame.FOUR != ' '){
	    return true;
	}
	//wins by row in squares 7, 8 ,9
	if(newgame.SEVEN == newgame.EIGHT && newgame.SEVEN == newgame.NINE && newgame.SEVEN != ' '){
	    return true;
	}
	//wins by diagonal in squares 1,4,7
	if(newgame.ONE == newgame.FOUR && newgame.ONE == newgame.SEVEN && newgame.ONE != ' '){
	    return true;
	}
	//wins by column 3 in a row in squares 1, 5, 7
	if(newgame.ONE == newgame.FIVE && newgame.ONE == newgame.NINE && newgame.ONE != ' '){
	    return true;
	}
	//wins by column 3 in a row in squares 2, 5, 8
        if(newgame.TWO == newgame.FIVE && newgame.TWO == newgame.EIGHT && newgame.TWO != ' '){
            return true;
        }
	//wins by column 3 in a row in squares 3, 6, 9
        if(newgame.THREE == newgame.SIX && newgame.THREE == newgame.NINE && newgame.THREE != ' '){
            return true;
        }
	//no winner yet
	    return false;
    }

    public static boolean checkifDraw(int rounds)
    {
	if(rounds >= 9)
	    return true;
	else
       	    return false;
    
     }
	//returns true if input is not a legal square
       public boolean isWrongInput(int i){
	if (i > 9 || i < 1){
			return true;
		}
		else {
			return false;
		}
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
	
	//is prompted in the end of the game
     public static boolean goAgain(TicTacToe newgame){
	StdOut.println();
	StdOut.print("do you wand to go again? (y/n): " );
	Scanner in = new Scanner(System.in);
	String again = in.nextLine();
	if(again.equals("y")) {
		//rounds = 0;
		newgame.resetBoard();
		return true;
	}
	else
	return false;
	}

	//couldnt test input so we made a dummy function
      public static boolean goAgainTEST(String n){
	 TicTacToe newgame = new TicTacToe();
         StdOut.println();
         StdOut.print("do you wand to go again? (y/n): " );
         if(n =="y") {
                 //rounds = 0;
                 newgame.resetBoard();
                 return true;
         }
         else
         return false;
         }

	//checks if the square is already taken 
    public static  boolean isAlreadyTaken(int i){
		if(i == 1 && ONE == ' '){
			return false;
		} 
		else if(i == 2 && TWO == ' '){
			return false;
		}
		else if(i == 3 && THREE == ' '){
			return false;
		}
		else if(i == 4 && FOUR == ' '){
			return false;
		}
		else if(i == 5 && FIVE == ' '){
			return false;
		}
		else if(i == 6 && SIX == ' '){
			return false;
		}
		else if(i == 7 && SEVEN == ' '){
			return false;
		}
		else if(i == 8 && EIGHT == ' '){
			return false;
		}
		else if(i == 9 && NINE == ' '){
			return false;
		}
		else{ 
			return true;
		}
		
	} 
 }
