package sudoku.problemdomain;

import java.io.IOError;
import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame game) throws IOException;
    
    
}