package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {
    public static void main(String args[]){
    	org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }
   
    @Test
    public void testEmptyString(){
         assertEquals("TicTacToe", TicTacToe.test());
    }
    @Test
    public void testHowManyRows(){
	TicTacToe newgame = new TicTacToe();
	assertEquals(5, TicTacToe.getRowCount(newgame));
    }
    @Test
    public void testHowManyCol(){
	TicTacToe newgame = new TicTacToe();
	assertEquals(5, TicTacToe.getColCount(newgame));
    }
    @Test
    public void testIfRightSymbolInRightPlace(){
	TicTacToe newgame = new TicTacToe();
	assertEquals('|', TicTacToe.boardcheck(newgame,0,1));
    }
    @Test
    public void testIfRightSymbolInRightPlace2(){
	TicTacToe newgame = new TicTacToe();
	assertEquals('-', TicTacToe.boardcheck(newgame,1,0));
    }
    
    @Test
    public void testHasWonDiagonal_1_X(){
	TicTacToe newgame = new TicTacToe();
        newgame.THREE = 'X';
	newgame.FIVE = 'X';
	newgame.SEVEN = 'X';
	assertEquals(true, TicTacToe.hasWon(newgame));
    }
    
    @Test
    public void testDraw(){
        TicTacToe newgame = new TicTacToe();
        assertEquals(true, TicTacToe.checkifDraw(9));   

    }
    @Test
    public void testDraw2(){
       TicTacToe newgame = new TicTacToe();
       assertEquals(false, TicTacToe.checkifDraw(8));
    }


    @Test 
    public void testHasWonDiagonal_2_X(){
	
	TicTacToe newgame = new TicTacToe();
	newgame.resetBoard();
	newgame.ONE = 'X';
        newgame.FIVE = 'X';
        newgame.NINE = 'X';
        assertEquals(true, TicTacToe.hasWon(newgame));
    }
	

    @Test 
    public void testHasWonRow_1_X(){
        TicTacToe newgame = new TicTacToe();
        newgame.resetBoard();
	newgame.ONE = 'X';
        newgame.TWO = 'X';
        newgame.THREE = 'X';
        assertEquals(true, TicTacToe.hasWon(newgame));
    }
   	
    @Test 
    public void testHasWonRow_2_X(){
        TicTacToe newgame = new TicTacToe();
	newgame.resetBoard();
        newgame.FOUR = 'X';
        newgame.FIVE = 'X';
        newgame.SIX = 'X';
        assertEquals(true, TicTacToe.hasWon(newgame));
    }
   

    @Test 
    public void testHasWonRow_3_X(){
        TicTacToe newgame = new TicTacToe();
	newgame.resetBoard();
        newgame.SEVEN = 'X';
        newgame.EIGHT = 'X';
        newgame.NINE = 'X';
        assertEquals(true, TicTacToe.hasWon(newgame));
    }	

    @Test 
    public void testHasWonColumn_1_X(){
        
	TicTacToe newgame = new TicTacToe();
	newgame.resetBoard();
        newgame.ONE = 'X';
        newgame.FOUR = 'X';
        newgame.SEVEN = 'X';
        assertEquals(true, TicTacToe.hasWon(newgame));
    }

     @Test
     public void testHasWonColumn_2_X(){

        TicTacToe newgame = new TicTacToe();
        newgame.resetBoard();
        newgame.TWO = 'X';
        newgame.FIVE = 'X';
        newgame.EIGHT = 'X';
        assertEquals(true, TicTacToe.hasWon(newgame));
    }
	
     @Test
     public void testHasWonColumn_3_X(){

        TicTacToe newgame = new TicTacToe();
        newgame.resetBoard();
        newgame.THREE = 'X';
        newgame.SIX = 'X';
        newgame.NINE = 'X';
        assertEquals(true, TicTacToe.hasWon(newgame));
    }
 
    @Test
    public void resetBoardTest(){
        
	TicTacToe newgame = new TicTacToe();
	newgame.board[0][0] = 'X';
	newgame.resetBoard();
	assertEquals(' ', TicTacToe.boardcheck(newgame,0,0));
    }
    
    @Test
    public void resetBoardTest2() {
	TicTacToe newgame = new TicTacToe();
	newgame.board[0][0] = 'X';
	newgame.board[0][2] = 'O';
	newgame.board[4][0] = 'X';
	newgame.resetBoard();
	assertEquals(' ', TicTacToe.boardcheck(newgame,0,0));
	assertEquals(' ', TicTacToe.boardcheck(newgame,0,2));
	assertEquals(' ', TicTacToe.boardcheck(newgame,4,0));
    }

    @Test
    public void updateBoardTest(){
	TicTacToe newgame = new TicTacToe();
	assertEquals(true, newgame.updateBoard('X', 1));
	assertEquals('X',  newgame.boardcheck(newgame,0, 0));
    } 
    
    @Test
    public void updateBoardTest2(){
	TicTacToe newgame = new TicTacToe();
	assertEquals(false, newgame.updateBoard('X', 15));
	assertEquals(' ', newgame.boardcheck(newgame, 0, 0));	
    }   
    
    @Test
    public void checkingGoAgain(){
	TicTacToe newgame = new TicTacToe();
	String check = "n";	
	assertEquals(false, TicTacToe.goAgainTEST(check));

     }

     @Test
     public void checkingGoAgainIfTrue(){
	String check = "y";
	assertEquals(true, TicTacToe.goAgainTEST(check));

    }

    @Test
    public void alreadyTakenTest_1(){
	TicTacToe newgame = new TicTacToe();
	newgame.ONE = 'X';
	assertEquals(true, TicTacToe.isAlreadyTaken(1));
    }
    @Test
    public void alreadyTakenTest_2(){
	TicTacToe newgame = new TicTacToe();
	newgame.ONE = ' ';
	assertEquals(false, TicTacToe.isAlreadyTaken(1));
    }    
    @Test
    public void alreadyTakenTest_3(){
	TicTacToe newgame = new TicTacToe();
        newgame.resetBoard();
        assertEquals(false, TicTacToe.isAlreadyTaken(5));
    }
    @Test
     public void alreadyTakenTest_4(){
        TicTacToe newgame = new TicTacToe();
        newgame.FIVE = 'O';
        assertEquals(true, TicTacToe.isAlreadyTaken(5));
    }

    @Test
    public void isWrongInputTest_1(){
	TicTacToe newgame = new TicTacToe();
	assertEquals(true, newgame.isWrongInput(10));
    }

    @Test
    public void isWrongInputTest_2(){
        TicTacToe newgame = new TicTacToe();
        assertEquals(false, newgame.isWrongInput(5));
    }
}
