package ClassesTestadoras;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import ClassesTestadas.Largest;

public class LargestTeste {
	
	@Test
	public void LargestConstructorTeste(){
		Largest l1 = new Largest();
		l1.toString();
	}
	
	@Test
	public void LargestMaximoNoFinalTeste(){
		int[] lista = {1,2,3};
	    assertEquals(3 , Largest.largest(lista) , 0.00) ;
	}
	
	@Test
	public void LargestMaximoNoComecoTeste(){
		int[] lista = {3,2,1};
	      assertEquals(3 , Largest.largest(lista) , 0.00) ;
	}
	
	@Test
	public void LargestElementosIguaisTeste(){
		int[] lista = {2,2,2};
	    assertEquals(2 , Largest.largest(lista) , 0.00) ;
	}
	
	@Test
	public void LargestListaVaziaTeste(){
		int[] lista = {};
	    assertEquals(Integer.MIN_VALUE , Largest.largest(lista) , 0.00) ;
	}

}