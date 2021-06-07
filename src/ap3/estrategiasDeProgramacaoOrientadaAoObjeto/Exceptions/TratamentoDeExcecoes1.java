package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.Exceptions;

public class TratamentoDeExcecoes1 {

	public static void main(String[] args) {

		int[] numeros = new int[4];

		try {

			numeros[5] = 10;

		} catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Não é possível acessar esta posição no vetor!");

		}

	}

}
