package chapter1;


/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its
 * entire row and column are set to 0.
 *
 */
public class ZeroMatrix {

	private static void setRowToZero(int[][] matrix, int row) {
		for (int col = 0; col < matrix[0].length; col++) {
			matrix[row][col] = 0;
		}
	}
	
	private static void setColToZero(int[][] matrix, int col) {
		for (int row = 0; row < matrix.length; row++) {
			matrix[row][col] = 0;
		}
	}
	
	public static void zeroMatrix(int[][] matrix) {
		int M = matrix.length;
		int N = matrix[0].length;
		
		boolean[] rowHasZero = new boolean[M];
		boolean[] colHasZero = new boolean[N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 0) {
					rowHasZero[i] = true;
					colHasZero[j] = true;
				}
			}
		}
		
		for (int i = 0; i < M; i++) {
			if (rowHasZero[i]) setRowToZero(matrix, i);
		}
		for (int i = 0; i < N; i++) {
			if (colHasZero[i]) setColToZero(matrix, i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
