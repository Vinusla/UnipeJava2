package unipe.metodLingua2.exe.Model;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {

	public ContaCorrente(String numero, String nome, double saldo) {
		super(numero, nome, saldo);		
	}
	
	
	public ContaCorrente(){
		
	}

	@Override
	public int compareTo(ContaCorrente o) {
		
		/*
		 * Para ordenar em ordem decrescente colocar -1 no primeiro if e no segundo if coloca 1
		 */
		
		if(this.getSaldo() < o.getSaldo())
			return 1;
		if(this.getSaldo() > o.getSaldo())
			return -1;
		
		return 0;
	}
	
	

	
	
	

}
