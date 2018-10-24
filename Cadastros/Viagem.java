package Cadastros;

public class Viagem {

	private int horaInicio;
	private int minutosInicio;
	private int horaTermino;
	private int minutosTermino;
	private int duracaoHoras;
	private int duracaoMinutos;
	private int duracaoTotalMinutos;

	private Viagem(int hora, int minutos) {
		this.horaInicio = hora;
		this.minutosInicio = minutos;
	}

	protected static Viagem obterViagem(int hora, int minutos) {
		Viagem v = new Viagem (hora, minutos);
		return v;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public int getMinutoInicio() {
		return minutosInicio;
	}

	public void encerrarViagem(int horaTermino, int minutosTermino) {
		this.horaTermino = horaTermino;
		this.minutosTermino = minutosTermino;
	}

	public int getHoraTermino() {
		return horaTermino;
	}

	public int getMinutosTermino() {
		return minutosTermino;
	}

	public int getDuracaoHoras(CalculaDuracao objDuracao) {
		if (objDuracao.getHoraTermino() == objDuracao.getHoraInicio())
				duracaoHoras = 0;
		if (objDuracao.getHoraTermino() > objDuracao.getHoraInicio()) //varias possibilidades... 
			if (objDuracao.getHoraTermino() == objDuracao.getHoraInicio() + 1) {  
				if (objDuracao.getMinutosTermino() < objDuracao.getMinutosInicio())  //nao chegou a uma hora
					duracaoHoras = 0;
				else //durou pelo menos uma hora
					duracaoHoras = 1;
			} else { //possivelmente ultrapassou duas horas
				if (objDuracao.getHoraTermino() - objDuracao.getHoraInicio() > 2) //
					duracaoHoras = objDuracao.getHoraTermino() - objDuracao.getHoraInicio();
				else if (objDuracao.getHoraTermino() -objDuracao.getHoraInicio() == 2 &&   //certamente menos de duas horas  
						 objDuracao.getMinutosTermino() < objDuracao.getMinutosInicio())    //e mais de uma hora
					duracaoHoras = 1;
				else //duracao de duas horas, certamente
					duracaoHoras = 2;
					
			}
		if (objDuracao.getHoraTermino() <  objDuracao.getHoraInicio()) 
			duracaoHoras = -1; //para casos em que a hora de termino nao foi registrada
		return duracaoHoras;
	}

	public int getDuracaoMinutos(CalculaDuracao objDuracaoMinutos) {
		if (objDuracaoMinutos.getMinutosTermino() > objDuracaoMinutos.getMinutosInicio()) 
			duracaoMinutos = objDuracaoMinutos.getMinutosTermino() - objDuracaoMinutos.getMinutosInicio();
		else {
			duracaoMinutos = 60 - objDuracaoMinutos.getMinutosInicio() + objDuracaoMinutos.getMinutosTermino() ;
			if (duracaoMinutos == 60) //caso especial
				duracaoMinutos = 0;
		}
		return duracaoMinutos;
	}

	public int getDuracaoTotalMinutos(CalculaDuracao objTotal) {
		duracaoTotalMinutos = objTotal.getDuracaoHoras() * 60 + objTotal.getDuracaoMinutos();
		return duracaoTotalMinutos;
	}

}
