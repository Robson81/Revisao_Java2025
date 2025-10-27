package _4memoriaArraysLista;

import java.util.Scanner;

public class _6exercicioMatriz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o n�mero de linhas e colunas da matriz: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] num = new int[m][n];

		System.out.println("Informe os elementos da matriz:");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				num[i][j] = sc.nextInt();

			}
			System.out.println();
		}

		int x = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (num[i][j] == x) {
					System.out.printf("Elemento %d, posi��o %d%d\n", x, i, j);
					if (i - 1 >= 0) {
						System.out.printf("\n� cima: %d. Posi��o: %d%d", num[i - 1][j], i - 1, j);
					} else {
						System.out.printf("\nN�o h� elemento a cima de %d na posi��o %d%d.", x, i, j);
					}
					if (j + 1 < n) {
						System.out.printf("\n� direita: %d. Posi��o: %d%d", num[i][j + 1], i, j + 1);
					} else {
						System.out.printf("\nN�o h� elemento a direita de %d.", x);
					}
					if (j - 1 >= 0) {
						System.out.printf("\n� esquerda: %d. Posi��o: %d%d", num[i][j - 1], i, j - 1);
					} else {
						System.out.printf("\nN�o h� elemento a esquerda de %d.", x);
					}
					if (i + 1 < m) {
						System.out.printf("\n� baixo: %d. Posi��o: %d%d", num[i + 1][j], i + 1, j);
					} else {
						System.out.printf("\nN�o h� elemento a baixo de %d.", x);
					}
					System.out.println("\n");
				}

			}
		}

		sc.close();
	}

}
