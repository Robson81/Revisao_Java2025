package _4memoriaArraysLista;

import java.util.Locale;
import java.util.Scanner;

public class _1vetor01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Informe a quantidade de elementos que deseja receber:");
		n = sc.nextInt();

		double[] height = new double[n];
		double soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura %d: ", i + 1);

			height[i] = sc.nextDouble();
			soma += height[i];
		}

		double media = soma / n;

		System.out.printf("A média das alturas informadas é: %.2f", media);

		sc.close();
	}

}
