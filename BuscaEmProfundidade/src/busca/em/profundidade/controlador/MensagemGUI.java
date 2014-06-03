package busca.em.profundidade.controlador;

import javax.swing.JOptionPane;

public class MensagemGUI {

	public static void exibirMensagem(String mensagem, String titulo) {
		JOptionPane.showMessageDialog(null, mensagem, titulo,
				JOptionPane.INFORMATION_MESSAGE);
	}

}
