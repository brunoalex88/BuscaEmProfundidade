package busca.em.profundidade.view;

import java.util.ArrayList;
import java.util.List;

import busca.em.profundidade.controlador.MatrizAdjacencia;
import busca.em.profundidade.controlador.Mensagem;
import busca.em.profundidade.controlador.MensagemGUI;
import busca.em.profundidade.modelo.No;

public class Teste {

	public static void main(String[] args) {

		int[] adj0 = { 1, 5, 6, 10, 11, 15, 16, 17 };
		int[] adj1 = { 0, 2 };
		int[] adj2 = { 1, 3 };
		int[] adj3 = { 2, 4 };
		int[] adj4 = { 3, 5 };
		int[] adj5 = { 4, 6, 0 };
		int[] adj6 = { 5, 0, 7, 8 };
		int[] adj7 = { 6, 8 };
		int[] adj8 = { 7, 6, 9 };
		int[] adj9 = { 8 };
		int[] adj10 = { 0, 11 };
		int[] adj11 = { 10, 0 ,12 };
		int[] adj12 = { 11, 13, 18 };
		int[] adj13 = { 12, 14 };
		int[] adj14 = { 13, 15, 16, 17 };
		int[] adj15 = { 14, 0 };
		int[] adj16 = { 14, 0 };
		int[] adj17 = { 14, 0 };
		int[] adj18 = { 12, 19, 20 };
		int[] adj19 = { 18, 20 };
		int[] adj20 = { 18, 19, 21 };
		int[] adj21 = { 20, 22 };
		int[] adj22 = { 21 };

		No n0 = new No(0, adj0);
		No n1 = new No(1, adj1);
		No n2 = new No(2, adj2);
		No n3 = new No(3, adj3);
		No n4 = new No(4, adj4);
		No n5 = new No(5, adj5);
		No n6 = new No(6, adj6);
		No n7 = new No(7, adj7);
		No n8 = new No(8, adj8);
		No n9 = new No(9, adj9);
		No n10 = new No(10, adj10);
		No n11 = new No(11, adj11);
		No n12 = new No(12, adj12);
		No n13 = new No(13, adj13);
		No n14 = new No(14, adj14);
		No n15 = new No(15, adj15);
		No n16 = new No(16, adj16);
		No n17 = new No(17, adj17);
		No n18 = new No(18, adj18);
		No n19 = new No(19, adj19);
		No n20 = new No(20, adj20);
		No n21 = new No(21, adj21);
		No n22 = new No(22, adj22);

		List<No> nos = new ArrayList<No>();
		nos.add(n0);
		nos.add(n1);
		nos.add(n2);
		nos.add(n3);
		nos.add(n4);
		nos.add(n5);
		nos.add(n6);
		nos.add(n7);
		nos.add(n8);
		nos.add(n9);
		nos.add(n10);
		nos.add(n11);
		nos.add(n12);
		nos.add(n13);
		nos.add(n14);
		nos.add(n15);
		nos.add(n16);
		nos.add(n17);
		nos.add(n18);
		nos.add(n19);
		nos.add(n20);
		nos.add(n21);
		nos.add(n22);


		/*
		 * int[] adj0 = {}; int[] adj1 = {2}; int[] adj2 = {0}; int[] adj3 = {0,
		 * 2}; int[] adj4 = {0, 3}; int[] adj5 = {2, 4, 6}; int[] adj6 = {0, 4};
		 * int[] adj7 = {1, 5, 6};
		 * 
		 * No n0 = new No(0, adj0); No n1 = new No(1, adj1); No n2 = new No(2,
		 * adj2); No n3 = new No(3, adj3); No n4 = new No(4, adj4); No n5 = new
		 * No(5, adj5); No n6 = new No(6, adj6); No n7 = new No(7, adj7);
		 * 
		 * List<No> nos = new ArrayList<No>(); nos.add(n0); nos.add(n1);
		 * nos.add(n2); nos.add(n3); nos.add(n4); nos.add(n5); nos.add(n6);
		 * nos.add(n7);
		 */

		MatrizAdjacencia m = new MatrizAdjacencia(nos);
		m.preencheMatriz();
		m.percorrer(0);
		Mensagem.imprimirMensagem(m.toString());
		MensagemGUI.exibirMensagem(m.toString(), "Impressão da Matriz");

	}

}
