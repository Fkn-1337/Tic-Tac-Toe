package is.ru.tictactoe;

public class Board{
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
 
    //makes two-dimensional arrays for the board
    public static char[][] board;

    public Board(){
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


}
