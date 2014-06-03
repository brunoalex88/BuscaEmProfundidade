/*
 * Classe que representa a Matriz de Adjac�ncia que ser� utilizada para percorrer o grafo
 * 
 * @author Bruno Alex de Oliveira
 * @date 04/06/2013
 * 
 */

package busca.em.profundidade.controlador;

import java.util.List;

import busca.em.profundidade.modelo.No;
import busca.em.profundidade.modelo.Pilha;

public class MatrizAdjacencia {
	private int[][] matriz;
	private int dimensao;
	private List<No> nos;
	private Pilha pilha;

	/**
	 * Construtor que recebe a lista de n�s e a dimens�o
	 */
	public MatrizAdjacencia(List<No> nos) {
		this.dimensao = nos.size();
		this.matriz = new int[dimensao][dimensao];
		this.nos = nos;

		pilha = new Pilha();
	}

	/**
	 * Preenche a matriz a partir da lista com os n�s e suas adjac�ncias.
	 */
	public void preencheMatriz() {
		int linha;

		for (int i = 0; i < nos.size(); i++) {
			linha = nos.get(i).getId();

			for (int j = 0; j < nos.get(i).getAdjacencias().length; j++) {
				matriz[linha][nos.get(i).getAdjacencias()[j]] = 1;
			}

		}
	}

	/**
	 * Imprime a matriz de adjac�ncia.
	 * 
	 * @return String contendo a matriz de adjac�ncia para impress�o.
	 * */
	public String toString() {
		String saida = "";

		for (int i = 0; i < nos.size(); i++) {
			for (int j = 0; j < nos.size(); j++) {
				saida += matriz[i][j] + "   ";
			}
			saida += "\n";
		}

		return saida;
	}

	/**
	 * Executa toda a l�gica de percorrer a matriz.
	 * 
	 * @param noRaiz
	 *            N� que deve iniciar o percurso.
	 * */
	public void percorrer(int noRaiz) {
		pilha.push(noRaiz);

		do {
			boolean semAdjacencia = true;
			int[] linha = lerLinha(pilha.lerTopo());

			for (int i = 0; i < linha.length; i++) {
				if (linha[i] == 1) {
					semAdjacencia = false;
					marcarColuna(i, 1, 2);
					pilha.push(i);
					i = linha.length;
				}
			}

			if (semAdjacencia) {
				marcarColuna(pilha.lerTopo(), 2, 3);
				pilha.pop();
			}

			MensagemGUI.exibirMensagem(this.toString(), "Matriz");
			
		} while (pilha.lenght() > 0);

	}

	/**
	 * M�todo utilizado para fazer a troca de valores da coluna
	 * 
	 * @param valorIn
	 *            Valor que dever� ser trocado pela vari�vel valorOut
	 * @param valorOut
	 *            Valor que dever� ser marcado na matriz
	 */
	private void marcarColuna(int coluna, int valorIn, int valorOut) {
		for (int i = 0; i < getDimensao(); i++) {
			if (matriz[i][coluna] == valorIn) {
				matriz[i][coluna] = valorOut;
			}
		}
	}

	/**
	 * L� uma linha espec�fica da matriz.
	 * 
	 * @param numero
	 *            N�mero da linha a ler.
	 * @return Retorna a linha da matriz.
	 * */
	public int[] lerLinha(int numero) {
		int[] linha = new int[nos.size()];

		for (int i = 0; i < nos.size(); i++) {
			linha[i] = matriz[numero][i];
		}

		return linha;
	}

	/**
	 * @return Retorna a dimens�o da matriz
	 * */
	public int getDimensao() {
		return this.dimensao;
	}

}
