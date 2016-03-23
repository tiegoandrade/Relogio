package partes_relogio;

public class Relogio_Apresentacao {
	
	// Criação dos objetos que representaram os atributos
	Ponteiro ponteiroHora = new Ponteiro();
	Ponteiro ponteiroMinuto = new Ponteiro();
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	// Método para acertar o horário do relógio
	void acertarRelogio (int hora, int minuto, int segundo){
		hora = hora % 12; // Transforma a hora apresentada pelo usuário em uma horário que pode ser representado em um relógio analógico
		ponteiroHora.posicao = hora;
		// Os minutos e os segundos são dividos por 5 para serem representados em um relógio analógico.
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}
	
	// Métodos que retornam as horas, minutos e segundos de um relógio analógico para um relógio digital.
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
