package orientacaoObjetos.listaOO02;

public class OperarioEx05 extends PessoaEx01{

	private double valorProducao;
	private double comissao;
	private int quantidadeVendida;
	private double salario;
	
	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}
	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calculaComissao() {
		return comissao = (((quantidadeVendida * valorProducao) / 100)* comissao);
	}
	
	public double calculaTotal() {
		return salario + comissao;
	}
}
