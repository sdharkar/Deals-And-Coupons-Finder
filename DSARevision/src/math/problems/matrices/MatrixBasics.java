package math.problems.matrices;

import java.util.Scanner;

public class MatrixBasics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number of rows: ");
		 int rows = sc.nextInt();
		 System.out.print("Enter number of columns: ");
		 int cols = sc.nextInt();

		 int[][] matrix = new int[rows][cols];

		 System.out.print("Enter matrix elements: ");

		 for(int i = 0; i < rows; i++) {
			 for(int j = 0; j < cols; j++) {
				 matrix[i][j] = sc.nextInt();
			 }
		 }

		 for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		 }
	}


}