package unipe.metodLingua2.exe.Model;

public class Conta {
	
	private String numero, nome;
	private double saldo;
	
	
	public Conta(String numero, String nome, double saldo){
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;		
	}
	
	public Conta(){
	}

	
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString(){
		return "Numero: " + this.getNumero() + "Nome: " + this.getNome() + "\nSaldo: " + this.getSaldo();		
		
	}
	
	

}
