package Vicovac;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class testGleichSchenklig {
	int s_a;
	int s_b;
	int s_c;
	
	private Dreieck dreieck;

	@Before
	public void setUp() {
		dreieck = new Dreieck(s_a, s_b, s_c);
	}
	
	@Test
	public void testAundBGleich(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(1);
		assertTrue(dreieck.gleichSchenkelig());
		
	}
	@Test
	public void testAundCGleich(){
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		assertTrue(dreieck.gleichSchenkelig());
		
	}
	@Test
	public void testBundCGleich(){
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		assertTrue(dreieck.gleichSchenkelig());
		
	}
	

	
}
