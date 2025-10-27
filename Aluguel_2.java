package _4memoriaArraysLista;

import java.util.Scanner;

import _0entities.Rent;

public class Aluguel_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many roons will be rented: ");
		int n = sc.nextInt();

		Rent[] rent = new Rent[n];
		Rent[] qttRoons = new Rent[10];

		for (int i = 0; i < rent.length; i++) {
			System.out.printf("Rent #%d:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			// sc.nextLine();
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();

			rent[i] = new Rent(name, email, room);
			qttRoons[room] = rent[i];
			System.out.println("\n");

		}

		System.out.println("Busy roons:");
		for (int i = 0; i < qttRoons.length; i++) {

			if (qttRoons[i] != null)
				System.out.println(qttRoons[i].toString());

		}

		sc.close();
	}

}
