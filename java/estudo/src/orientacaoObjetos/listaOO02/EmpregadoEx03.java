package orientacaoObjetos.listaOO02;

public class EmpregadoEx03 extends PessoaEx01{

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calculaSalario() {
		return salarioBase -= ((salarioBase / 100) * imposto);
	}
}
