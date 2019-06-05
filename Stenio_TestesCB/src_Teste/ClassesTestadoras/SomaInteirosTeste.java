package ClassesTestadoras;


import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ClassesTestadas.SomaInteiros;

public class SomaInteirosTeste {
	
	@Test
	public void ConstructorTeste() {
		SomaInteiros si1 = new SomaInteiros();
		si1.toString();
	}
	
	//@Disabled
	@Test
	public void sumMax8N3Out6Teste() {
	    assertEquals(6 , SomaInteiros.sum(8, 3) , 0.00) ;
	}
	
	@Disabled
	@Test
	public void Teste() {
	    assertEquals(-1 , SomaInteiros.sum(3, -3) , 0.00) ;
	}
	
	@Disabled
	@Test
	public void Teste1() {
	    assertEquals(0 , SomaInteiros.sum(1, 0) , 0.00) ;
	}
	
	@Test
	public void Teste2() {
	    assertEquals(-1 , SomaInteiros.sum(-1, -1) , 0.00) ;
	}

}