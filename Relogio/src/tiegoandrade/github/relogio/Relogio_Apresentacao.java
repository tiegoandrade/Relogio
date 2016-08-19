package tiegoandrade.github.relogio;

/**
 * Classe que repreesnta um relógio analógico ou digital.
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

	// Método para acertar o horário do relógio
	public void acertarRelogio(int hora, int minuto, int segundo) {

		/*
		 * Transforma a hora apresentada pelo usuário em uma horário que pode
		 * ser representado em um relógio analógico.
		 */
		hora = hora % 12;

		// Atribui o valor das horas à posição do ponteiro de hora do relógio.
		ponteiroHora.posicao = hora;
		
		/*
		 * Os minutos e os segundos são dividos por 5 para serem representados
		 * em um relógio analógico.
		 */
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}

	/**
	 * Mostra as horas em um relógio digital.
	 * 
	 * @return Horas.
	 */
	int lerHora() {
		return ponteiroHora.posicao;
	}
	
	/**
	 * Mostra os minutos em um relógio digital.
	 * 
	 * @return Minutos.
	 */
	int lerMinuto() {
		return ponteiroMinuto.posicao * 5;
	}
	
	/**
	 * Mostra os segundos em um relógio digital.
	 *
	 * @return Segundos.
	 */
	int lerSegundo() {
		return ponteiroSegundo.posicao * 5;
	}
}
