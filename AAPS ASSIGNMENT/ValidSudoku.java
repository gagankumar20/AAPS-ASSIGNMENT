// 36. Valid Sudoku.
// Write its algorithm, program.

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && row[board[i][j] - '1']) return false;
                if (board[j][i] != '.' && col[board[j][i] - '1']) return false;
                int boxRow = 3 * (i / 3) + j / 3;
                int boxCol = 3 * (i % 3) + j % 3;
                if (board[boxRow][boxCol] != '.' && box[board[boxRow][boxCol] - '1']) return false;

                row[board[i][j] - '1'] = col[board[j][i] - '1'] = box[board[boxRow][boxCol] - '1'] = true;
            }
        }
        return true;
    }
}

/*
Example:
Input: board = [
  ['5','3','.','.','7','.','.','.','.'],
  ['6','.','.', '1','9','5','.','.','.'],
  ['.','9','8','.','.','.','.', '6','.'],
  ['8','.','.','6','.','.','3','.','.'],
  ['4','.','.','8','.','3','.','.','1'],
  ['7','.','.','.','2','.','6','.','9'],
  ['.','6','.','.','.','.','.','2','.'],
  ['.','.','.','4','1','9','.','.','5'],
  ['.','.','.','.','8','.','.','7','9']
]
Output: true

Time Complexity: O(1) (Always fixed 81 cells to check)
Space Complexity: O(1) (Fixed space usage)
*/
