package br.com.fatec;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 * 
 * @author Adriana, Fernando,Matheus, Sandro e Thiago
 *
 */
	/**
	 * 
	 * // Cria a lista de produtos
	 *
	 */
public class ListaDeProdutos {
	private Set<Produto> prod = new HashSet<>();
    Scanner entrada = new Scanner(System.in);
//metodo para adicionar produtos
    public void addProduto(Produto p){
        
            int cod;
            cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo"));
            
            String nome;
            nome = JOptionPane.showInputDialog("Digite um nome de PRODUTO");
            
            float vlr;
            vlr = Float.parseFloat(JOptionPane.showInputDialog("Qual Valor?"));
           
            int resp;
            resp = JOptionPane.showConfirmDialog(null, "Confirma Produto?",
            "Mensagem ao usuario", JOptionPane.YES_NO_OPTION);
                if(resp == JOptionPane.YES_OPTION){
                    p.setCodigo(cod);
                    p.setNome(nome);
                    p.setValor(vlr);
                    prod.add(p);
                
          //falta o metodo para somar os produtos
        }
    }
    public Set<Produto> getProd() {
        return prod;
    }

    public void setProd(Set<Produto> prod) {
        this.prod = prod;
    }

}



