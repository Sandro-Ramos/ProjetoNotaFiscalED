package br.com.fatec;

import javax.swing.JOptionPane;

/**
 * 
 * @author Adriana, Fernando,Matheus, Sandro e Thiago
 *
 */

public class Main {

	public static void main(String[] args) {
		NotaFiscal nF = new NotaFiscal();

		String op = "S";
		while (!op.equals("N")) {

			int numeroNF;
			numeroNF = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da NOTA FISCAL: "));

			String naturezaOperacao;
			naturezaOperacao = JOptionPane.showInputDialog("Qual a natureza dessa opera�ao?");

			nF.setNumero(numeroNF);
			nF.setNaturOper(naturezaOperacao);

			System.out.println("Nota Fiscal n�: " + numeroNF);
			System.out.println("Natureza Opera��o: " + naturezaOperacao);

			nF.addCliente();
			nF.addPro();

			int opc;
			opc = JOptionPane.showConfirmDialog(null, "Deseja fazer outra nota " + "?", "Mensagem ao usuario",
					JOptionPane.YES_NO_OPTION);
			if (opc == JOptionPane.NO_OPTION) {
				op = "N";

			}
		}
	}

}
