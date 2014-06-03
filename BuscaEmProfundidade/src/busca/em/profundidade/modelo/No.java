/**
 *  Classe que representa os nós do grafo.
 *
 *  @author Bruno Alex de Oliveira
 *  @date   04/06/2013
 *  	
 *		Cada nó deve receber um id na criação que deverá obrigatoriamente começar com 0;
 *		Deverá receber também uma matriz contendo os id's dos nós nos quais ele é adjacente;
 * 
 */

package busca.em.profundidade.modelo;

public class No {
	private int id;
	private int estado;
	private int[] adjacencias;

	/**
	 * Construtor da classe
	 * 
	 * @param id
	 *            Id do nó
	 * @param adjacencias
	 *            Matriz com as adjacências do nó
	 */
	public No(int id, int[] adjacencias) {
		this.id = id;
		this.adjacencias = adjacencias;
	}

	/**
	 * Getters e Setters
	 */
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setAdjacencias(int[] adjacencias) {
		this.adjacencias = adjacencias;
	}

	public int[] getAdjacencias() {
		return this.adjacencias;
	}
}
