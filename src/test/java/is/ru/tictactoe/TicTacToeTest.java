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

}

