package Cadastros;

public class CalculaDuracao {
	private int horaInicio;
	private int minutosInicio;
	private int horaTermino;
	private int minutosTermino;
	private int duracaoHoras;
	private int duracaoMinutos;
	private int duracaoTotalMinutos;

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getMinutosInicio() {
		return minutosInicio;
	}

	public void setMinutosInicio(int minutosInicio) {
		this.minutosInicio = minutosInicio;
	}

	public int getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}

	public int getMinutosTermino() {
		return minutosTermino;
	}

	public void setMinutosTermino(int minutosTermino) {
		this.minutosTermino = minutosTermino;
	}

	public int getDuracaoHoras() {
		return duracaoHoras;
	}

	public void setDuracaoHoras(int duracaoHoras) {
		this.duracaoHoras = duracaoHoras;
	}

	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}

	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}

	public int getDuracaoTotalMinutos() {
		return duracaoTotalMinutos;
	}

	public void setDuracaoTotalMinutos(int duracaoTotalMinutos) {
		this.duracaoTotalMinutos = duracaoTotalMinutos;
	}

	public void CalculaDuracao(int horaInicio, int minutosInicio, int horaTermino, int minutosTermino, int duracaoHoras, int duracaoMinutos, int duracaoTotalMinutos){
		this.horaInicio = horaInicio;
		this.minutosInicio = minutosInicio;
		this.horaTermino = horaTermino;
		this.minutosTermino = minutosTermino;
		this.duracaoHoras = duracaoHoras;
		this.duracaoMinutos = duracaoMinutos;
		this.duracaoTotalMinutos = duracaoTotalMinutos;
	}

	
}