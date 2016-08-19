package tiegoandrade.github.relogio;

/**
 * Classe que repreesnta um rel�gio anal�gico ou digital.
 * 
 * @version 1.0 19-08-2016
 * @author Tiego
 *
 */
public class Relogio_Apresentacao {

	/** Representa o ponteiro das horas. */
	Ponteiro ponteiroHora = new Ponteiro();

	/** Representa o ponteiro dos minutos. */
	Ponteiro ponteiroMinuto = new Ponteiro();

	/** Representa o ponteiro dos segundos. */
	Ponteiro ponteiroSegundo = new Ponteiro();

	// M�todo para acertar o hor�rio do rel�gio
	public void acertarRelogio(int hora, int minuto, int segundo) {

		/*
		 * Transforma a hora apresentada pelo usu�rio em uma hor�rio que pode
		 * ser representado em um rel�gio anal�gico.
		 */
		hora = hora % 12;

		// Atribui o valor das horas � posi��o do ponteiro de hora do rel�gio.
		ponteiroHora.posicao = hora;
		
		/*
		 * Os minutos e os segundos s�o dividos por 5 para serem representados
		 * em um rel�gio anal�gico.
		 */
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}

	/**
	 * Mostra as horas em um rel�gio digital.
	 * 
	 * @return Horas.
	 */
	int lerHora() {
		return ponteiroHora.posicao;
	}
	
	/**
	 * Mostra os minutos em um rel�gio digital.
	 * 
	 * @return Minutos.
	 */
	int lerMinuto() {
		return ponteiroMinuto.posicao * 5;
	}
	
	/**
	 * Mostra os segundos em um rel�gio digital.
	 *
	 * @return Segundos.
	 */
	int lerSegundo() {
		return ponteiroSegundo.posicao * 5;
	}
}
