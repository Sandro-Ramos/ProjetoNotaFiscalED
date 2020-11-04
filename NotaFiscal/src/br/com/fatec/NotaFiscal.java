package br.com.fatec;

import java.util.Date;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Adriana, Fernando,Matheus, Sandro e Thiago
 */
	/*
	 * atributos da classe NotaFiscal
	 */
public class NotaFiscal {
	 private int numero;
	    private Date dataEmissao;
	    private String naturOper;
	    private ListaDeProdutos li;
	    private Cliente cliente;
	    
	    // construtor da classe nota fiscal default
	    public NotaFiscal() {
	    }
	    
	    /*
	     * construtor da classe NotaFiscal
	     */
	    public NotaFiscal(int numero, Date dataEmissao, String naturOper, ListaDeProdutos li, Cliente cliente) {
	        this.numero = numero;
	        this.dataEmissao = dataEmissao;
	        this.naturOper = naturOper;
	        this.li = li;
	        this.cliente = cliente;
	    }

	    /*
	     * getters e setters para acessar os atributos
	     */
	    
	    public int getNumero() {
	        return numero;
	    }

	    public void setNumero(int numero) {
	        this.numero = numero;
	    }

	    public Date getDataEmissao() {
	        return dataEmissao;
	    }

	    public void setDataEmissao(Date dataEmissao) {
	        this.dataEmissao = dataEmissao;
	    }

	    public String getNaturOper() {
	        return naturOper;
	    }

	    public void setNaturOper(String naturOper) {
	        this.naturOper = naturOper;
	    }

	    public ListaDeProdutos getLi() {
	        return li;
	    }

	    public void setLi(ListaDeProdutos li) {
	        this.li = li;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	        
	    }
	    
	    /**
	     * metodo para adicionar cliente a nota fiscal
	     */
	    public void addCliente(){
	        Cliente cli = new Cliente();
	            int cpf;
	            cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do Cliente: "));
	            
	            String nome;
	            nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
	            
	            String end;
	            end = JOptionPane.showInputDialog("Qual endereço?");
	            
	            String cid;
	            cid = JOptionPane.showInputDialog("De qual cidade?");
	            
	            int tel;
	            tel = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do Cliente: "));
	            
	            cli.setCpf(cpf);
	            cli.setNome(nome);
	            cli.setEndereco(end);
	            cli.setCidade(cid);
	            cli.setTelefone(tel);
	            
	            System.out.println("CPF: " +cli.getCpf());
	            System.out.println("Nome: " + cli.getNome());
	            System.out.println("Endereço: " + cli.getEndereco());
	            System.out.println("Cidade: " + cli.getCidade());
	            System.out.println("");
	            
	            }
	    
	    public void addPro(){
	        
	        ListaDeProdutos pr = new ListaDeProdutos();
	            String op = "S";
	            while(!op.equals("N")){ 
	            pr.addProduto(new Produto());
	        
	       int opc;
	            opc = JOptionPane.showConfirmDialog(null, "Incluir mais um Produto?",
	            "Mensagem ao usuario", JOptionPane.YES_NO_OPTION);
	            if(opc == JOptionPane.NO_OPTION){
	                op = "N";
	                }
	       }
	       
	        for(Produto pro : pr.getProd()){
	            System.out.println("Codigo: " + pro.getCodigo());
	            System.out.println("Nome: " + pro.getNome());
	            System.out.println("Valor: " + pro.getValor());
	            System.out.println("");
	             }
	        
	    }
	    public void adicionarNF(){
	          //metodo para enviar as notas para a pilha
	    }
	}
	    
	    
	   
	    
	    




