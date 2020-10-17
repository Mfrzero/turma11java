package projetoOO;

public class Produto {
	
	protected String[] produtos = { " Camisa Brega       ", " Cal�a Brega        ", " T�nis Brega        ",
			" Blusa Brega        ", " Jaqueta Brega      ", " Luva de Couro Brega",
			" Chap�u Fedora Brega", " �culos Oakley      ", " Macac�o Normal     ",
			" Conjuto do Falc�o  " };
	public String[] getProdutos() {
		return produtos;
	}
	public void setProdutos(String[] produtos) {
		this.produtos = produtos;
	}
	public String[] getCodigos() {
		return codigos;
	}
	public void setCodigos(String[] codigos) {
		this.codigos = codigos;
	}
	public String[] getDispo() {
		return dispo;
	}
	public void setDispo(String[] dispo) {
		this.dispo = dispo;
	}
	public int[] getEstoque() {
		return estoque;
	}
	public void setEstoque(int[] estoque) {
		this.estoque = estoque;
	}
	public int[] getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(int[] carrinho) {
		this.carrinho = carrinho;
	}
	public double[] getPrecos() {
		return precos;
	}
	public void setPrecos(double[] precos) {
		this.precos = precos;
	}
	protected String[] codigos = { "P01", "P02", "P03", "P04", "P05", "P06", "P07", "P08", "P09", "P10" };
	protected String[] dispo = { "dispon�vel", "dispon�vel", "dispon�vel", "dispon�vel", "dispon�vel", "dispon�vel",
			"dispon�vel", "dispon�vel", "dispon�vel", "dispon�vel" };
	protected int[] estoque = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
	protected int[] carrinho = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	protected double[] precos = { 120, 200, 350, 220, 400, 100, 300, 800, 120, 1200 };
}
