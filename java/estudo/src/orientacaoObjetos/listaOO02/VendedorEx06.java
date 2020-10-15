package orientacaoObjetos.listaOO02;

public class VendedorEx06 extends PessoaEx01{

	private double valorVendas;
	private double comissao;
	private double salario;
	private int quantidadeVendida;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}
	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	public double calculaComissao() {
		return comissao = (((valorVendas * quantidadeVendida) / 100) * comissao);
	}
	
	public double calculaTotal() {
		return salario + comissao;
	}
}
