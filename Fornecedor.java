package Heranca;

public class Fornecedor extends Pessoa {

	private float valorCredito, divida;

	public Fornecedor() {
		// TODO Auto-generated constructor stub
		
	}
	public Fornecedor(String nome, String endereco, String telefone, 
			float credito, float divida) {
		super(nome, endereco, telefone);// Chama Construtor da Classe (superclasse/Mãe)
		setValorCredito(credito);
		setDivida(divida);
	}
	
	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getDivida() {
		return divida;
	}

	public void setDivida(float divida) {
		this.divida = divida;
	}

	public float obterSaldo(){
		return this.valorCredito - this.divida;
	}
	
	
	public static void main(String[] args) {
		Fornecedor f = new Fornecedor("Fulano", "Rua x", "123", 234.36f, 100.00f);
		
		System.out.println("Nome:" + f.getNome() + " Saldo:"+   f.obterSaldo());
		System.out.println(f.getNome());
	}
}

