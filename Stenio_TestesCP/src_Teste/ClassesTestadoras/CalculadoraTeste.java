package ClassesTestadoras;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ClassesTestadas.Calculadora;

public class CalculadoraTeste {
	
	@Test
	public void RaizQInteiroPositivoTeste(){
		Calculadora c1 = new Calculadora() ;
		assertTrue(c1.RaizQ(25) == 5.0) ;
	}
	
	@Test
	public void RaizQInteiroNegativoTeste(){
		Calculadora c1 = new Calculadora() ;
		assertFalse(c1.RaizQ(-25) == 5.0) ;
	}
	
	@Test
	public void RaizQRealPositivoTeste(){
		Calculadora c1 = new Calculadora() ;
		assertTrue(c1.RaizQ(15) == 3.872983346207417);
	}
	
	@Test
	public void SqrtRealPositivoTeste(){
		Calculadora c1 = new Calculadora() ;
		assertTrue(c1.Sqrt(15) == 3.872983346207417);
	}
	
	@Test
	public void SqrtInteiroNegativoTeste(){
		Calculadora c1 = new Calculadora() ;
		assertFalse(c1.Sqrt(-25) == 5.0);
	}
	
	@Test
	public void SqrtInteiroPositivoTeste(){
		Calculadora c1 = new Calculadora() ;
		assertTrue(c1.Sqrt(25) == 5.0);
	}
}