package Banco;

public class ContaPoupanca extends Conta {
	// construtor
	public ContaPoupanca(int numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
	}

	// m�todo de taxa
	public void aplicarRendimento() {
		saldo += saldo * .006;
	}
}
