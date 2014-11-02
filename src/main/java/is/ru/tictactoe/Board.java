package is.ru.tictactoe;
import java.util.Scanner;


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
    public static int boardcheck(int a, int b)
    {
	return board[a][b];
    }

    public static boolean updateBoard(char symb, int i)
    {
        if(i == 1){
            board[0][0] = symb;
            ONE = symb;
            return true;
        }
        else if(i == 2){
            board[0][2] = symb;
            TWO = symb;
            return true;
        }
        else if(i == 3){
            board[0][4] = symb;
            THREE = symb;
            return true;
        }
        else if(i == 4){
            board[2][0] = symb;
            FOUR = symb;
            return true;
        }
        else if(i == 5){
           board[2][2] = symb;
           FIVE = symb;
           return true;
        }
        else if(i == 6){
           board[2][4] = symb;
           SIX = symb;
           return true;
        }
        else if(i == 7){
           board[4][0] = symb;
           SEVEN = symb;
           return true;
        }
        else if(i == 8){
           board[4][2] = symb;
           EIGHT = symb;
           return true;
        }
        else if(i == 9){
           board[4][4] = symb;
           NINE = symb;
           return true;
        }
        else {
            return false;
       }
    }

    public static void printBoard()
    {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

	public boolean hasWon(int rounds)
	{  
	        if(rounds > 3)
	        {
	               if(ONE == TWO && ONE == THREE && ONE != ' '){
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
	                if(THREE == FIVE && THREE == SEVEN && THREE != ' '){
                        return true;
	                }
	                if(THREE == SIX && THREE == NINE && THREE != ' '){
	                        return true;
	                }
	                if(ONE == FIVE && ONE == NINE && ONE != ' '){
	                        return true;
	                }
	                return false;
	        }
	        return false;
	}

    public static boolean checkIfDraw(int rounds)
    {
        if(rounds >= 9){
            return true;
	}
        else{
            return false;
	}
    }

    //returns true if input is not a legal square
    public static boolean isWrongInput(int i){
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

    public static void input(char symb)
    {
        Scanner in = new Scanner(System.in);
	int i = in.nextInt();
        if(isWrongInput(i)){
            System.out.println("Wrong input, please try again");
            input(symb);
        }
        else if(isAlreadyTaken(i)){
            System.out.println("This place is already taken, please try again");
            input(symb);
        }
        else {
            updateBoard(symb, i);
        }
    }


    public String inputTest(int n)
    {
        String inputTestString;
        if(isWrongInput(n)){
            inputTestString = "Wrong input, please try again";
            return inputTestString;
        }
        else if(isAlreadyTaken(n)){
            inputTestString = "This place is already taken, please try again";
            return inputTestString;

        }
        else{
            inputTestString = "Succefull input";
            return inputTestString;
        }
    }
}
