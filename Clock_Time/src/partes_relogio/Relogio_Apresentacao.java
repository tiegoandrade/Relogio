package partes_relogio;

public class Relogio_Apresentacao {
	
	// Cria��o dos objetos que representaram os atributos
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	// M�todo para acertar o hor�rio do rel�gio
	void acertarRelogio (int hora, int minuto, int segundo){
		hora = hora % 12; // Transforma a hora apresentada pelo usu�rio em uma hor�rio que pode ser representado em um rel�gio anal�gico
		ponteiroHora.posicao = hora;
		// Os minutos e os segundos s�o dividos por 5 para serem representados em um rel�gio anal�gico.
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}
	
	// M�todos que retornam as horas, minutos e segundos de um rel�gio anal�gico para um rel�gio digital.
	int lerHora(){
		return ponteiroHora.posicao;
	}
	int lerMinuto(){
		return ponteiroMinuto.posicao *5;
	}
	int lerSegundo(){
		return ponteiroSegundo.posicao *5;
	}
}
