package Banco;

public class ContaPoupanca extends Conta {
	// construtor
	public ContaPoupanca(int numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
	}

	// método de taxa
	public void aplicarRendimento() {
		saldo += saldo * .006;
	}
}
