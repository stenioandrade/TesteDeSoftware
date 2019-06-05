package ClassesTestadoras;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ClassesTestadas.ValidaData;

public class ValidaDataTeste {
	
	@Test
	public void ValidaDataDiaLimiteMaximo31Valido(){
		int dia = 31;
		int mes = 5;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMaximo30Valido(){
		int dia = 30;
		int mes = 6;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMaximo31Invalido(){
		int dia = 32;
		int mes = 5;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMaximo30Invalido(){
		int dia = 31;
		int mes = 6;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMinimoValido(){
		int dia = 1;
		int mes = 5;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMinimoInvalido(){
		int dia = 0;
		int mes = 5;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMaximoBissextoValido(){
		int dia = 29;
		int mes = 2;
		int ano = 2016;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMaximoBissextoInvalido(){
		int dia = 30;
		int mes = 2;
		int ano = 2016;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMinimoBissextoValido(){
		int dia = 1;
		int mes = 2;
		int ano = 2016;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataDiaLimiteMinimoBissextoInvalido(){
		int dia = 0;
		int mes = 2;
		int ano = 2016;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataMesLimiteMaximoValido(){
		int dia = 10;
		int mes = 12;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataMesLimiteMaximoInvalido(){
		int dia = 10;
		int mes = 13;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataMesLimiteMinimoValido(){
		int dia = 10;
		int mes = 1;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataMesLimiteMinimoInvalido(){
		int dia = 10;
		int mes = 0;
		int ano = 2019;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}
	
	@Test
	public void ValidaDataAnoLimiteMaximoValido(){
		int dia = 10;
		int mes = 5;
		int ano = Integer.MAX_VALUE;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}
	
	@Disabled
	@Test
	public void ValidaDataAnoLimiteMaximoInvalido(){
		int dia = 10;
		int mes = 5;
		int ano = Integer.MAX_VALUE;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}

	@Disabled
	@Test
	public void ValidaDataAnoLimiteMinimoValido(){
		int dia = 10;
		int mes = 5;
		int ano = Integer.MIN_VALUE;
		ValidaData vd1 = new ValidaData();
		assertTrue(vd1.validaData(dia, mes, ano));
	}

	@Disabled
	@Test
	public void ValidaDataAnoLimiteMinimoInvalido(){
		int dia = 10;
		int mes = 5;
		int ano = 0;
		ValidaData vd1 = new ValidaData();
		assertFalse(vd1.validaData(dia, mes, ano));
	}
	
}
