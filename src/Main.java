import java.util.Scanner;

public class Main
	{

		public static void main(String[] args)
			{
				// Matrix Searching Quiz 2/20
				MatrixFinder(5, 4, 6);

			}

		public static void MatrixFinder(int n, int rowNumber, int colNumber)
			{
				// This program returns the number of times n shows up in the 2d array. N is a
				// number 1-9 inclusive.

				int[][] matrixFinder = new int[rowNumber][colNumber];

				// Fill matrix randomly
				for (int row = 0; row < matrixFinder.length; row++)
					{
						for (int col = 0; col < matrixFinder[row].length; col++)
							{
								matrixFinder[row][col] = (int) ((Math.random() * 9) + 1);
							}
					}
				
				// Print out the matrix
				for (int row = 0; row < matrixFinder.length; row++)
					{
						for (int col = 0; col < matrixFinder[row].length; col++)
							{
								System.out.print(matrixFinder[row][col] + " ");
							}
						System.out.println("");
					}
				
				int nTimes = 0;
				int nTimesSum = 0;
				for (int row = 0; row < matrixFinder.length; row++)
					{
						for (int col = 0; col < matrixFinder[row].length; col++)
							{
								if (matrixFinder[row][col] == n)
									{
										nTimes++;
										nTimesSum += n;
									}
							}
					}
				System.out.println("The number " + n + " appeared " + nTimes + " times!");
				System.out.println("The sum of all of the appearances is " + nTimesSum);
			}

	}
