package Banco;
import java.util.Scanner;

public class AppBanco {

	public static void main(String[] args) {
		
		Conta novaConta = new Conta(075, "Gabriela", 400);
		Cliente novoCliente = new Cliente("Recife");
		// scanner
		Scanner sc = new Scanner(System.in);
		
		// exibindo menu inicial
		novaConta.exibeMenu();
        String opcao = sc.nextLine();
		
		// utilizando equals para comprar String, podendo ser masc ou minusc
		if (opcao.equalsIgnoreCase("S")) {
			// chamando m�todo que exibir� as op��es ao usu�rio que tem uma conta
			novaConta.exibeOpcoes();

		} else if (opcao.equalsIgnoreCase("N")) {
			System.out.println("-> Deseja abrir uma conta?");
			System.out.println("S - sim");
			System.out.println("N - n�o");
	        String opcao2 = sc.nextLine();
	        
	        if(opcao2.equalsIgnoreCase("S")) {
	        	System.out.println("S - sim");
				novoCliente.abrirConta();
				novaConta.exibeOpcoes();
				
	        } else if(opcao2.equalsIgnoreCase("N")) {
	        	novaConta.exibeMenu();
	        }
		}
		else {
			System.out.print("Op��o inv�lida!");
		}
        
		// menu cliente cadastrado
		int opcao1 = sc.nextInt();

	}
}
