package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.ForEach;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		// Criando uma lista.
		List<String> listaNomes = new LinkedList<String>();

		// Adicionando nomes na lista.
		listaNomes.add("Júlio");
		listaNomes.add("Alexandre");
		listaNomes.add("Giovani");
		listaNomes.add("Roberto");
		listaNomes.add("Gustavo");
		listaNomes.add("Otávio");
		listaNomes.add("Lucas");
		listaNomes.add("Carlos");
		listaNomes.add("Paulo");
		listaNomes.add("Felipe");

		// Utilizando o método estático 'sort' da classe 'Collections' para ordenar a lista de nomes por ordem alfabética.
		Collections.sort(listaNomes);

		// Imprimindo a frase que irá ficar acima da lista dos nomes.
		System.out.println("Lista dos nomes por ordem alfabética:");

		// Comando for each utilizado para percorrer os elementos (nomes) da lista e imprimir os nomes.
		for (String nomes : listaNomes) {
			System.out.println(nomes);
		}

	}

}
