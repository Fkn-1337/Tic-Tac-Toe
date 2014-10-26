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
	TicTacToe tc = new TicTacToe();
	assertEquals(5, TicTacToe.getRowCount(tc));
    }
    @Test
    public void testHowManyCol(){
	TicTacToe tc = new TicTacToe();
	assertEquals(5, TicTacToe.getColCount(tc));
    }
    @Test
    public void testIfRightSymbolInRightPlace(){
	TicTacToe tc = new TicTacToe();
	assertEquals('|', TicTacToe.boardcheck(tc,0,1));
    }
    @Test
    public void testIfRightSymbolInRightPlace2(){
	TicTacToe tc = new TicTacToe();
	assertEquals('-', TicTacToe.boardcheck(tc,1,0));
    }

    @Test
    public void testHasWonDiaganol1(){
	TicTacToe tc = new TicTacToe();
        tc.THREE = 'X';
	tc.FIVE = 'X';
	tc.SEVEN = 'X';
	assertEquals(true, TicTacToe.hasWon(tc));
    }
}	
