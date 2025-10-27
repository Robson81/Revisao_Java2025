package _4memoriaArraysLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import _0entities.ListExercicio;

public abstract class _4exercicioLista {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<ListExercicio> lista = new ArrayList<>();
		
		System.out.print("How many students will be inserted in the siistem?: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=0; i<n; i++) {
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Birth date: ");
			Integer year = sc.nextInt();
			
			System.out.print("Phone number: ");
			int phone = sc.nextInt();
			
			lista.add(new ListExercicio(id, name, year, phone));
			
			
			System.out.println("\n");
			
		}
		
		
		for (ListExercicio obj: lista) {
			
			System.out.println(obj);
		}
		
		
		sc.close();
	}

}
