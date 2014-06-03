package busca.em.profundidade.view;

import java.util.ArrayList;
import java.util.List;

import busca.em.profundidade.controlador.MatrizAdjacencia;
import busca.em.profundidade.controlador.Mensagem;
import busca.em.profundidade.controlador.MensagemGUI;
import busca.em.profundidade.modelo.No;

public class Teste {

	public static void main(String[] args) {

		int[] adj0 = { 1, 2, 3 };
		int[] adj1 = { 4, 5 };
		int[] adj2 = { 6 };
		int[] adj3 = { 9 };
		int[] adj4 = { 8 };
		int[] adj5 = {};
		int[] adj6 = {};
		int[] adj7 = { 5, 10 };
		int[] adj8 = { 7 };
		int[] adj9 = {};
		int[] adj10 = {};

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
