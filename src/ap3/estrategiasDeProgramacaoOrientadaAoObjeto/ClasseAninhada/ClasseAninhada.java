package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.ClasseAninhada;

public class ClasseAninhada {

	private String texto = "Classe externa!";
	

	public class Interna {

		private String texto = "Classe interna!";

		public void imprimeTexto() {

			// Consegue ver e acessar elementos da classe externa.
			System.out.println(ClasseAninhada.this.texto);

			System.out.println(texto);
		}
	}
	

	public static void main(String[] args) {

		ClasseAninhada classeExterna = new ClasseAninhada();
		Interna classeInterna = classeExterna.new Interna();

		classeInterna.imprimeTexto();

	}

}