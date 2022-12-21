package Banco;

public class PessoaJuridica extends Cliente{
	// atributos
	private String cnpj;
	private String razaoSocial;
	
	// construtor
	public PessoaJuridica(String cnpj, String razaoSocial, String endereco) {
		super(endereco);
	}
}
