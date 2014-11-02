package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {
    public static void main(String args[]){
    	org.junit.runner.JUnitCore.main("is.ru.tictactoe.TicTacToeTest");
    }
   
   @Test
     public void checkingGoAgain(){
         TicTacToe newgame = new TicTacToe();
         String check = "n";
         assertEquals(false, newgame.goAgainTEST(check));

      }

      @Test
      public void checkingGoAgainIfTrue(){
         TicTacToe newgame = new TicTacToe();
         String check = "y";
         assertEquals(true, newgame.goAgainTEST(check));

     }

}
