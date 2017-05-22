package br.com.caelum.argentum.modelo;

import java.util.Calendar;

import org.junit.Test;

public class CandlestickTest {

	@Test(expected=IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		Calendar c = Calendar.getInstance();
		new Candlestick(10, 20, 20, 10, 10000, c);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void dataNaoPodeSerNula(){
		new Candlestick(10, 20, 20, 10, 10000, null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void valoresNaoPodemSerNegativos(){
		new Candlestick(-10, 20, 20, 10, 10000, null);
	}

}
