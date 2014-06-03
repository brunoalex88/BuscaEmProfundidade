/**
 * Classe que representa a estrutura de uma pilha de memória
 * 
 * @author  Bruno Alex de Oliveira
 * @date	04/06/2013 
 */

package busca.em.profundidade.modelo;

import java.util.ArrayList;
import java.util.List;

import busca.em.profundidade.controlador.MensagemGUI;

public class Pilha {
	private List<Integer> pilha;
	private String pilhaAcumulada;

	/**
	 * Contrutor da classe
	 */
	public Pilha() {
		pilha = new ArrayList<Integer>();
		pilhaAcumulada = "";
	}

	/**
	 * Insere o valor no topo da pilha
	 * 
	 * @param valor
	 *            Valor a ser inserido no topo da pilha
	 */
	public void push(int valor) {
		pilha.add(valor);
		pilhaAcumulada += "\n" + imprimirPilha();
		//MensagemGUI.exibirMensagem(pilhaAcumulada, "Conteúdo da Pilha");
	}

	/**
	 * Remove o topo da pilha
	 */
	public void pop() {
		if (pilha.size() > 0) {
			pilha.remove(pilha.size() - 1);
			pilhaAcumulada += "\n" + imprimirPilha();
			//MensagemGUI.exibirMensagem(pilhaAcumulada, "Conteúdo da Pilha");
		}
	}

	/**
	 * Lê o topo da pilha
	 * 
	 * @return Retorna o valor contido no topo da pilha
	 */
	public int lerTopo() {
		return pilha.get(pilha.size() - 1);
	}

	/**
	 * Calcula o tamanho da pilha
	 * 
	 * @return Retorna o tamanho da pilha
	 */
	public int lenght() {
		return pilha.size();
	}

	/**
	 * Imprime o conteúdo da pilha
	 */
	public String imprimirPilha() {
		String texto = "";

		for (int i = 0; i < pilha.size(); i++) {
			texto += pilha.get(i).toString();
		}

		// Mensagem.imprimirMensagem(texto);
		return texto;
	}

}
