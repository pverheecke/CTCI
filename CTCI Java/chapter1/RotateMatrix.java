package chapter1;


/**
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 *
 */
public class RotateMatrix {

	
	public static void rotateBy90Degrees(int[][] matrix) {
		// first row becomes last column
		// first column becomes first row (reversed)
		
		int N = matrix.length;
		
		for (int layer = 0; layer < N/2; layer++) {
			
			int first = layer;
			int last = N - 1 - layer;
			
			
			for (int i = first; i < last; i++) {
				int temp = matrix[first][i];
				int offset = i - first;
			
				// move left to top
				matrix[first][i] = matrix[last-offset][first];
			
			// move bottom to left
				matrix[last-offset][first] = matrix[last][last-offset];

			
			// move right to bottom
				matrix[last][last-offset] = matrix[i][last];

			
			// move top to right
				matrix[i][last] = temp;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
