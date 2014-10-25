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
		board[0][0] = 'O';
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
		board[2][4] = 'X';
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
    }
    
    public static String test(){
    	return("TicTacToe");
    }

    public static int getRowCount(){
    	TicTacToe tc = new TicTacToe();
    	return tc.board.length;
    }
    
    public static int boardcheck(int a, int b){
        TicTacToe tc = new TicTacToe();
	return tc.board[a][b];
    }

}
