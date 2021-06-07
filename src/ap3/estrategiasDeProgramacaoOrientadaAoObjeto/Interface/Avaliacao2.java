package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.Interface;

public class Avaliacao2 implements Calculos {

	private double notaAvaliacao2;
	private double ap3;
	private double ap4;
	private double notaFinal;

	@Override
	public void somar(double nota1, double nota2) {
		this.notaAvaliacao2 = nota1 + nota2;
	}

	@Override
	public void multiplicar(double nota1, double nota2) {
		this.ap3 = nota1 * 3;
		this.ap4 = nota2 * 7;
	}

	@Override
	public void dividir() {
		this.notaAvaliacao2 = (this.ap3 + this.ap4) / 10;
	}

	@Override
	public double getNotaFinal() {
		return this.notaFinal = this.notaAvaliacao2;
	}

}
