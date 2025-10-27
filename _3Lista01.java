package _4memoriaArraysLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3Lista01 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Robson");
		lista.add("Pedro");
		lista.add("Hyann");
		lista.add("Eduardo");
		lista.add(2, "Heitor");// comando para adicionar elemento à lista, na posição 2(.add(index, element);)

		System.out.print("Tamanho da Lista: " + lista.size());//lista.size() mostra o tamanho da lista
		System.out.println();

		lista.remove("Heitor");

		for (String x : lista) {//laço for each
			System.out.println(x);

		}
		System.out.println("-----------------------");

		System.out.print("Tamano da lista: " + lista.size());
		System.out.println();

		lista.removeIf(z -> z.charAt(0) == 'R');//lista.removeIf() = remove elemento da lista  através de parâmetros informados (z -> z.charAt(0) == 'R')

		for (String z : lista) {
			System.out.println(z);
		}

		System.out.println("A palavra Pedro está localizada na posição: " + lista.indexOf("Pedro"));
		System.out.println("A palavra Pedro está localizada na Robson: " + lista.indexOf("Robson"));
		System.out.println("-----------------------");
		List<String> result = lista.stream().filter(z -> z.charAt(0) == 'H').collect(Collectors.toList());
		/*
		List<String> result = lista.stream().filter(z -> z.charAt(0) == 'H').collect(Collectors.toList());
		comando para deixar na lista 'result' somento os elementos filtrados no filter().
		*/

		for (String y : result) {
			System.out.println(y);
		}
		System.out.println("-----------------------");

		String name = lista.stream().filter(z -> z.charAt(0) == 'E').findFirst().orElse(null);
		/*
		String name = lista.stream().filter(z -> z.charAt(0) == 'E').findFirst().orElse(null);
		comando para deixar na lista 'result' somento os elementos filtrados no filter().
		*/
		System.out.println(name);
	}

}
