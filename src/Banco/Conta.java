package Banco;
import java.util.Scanner;

public class Conta {
	// declarando atributos e realizando encapsulamento
	protected int numeroConta;
	protected String titular;
	protected double saldo;

	// scanner
	Scanner sc = new Scanner(System.in);

	// construtor
	public Conta(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	// métodos
	boolean sacar(double valor) {
		System.out.println("______________________________________________");
		System.out.println("-> Quanto deseja sacar?");
        valor = sc.nextInt();
        
		if (valor < saldo) {
			this.saldo = saldo - valor;
			System.out.print("Saque realizado com sucesso! \n \n");
			// exibir saldo após o saque
			System.out.println("Saldo atual: " + saldo);
			System.out.println("______________________________________________");
			return true;
		} else {
			System.out.print("Saque indisponível.");
			System.out.println("______________________________________________");
			return false;
		}
	}

	boolean depositar(double valor) {
		System.out.println("______________________________________________");
		System.out.println("-> Quanto deseja depositar?");
        valor = sc.nextInt();
		this.saldo = valor + saldo;
		System.out.print("Depósito realizado com sucesso! \n \n");
		System.out.print("Saldo atual: " + saldo + "\n");
		System.out.println("______________________________________________");
		return true;
	}

	boolean transferir(double contaDestino, double valor) {
		boolean retirou = sacar(valor);
		if (retirou) {
			System.out.print("Conta destino: ");
	        contaDestino = sc.nextDouble();
			System.out.print("Valor: ");
	        valor = sc.nextInt();
			saldo = saldo - valor;
			return true;
		}

		else {
			return false;
		}

	}

	void extrato() {
		System.out.println("______________________________________________");
		System.out.println("\tEXTRATO \n");
		System.out.println("Nome: " + this.titular);
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.printf("Saldo atual: %.2f \n", this.saldo);
		System.out.println("______________________________________________ \n");
	}

	double getSaldo() {
		System.out.println("______________________________________________");
		System.out.println("\tSALDO \n");
		System.out.println("Saldo: " + saldo);
		System.out.println("______________________________________________");
		return saldo;
	}
	
	void exibeMenu() {
		System.out.println("______________________________________________ \n");
		System.out.println("\t Olá! Bem-vindo(a) ao Banco Java-T");
		System.out.println("______________________________________________");
        System.out.println("-> Já tem uma conta? \n");
        System.out.println("S - sim");
        System.out.println("N - não \n"); 
	}

	void exibeOpcoes() {
		System.out.println("______________________________________________ \n");
		System.out.println("\t Menu de opções");
		System.out.println("______________________________________________");
		System.out.println("-> Digite a opção desejada: \n");
		System.out.println("1 - Extrato");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("4 - Transferir");
		System.out.println("5 - Ver saldo");
		System.out.println("6 - Sair\n");
		verificar();
		continuar();
}
	
	void continuar() {
		System.out.println("\t -> Deseja continuar? S ou N");
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("S")) {
        	exibeOpcoes();
        } else if (opcao.equalsIgnoreCase("N")) {
        	System.out.println("\n \t O programa será encerrado.");
        }
	}
	
	void verificar() {
        int opcao1 = sc.nextInt();
		while (opcao1 > 0) {
			// chamando métodos conforme escolha
			if (opcao1 == 1) {
				extrato();
				continuar();
				break;
			}
			if (opcao1 == 2) {
				sacar(0);
				continuar();
				break;
			}
			if (opcao1 == 3) {
				depositar(0);
				continuar();
				break;
			}
			if (opcao1 == 4) {
				transferir(0, 0);
				continuar();
				break;
			}
			if (opcao1 == 5) {
				getSaldo();
				continuar();
				break;
			}
			if (opcao1 == 6) {
				System.out.println("Sistema encerrado.");
				break;
			}
		}
	}
    }
