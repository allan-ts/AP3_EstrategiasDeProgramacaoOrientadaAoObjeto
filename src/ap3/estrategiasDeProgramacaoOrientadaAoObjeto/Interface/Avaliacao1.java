package ap3.estrategiasDeProgramacaoOrientadaAoObjeto.Interface;

public class Avaliacao1 implements Calculos {

	private double notaAvaliacao1;
	private double ap1;
	private double ap2;
	private double notaFinal;

	@Override
	public void somar(double nota1, double nota2) {
		this.notaAvaliacao1 = nota1 + nota2;
	}

	@Override
	public void multiplicar(double nota1, double nota2) {
		this.ap1 = nota1 * 5;
		this.ap2 = nota2 * 5;
	}

	@Override
	public void dividir() {
		this.notaAvaliacao1 = (this.ap1 + this.ap2) / 10;
	}

	@Override
	public double getNotaFinal() {
		return this.notaFinal = this.notaAvaliacao1;
	}

}
