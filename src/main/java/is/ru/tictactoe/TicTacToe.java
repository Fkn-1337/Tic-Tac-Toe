package is.ru.tictactoe;

public class TicTacToe{
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final char EMPTY = ' ';    

    private static char[][] board;

    public TicTacToe(){
    	board = new char[5][5];
	for(int i = 0; i < board.length; i++){
	    for(int j = 0; j < board[i].length; j++){
		    board[i][j] = EMPTY;
		}
    	}
    }
    public static void main(String[] args)
    {
	test();
    }
    
    public static String test(){
    	return("TicTacToe");
    }

    public static int getRowCount(){
    	TicTacToe tc = new TicTacToe();
    	return tc.board.length;
    }
}
