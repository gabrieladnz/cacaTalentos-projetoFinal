package Banco;

public class ContaCorrente extends Conta {

	// construtor
	public ContaCorrente(int numeroConta, String titular, double saldo) {
		// chamando super classe
		super(numeroConta, titular, saldo);
	}
	
	// m�todo de taxa
	public void aplicarJuros() {
	     saldo -= 15.90;
	   }
}
