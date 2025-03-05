public class ChessBoardAllPossibleCombination {
	
	public static void nQueens(char board[][], int row) {
		// basecase
		if(row == board.length) {
			printBoard(board);
			return;
		}
		
		//column loop
		for(int j = 0; j < board.length; j++) {
			board[row][j] = 'Q';
			nQueens(board, row+1); // Recursion
			board[row][j] = '*'; // BacktrackingStep
		}
		
	}
	
	public static void printBoard(char board[][]) {
		System.out.println("---------- Chess Board ----------");
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int row = 4;
		char board[][] = new char[row][row];
		
		//Initialize
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < row; j++) {
				board[i][j] = '.';
			}
		}
		nQueens(board, 0);

	}
}