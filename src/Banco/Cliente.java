package Banco;
import java.util.Scanner;

public class Cliente {
	// atributos
	protected String endereco;
	protected String nome;
	protected double saldoInicial;
	
	Scanner sc = new Scanner(System.in);

	// construtor 
	public Cliente(String endereco) {
		this.endereco = endereco;
	}
	
	// métodos
	void abrirConta() {
		 //Obtendo os dados iniciais do Cliente
		System.out.println("______________________________________________");
        System.out.println("\t CADASTRANDO NOVO CLIENTE \n");
        System.out.print("Entre com seu nome: ");
        nome = sc.nextLine();
        System.out.print("Insira seu endereço: ");
        endereco = sc.nextLine();
        System.out.print("Deposite um valor inicial: ");
        saldoInicial = sc.nextDouble();
        System.out.println("Conta criada com sucesso! Acesse o menu de opções: \n");
	}
	
	void fecharConta() {
		
	}
	
	void realizarTransacao() {
		
	}
}
