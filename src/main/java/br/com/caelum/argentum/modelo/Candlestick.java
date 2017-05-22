package br.com.caelum.argentum.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Candlestick {

	private final double abertura;
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final double volume;
	private final Calendar data;
	
	public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
		if(minimo > maximo)
			throw new IllegalArgumentException("O mínimo não pode ser maior que o máximo.");
		if(data == null)
			throw new IllegalArgumentException("data nao pode ser nula.");
		if(abertura < 0 || fechamento < 0 || minimo < 0 || maximo < 0 || volume < 0)
			throw new IllegalArgumentException("valores não podem ser negativos.");
		
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public Calendar getData() {
		return data;
	}
	
	public boolean isAlta() {
		return this.abertura > this.fechamento;
	}
	
	public boolean isBaixa() {
		return this.abertura > this.fechamento;
	}

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dia = format.format(data.getTime());
		return "Candlestick [abertura=" + abertura + ", fechamento=" + fechamento + ", minimo=" + minimo + ", maximo="
				+ maximo + ", volume=" + volume + ", data=" + dia + "]";
	}
	


}
