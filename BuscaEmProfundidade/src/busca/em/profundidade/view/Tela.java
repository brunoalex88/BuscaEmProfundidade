package busca.em.profundidade.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import busca.em.profundidade.controlador.MatrizAdjacencia;
import busca.em.profundidade.controlador.MensagemGUI;
import busca.em.profundidade.modelo.No;

public class Tela {
	private List<No> nos;
	private MatrizAdjacencia matriz;

	public Tela() {
		nos = new ArrayList<No>();
	}

	public static void main(String[] args) {
		int menu = -1;
		Tela tela = new Tela();

		// Tela principal
		do {
			String aux = JOptionPane
					.showInputDialog("Simulador - Algoritmo de Busca em Profundidade\n\n"
							+ "1- Inserir nós\n2- Iniciar Percurso\n3- Sair\n\n");

			if (aux != null) {
				menu = Integer.parseInt(aux);

				if (menu > 0 && menu < 4) {
					switch (menu) {
					case 1:
						tela.criarNo();
						break;
					case 2:
						tela.iniciarPercurso();
						break;
					}
				} else {
					MensagemGUI.exibirMensagem("Opção de menu inválida",
							"Erro de menu");
				}

			} else {
				menu = 4;
			}

		} while (menu != 3);

	}

	private void iniciarPercurso() {
		matriz = new MatrizAdjacencia(nos);
		matriz.preencheMatriz();

		String aux = JOptionPane
				.showInputDialog("Digite o nó raiz(início do percurso)");

		if (aux == null)
			matriz.percorrer(0);
		else {
			matriz.percorrer(Integer.parseInt(aux));
			MensagemGUI
					.exibirMensagem(matriz.toString(), "Impressão da Matriz");
		}

	}

	private void criarNo() {
		List<Integer> adjacencias = new ArrayList<Integer>();
		int id = Integer.parseInt(JOptionPane
				.showInputDialog("Entre com o id do nó"));
		String aux;
		int[] adj = {};

		do {
			aux = JOptionPane.showInputDialog("Faz adjacência com nó:");

			if (aux != null) {
				adjacencias.add(Integer.parseInt(aux));
			} else {
				adjacencias.add(null);
			}

		} while (aux != null);

		if (adjacencias.size() == 1 && adjacencias.get(0) == null) {
			No no = new No(id, adj);
			nos.add(no);
		} else {
			if (adjacencias.get(adjacencias.size() - 1) == null) {
				adjacencias.remove(adjacencias.size() - 1);
			}

			int[] vetorAdj = new int[adjacencias.size()];

			for (int i = 0; i < vetorAdj.length; i++) {
				vetorAdj[i] = adjacencias.get(i);
			}

			No no = new No(id, vetorAdj);
			nos.add(no);
		}
	}

}
