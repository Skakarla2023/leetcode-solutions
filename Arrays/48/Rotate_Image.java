package leetcode_programs_updated;

public class Rotate_Image {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(matrix);
	}

	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int left = 0;
			int right = n - 1;
			while (left < right) {
				int tempo = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = tempo;
				left++;
				right--;
			}
		}
		System.out.println("After Rotation:");
		System.out.println("{");
		for (int i = 0; i < n; i++) {
			System.out.print("{");
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println("}");
		}
		System.out.println("}");
	}

}
