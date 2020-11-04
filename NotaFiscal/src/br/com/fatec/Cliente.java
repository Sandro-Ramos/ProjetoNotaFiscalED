package br.com.fatec;

/**
 * 
 * @author Adriana, Fernando,Matheus, Sandro e Thiago
 */



public class Cliente {
	private int cpf;
	private String nome;
	private String endereco;
	private String cidade;
	private int telefone;

	public Cliente() {
	}
	
	 /**
	  * construtor Cliente
	  * @param cpf
	  * @param nome
	  * @param endereco
	  * @param cidade
	  * @param telefone
	  */
	 
	public Cliente(int cpf, String nome, String endereco, String cidade, int telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.telefone = telefone;
	}

	/**
	 * 
	 * @return getters e setters
	 */
	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
