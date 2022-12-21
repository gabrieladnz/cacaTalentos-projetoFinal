package Banco;

public interface Transacao {
	
	public void exibeMenu();
	public boolean sacar(double valor);
	public boolean depositar(double valor);
	public boolean transferir(Conta contaDestino, double valor);
	public double getSaldo();
	
}
