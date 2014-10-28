package is.ru.tictactoe;

public class TicTacToe{
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static int THREE = 3;
    public static final int FOUR = 4;
    public static int FIVE = 5;
    public static final int SIX = 6;
    public static int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final char EMPTY = ' ';    

    private static char[][] board;

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
	TicTacToe tc = new TicTacToe();
	getColCount(tc);
	printBoard(tc);
    }
    
    public static String test(){
    	return("TicTacToe");
    }

    public static int getRowCount(TicTacToe tc){
       	return tc.board.length;
    }
    public static int boardcheck(TicTacToe tc, int a, int b){
	return tc.board[a][b];
    }

    public static int getColCount(TicTacToe tc){
    	return tc.board[0].length;
    }
    public static void printBoard(TicTacToe tc){
    	for(int i = 0; i < 5; i++){
	    for(int j = 0; j < 5; j++){
		System.out.print(tc.board[i][j]);
	    }
	    System.out.println();
	}
    }
	
    public static boolean hasWon(TicTacToe tc)
	{
		int rounds = 0;
		//if(rounds > 4)
		//{
			/*if(ONE == TWO && ONE == THREE && ONE != ' '){
				return true;
			}
			if(FOUR == FIVE && FOUR == SIX && FOUR != ' '){
				return true;
			}
			if(SEVEN == EIGHT && SEVEN == NINE && SEVEN != ' '){
				return true;
			}
			if(ONE == FOUR && ONE == SEVEN && ONE != ' '){
				return true;
			}
			if(TWO == FIVE && TWO == EIGHT && TWO != ' '){
				return true;
			}
			if(THREE == SIX && THREE == NINE && THREE != ' '){
				return true;
			}
			if(ONE == FIVE && ONE == NINE && ONE != ' '){
				return true;
			}*/
			if(tc.THREE == tc.FIVE && tc.THREE == tc.SEVEN && tc.THREE != ' '){
				return true;
			}
			//return false;
		//}
		return false;
	}
}
