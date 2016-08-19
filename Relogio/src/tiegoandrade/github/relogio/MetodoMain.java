package tiegoandrade.github.relogio;

import javax.swing.JOptionPane;

/**
 * Classe que executa a aplicação
 * 
 * @version 1.0 19-08-2016
 * @author Tiego
 *
 */
public class MetodoMain {

	public static void main(String[] args) {

		// Criação de um objeto que representará um relógio
		Relogio_Apresentacao r1 = new Relogio_Apresentacao();

		// Atribuição das horas, minutos e segundos de um relógio.
		r1.acertarRelogio(3, 30, 50);

		/*
		 * Saída de dados para mostrar as posições dos ponteiros no relógio
		 * analógico
		 */
		JOptionPane.showMessageDialog(null, "Posição das horas: "
				+ r1.ponteiroHora.posicao + "\n" + "Posição dos minutos: "
				+ r1.ponteiroMinuto.posicao + "\n" + "Posição dos minutos: "
				+ r1.ponteiroSegundo.posicao);

		// Saída de dados para mostrar a hora em um relógio digital
		int hora = r1.lerHora();
		int minuto = r1.lerMinuto();
		int segundo = r1.lerSegundo();

		JOptionPane.showMessageDialog(null, "Hora: " + hora + "\n"
				+ "Minutos: " + minuto + "\n" + "Segundos: " + segundo);
	}
}
