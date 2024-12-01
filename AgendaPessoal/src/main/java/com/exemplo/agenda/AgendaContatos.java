package com.exemplo.agenda;

import javax.swing.SwingUtilities;
import com.aula.agenda.view.ContatoView;
import com.exemplo.agenda.controller.ContatoController;
import com.exemplo.agenda.model.ContatoModel;

/**
 * Classe principal que inicializa a aplicação Agenda de Contatos
 * Responsável por criar instâncias dos componentes MVC e iniciar a interface
 * 
 * @version 1.0
*/

public class AgendaContatos {
	public static void main(String args[]) {
		// Executa a inicialização da aplicação na hread de eventos so Swing
		SwingUtilities.invokeLater(() -> {
			// Criação das insâncias de View, Model e Controller
			ContatoView view = new ContatoView();
			ContatoModel model = new ContatoModel();
			new ContatoController(view, model);
			
			// Tornando a interface gráfica visível
			view.setVisible(true);
		});
	}
}
