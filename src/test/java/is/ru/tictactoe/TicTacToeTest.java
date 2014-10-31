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
    public void testHasWonDiagonal1(){
	TicTacToe newgame = new TicTacToe();
        newgame.THREE = 'X';
	newgame.FIVE = 'X';
	newgame.SEVEN = 'X';
	assertEquals(true, TicTacToe.hasWon(newgame));
    }

}	
