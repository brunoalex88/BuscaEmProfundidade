/**
 *  Classe que representa os n�s do grafo.
 *
 *  @author Bruno Alex de Oliveira
 *  @date   04/06/2013
 *  	
 *		Cada n� deve receber um id na cria��o que dever� obrigatoriamente come�ar com 0;
 *		Dever� receber tamb�m uma matriz contendo os id's dos n�s nos quais ele � adjacente;
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
	 *            Id do n�
	 * @param adjacencias
	 *            Matriz com as adjac�ncias do n�
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
