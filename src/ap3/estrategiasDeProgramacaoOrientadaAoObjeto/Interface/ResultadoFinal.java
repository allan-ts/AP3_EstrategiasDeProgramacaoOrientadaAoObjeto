package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.Interface;

public class ResultadoFinal {

	public static void main(String[] args) {

		Avaliacao1 avaliacao1 = new Avaliacao1();
		avaliacao1.somar(10.00, 8.00);
		avaliacao1.multiplicar(10.00, 8.00);
		avaliacao1.dividir();

		Avaliacao2 avaliacao2 = new Avaliacao2();
		avaliacao2.somar(5.00, 6.00);
		avaliacao2.multiplicar(5.00, 6.00);
		avaliacao2.dividir();

		System.out.println("Nota 1� avalia��o: " + avaliacao1.getNotaFinal());
		System.out.println("Nota 2� avalia��o: " + avaliacao2.getNotaFinal());

		System.out.println("M�dia: " + ((avaliacao1.getNotaFinal() + avaliacao2.getNotaFinal()) / 2));

	}

}
