package Banco;

public class PessoaFisica extends Cliente {
	private String cpf;
	private String nome;
	
	// construtor
	public PessoaFisica(String cpf, String nome, String endereco) {
		super(endereco);
	}
}
