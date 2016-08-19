package tiegoandrade.github.relogio;

import javax.swing.JOptionPane;

/**
 * Classe que executa a aplica��o
 * 
 * @version 1.0 19-08-2016
 * @author Tiego
 *
 */
public class MetodoMain {

	public static void main(String[] args) {

		// Cria��o de um objeto que representar� um rel�gio
		Relogio_Apresentacao r1 = new Relogio_Apresentacao();

		// Atribui��o das horas, minutos e segundos de um rel�gio.
		r1.acertarRelogio(3, 30, 50);

		/*
		 * Sa�da de dados para mostrar as posi��es dos ponteiros no rel�gio
		 * anal�gico
		 */
		JOptionPane.showMessageDialog(null, "Posi��o das horas: "
				+ r1.ponteiroHora.posicao + "\n" + "Posi��o dos minutos: "
				+ r1.ponteiroMinuto.posicao + "\n" + "Posi��o dos minutos: "
				+ r1.ponteiroSegundo.posicao);

		// Sa�da de dados para mostrar a hora em um rel�gio digital
		int hora = r1.lerHora();
		int minuto = r1.lerMinuto();
		int segundo = r1.lerSegundo();

		JOptionPane.showMessageDialog(null, "Hora: " + hora + "\n"
				+ "Minutos: " + minuto + "\n" + "Segundos: " + segundo);
	}
}
