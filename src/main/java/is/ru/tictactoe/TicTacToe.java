package is.ru.tictactoe;
//import com.googleintrocs.princeton-java-introduction;
import java.util.Scanner;
//import edu.princeton.cs.introcs.In;
//import edu.princeton.cs.introcs.StdOut;

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
    public static int rounds = 0;
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
	
    public static boolean hasWon(TicTacToe newgame, int rounds)
    {
	if(rounds > 3)
	{
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
	return false;
    }

    public static boolean checkIfDraw(int rounds)
    {
	if(rounds >= 9)
	    return true;
	else
       	    return false;
    
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
	
	//is prompted in the end of the game
     public static boolean goAgain(TicTacToe newgame){
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
	 TicTacToe newgame = new TicTacToe();
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

    public static void play(){
    	TicTacToe newgame = new TicTacToe();
	char symb;
	while(!(hasWon(newgame, rounds))){
	    if(checkIfDraw(rounds)){
		printBoard(newgame);
		System.out.println("!!!DRAW!!!");
		if(goAgain(newgame))
		    play();
		else
		    System.exit(0);
	    }
	    printBoard(newgame);
	    if(rounds%2 == 0){
		System.out.println("Player 1, make your move!");
		symb = 'X';
	    }
	    else{
		System.out.println("Player 2, make your move!");
		symb = 'O';
	    }
	    input(symb);
	    if(hasWon(newgame, rounds)){
		printBoard(newgame);
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
