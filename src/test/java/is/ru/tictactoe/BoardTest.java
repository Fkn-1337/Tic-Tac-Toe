package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoardTest {
    public static void main(String args[]){
	org.junit.runner.JUnitCore.main("is.ru.tictactoe.BoardTest");
    }

    @Test
    public void testIfRightSymbolInRightPlace(){
	Board newgame = new Board();
        assertEquals('|', newgame.boardcheck(0,1));
    }

    @Test
    public void testIfRightSymbolInRightPlace2(){
	Board newgame = new Board();       
        assertEquals('-', newgame.boardcheck(1,0));
    }
    
    @Test
    public void testHasWonDiagonal_1_X(){
        Board newgame = new Board();
        newgame.THREE = 'X';
        newgame.FIVE = 'X';
        newgame.SEVEN = 'X';
        assertEquals(true, newgame.hasWon(5));
    }

    @Test
    public void testDraw(){
       Board newgame = new Board();
        assertEquals(true, newgame.checkIfDraw(9));

    }

    @Test
    public void testDraw2(){
      Board newgame = new Board();
       assertEquals(false, newgame.checkIfDraw(8));
    }

    @Test
    public void testHasWonDiagonal_2_X(){

        Board newgame = new Board();
        newgame.resetBoard();
        newgame.ONE = 'X';
        newgame.FIVE = 'X';
        newgame.NINE = 'X';
        assertEquals(true, newgame.hasWon(5));
    }
    
    @Test
    public void testHasWonRow_1_X(){
        Board newgame = new Board();
        newgame.resetBoard();
        newgame.ONE = 'X';
        newgame.TWO = 'X';
        newgame.THREE = 'X';
        assertEquals(true, newgame.hasWon(5));
    }

    @Test
    public void testHasWonRow_2_X(){
        Board newgame = new Board();
        newgame.resetBoard();
        newgame.FOUR = 'X';
        newgame.FIVE = 'X';
        newgame.SIX = 'X';
        assertEquals(true, newgame.hasWon(5));
    }

    @Test
    public void testHasWonRow_3_X(){
        Board newgame = new Board();
        newgame.resetBoard();
        newgame.SEVEN = 'X';
        newgame.EIGHT = 'X';
        newgame.NINE = 'X';
        assertEquals(true, newgame.hasWon(5));
    }

    @Test
    public void testHasWonColumn_1_X(){

        Board newgame = new Board();
        newgame.resetBoard();
        newgame.ONE = 'X';
        newgame.FOUR = 'X';
        newgame.SEVEN = 'X';
        assertEquals(true, newgame.hasWon(5));
    }

     @Test
     public void testHasWonColumn_2_X(){

        Board newgame = new Board();
        newgame.resetBoard();
        newgame.TWO = 'X';
        newgame.FIVE = 'X';
        newgame.EIGHT = 'X';
        assertEquals(true, newgame.hasWon(5));
    }

     @Test
     public void testHasWonColumn_3_X(){

        Board newgame = new Board();
        newgame.resetBoard();
        newgame.THREE = 'X';
        newgame.SIX = 'X';
        newgame.NINE = 'X';
        assertEquals(true, newgame.hasWon(5));
    }

    @Test
    public void resetBoardTest(){

        Board newgame = new Board();
        newgame.board[0][0] = 'X';
        newgame.resetBoard();
        assertEquals(' ', newgame.boardcheck(0,0));
    }

    @Test
    public void resetBoardTest2() {
        Board newgame = new Board();
        newgame.board[0][0] = 'X';
        newgame.board[0][2] = 'O';
        newgame.board[4][0] = 'X';
        newgame.resetBoard();
        assertEquals(' ', Board.boardcheck(0,0));
        assertEquals(' ', Board.boardcheck(0,2));
        assertEquals(' ', Board.boardcheck(4,0));
    }

    @Test
    public void updateBoardTest(){
        Board newgame = new Board();
        assertEquals(true, newgame.updateBoard('X', 1));
        assertEquals('X',  newgame.boardcheck(0, 0));
    }

    @Test
    public void updateBoardTest2(){
        Board newgame = new Board();
        assertEquals(false, newgame.updateBoard('X', 15));
        assertEquals(' ', newgame.boardcheck(0, 0));
    }

    @Test
    public void updateBoardTest3(){
        Board newgame = new Board();
        assertEquals(true, newgame.updateBoard('O', 5));
        assertEquals('O', newgame.boardcheck(2, 2));
    }

    @Test
    public void alreadyTakenTest_1(){
        Board newgame = new Board();
        newgame.ONE = 'X';
        assertEquals(true, newgame.isAlreadyTaken(1));
    }

    @Test
    public void alreadyTakenTest_2(){
        Board newgame = new Board();
        newgame.ONE = ' ';
        assertEquals(false, newgame.isAlreadyTaken(1));
    }

    @Test
    public void alreadyTakenTest_3(){
        Board newgame = new Board();
        newgame.resetBoard();
        assertEquals(false, newgame.isAlreadyTaken(5));
    }

     @Test
     public void alreadyTakenTest_4(){
        Board newgame = new Board();
        newgame.FIVE = 'O';
        assertEquals(true, newgame.isAlreadyTaken(5));
    }

    @Test
    public void isWrongInputTest_1(){
        Board newgame = new Board();
        assertEquals(true, newgame.isWrongInput(10));
    }

    @Test
    public void isWrongInputTest_2(){
        Board newgame = new Board();
        assertEquals(false, newgame.isWrongInput(5));
    }

     @Test
     public void inputTest() {
         Board newgame = new Board();
         int a = 10;
         assertEquals("Wrong input, please try again", newgame.inputTest(a));

     }

}
