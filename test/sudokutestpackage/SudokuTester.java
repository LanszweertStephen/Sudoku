package sudokutestpackage;

import org.junit.*;
import sudokupackage.Sudoku;



public class SudokuTester {
    
    @Test
    public void canarayTest() {
        Assert.assertTrue(true);
    }
    
    @Test
    public void testToString(){
        Assert.assertEquals("I'm a Sudoku", (new Sudoku()).toString());
    }



}
