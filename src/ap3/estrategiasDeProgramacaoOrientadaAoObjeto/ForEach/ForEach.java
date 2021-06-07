package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.ForEach;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		// Criando uma lista.
		List<String> listaNomes = new LinkedList<String>();

		// Adicionando nomes na lista.
		listaNomes.add("J�lio");
		listaNomes.add("Alexandre");
		listaNomes.add("Giovani");
		listaNomes.add("Roberto");
		listaNomes.add("Gustavo");
		listaNomes.add("Ot�vio");
		listaNomes.add("Lucas");
		listaNomes.add("Carlos");
		listaNomes.add("Paulo");
		listaNomes.add("Felipe");

		// Utilizando o m�todo est�tico 'sort' da classe 'Collections' para ordenar a lista de nomes por ordem alfab�tica.
		Collections.sort(listaNomes);

		// Imprimindo a frase que ir� ficar acima da lista dos nomes.
		System.out.println("Lista dos nomes por ordem alfab�tica:");

		// Comando for each utilizado para percorrer os elementos (nomes) da lista e imprimir os nomes.
		for (String nomes : listaNomes) {
			System.out.println(nomes);
		}

	}

}
