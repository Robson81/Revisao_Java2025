package _4memoriaArraysLista;

import java.util.Scanner;

public class _5ExercicioMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Informe a ordem da matriz que será construida: ");
		n = sc.nextInt();

		int[][] num = new int[n][n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Informe os elementos da %d linha:\n", i + 1);
			for (int j = 0; j < n; j++) {
				num[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nDiagonal principal");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j) {
					System.out.printf("%d\n", num[i][j]);
				}

			}

		}
		int negative = 0;
		System.out.println("\nNúmeros Negativos");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (num[i][j] < 0) {
					negative++;
					System.out.printf("%d ", num[i][j]);
				}

			}

		}
		System.out.printf("\n\nqtd de negativos: %d\n\n", negative );


		System.out.println("\nDiagonal secundaria");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j == n - 1 - i) {
					System.out.printf("%d\n", num[i][j]);
				}

			}

		}

		System.out.println("\nTriangulo Superior");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j > i) {
					System.out.printf("%d\n", num[i][j]);
				}

			}

		}
		System.out.println("\nTriangulo Inferior");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j < i) {
					System.out.printf("%d\n", num[i][j]);
				}

			}

		}
	sc.close();
	}

}
