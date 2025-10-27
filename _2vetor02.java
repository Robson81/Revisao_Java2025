package _4memoriaArraysLista;

import java.util.Locale;
import java.util.Scanner;

import _0entities.Vetor02;

public class _2vetor02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de produtos a ser cadastrados: ");
		int n = sc.nextInt();
		sc.nextLine();
		double soma = 0;

		Vetor02[] vetor = new Vetor02[n];

		System.out.println("Informe a seguir a descrição e preço:");

		for (int i = 0; i < vetor.length; i++) {

			System.out.printf("Produto %d: ", i + 1);
			String product = sc.nextLine();
			System.out.printf("preço %d: ", i + 1);
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			vetor[i] = new Vetor02(product, price);

			soma += vetor[i].getPrice();
		}

		double media = soma / vetor.length;

		System.out.printf("A média dos preços dos produtos cadastrados é: %.2f", media);
		sc.close();

	}

}
