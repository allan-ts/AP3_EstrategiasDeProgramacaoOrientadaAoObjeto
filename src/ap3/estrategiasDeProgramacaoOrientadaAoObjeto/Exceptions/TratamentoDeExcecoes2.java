package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.Exceptions;

public class TratamentoDeExcecoes2 {

	public static void main(String[] args) {

		String nome = null;

		try {

			if (nome.equals("Allan")) {
				System.out.println("O nome está correto!");
			} else {
				System.out.println("O nome está errado!");
			}

		} catch (NullPointerException exception) {

			System.out.println("Nome inválido!");

		} finally {

			System.out.println("Este bloco sempre será executado.");

		}
	}
}
