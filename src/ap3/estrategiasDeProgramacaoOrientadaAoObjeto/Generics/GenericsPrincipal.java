package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.Generics;

public class GenericsPrincipal {

	public static void main(String[] args) {

		Generics<String> generic = new Generics<>();

		generic.add("AP3 - Estrat�gias de Programa��o Orientada ao Objeto!");

		System.out.println(generic.getValue());

	}

}
