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
	assertEquals(5, TicTacToe.getRowCount());
    }
    @Test
    public void testIfRightSymbolInRightPlace(){
	assertEquals('|', TicTacToe.boardcheck(0,1));
    }
}	
