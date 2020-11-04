package br.com.fatec;

/**
 * 
 * @author Adriana, Fernando,Matheus, Sandro e Thiago
 */

public class Produto {
	private int codigo;
    private String nome;
    private int quantidade;
    private float valor;

    
    /**
     * 
     * @param codigo
     * @param nome
     * @param quantidade
     * @param valor
     */
    public Produto(int codigo, String nome, int quantidade, float valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    Produto() {}
       
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}

	

