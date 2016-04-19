package Vicovac;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class testRechtWinklig {

	int s_a;
	int s_b;
	int s_c;

	private Dreieck dreieck;

	@Before
	public void setUp() throws Exception {
		dreieck = new Dreieck(s_a, s_b, s_c);
	}
	@Test
	public void testGleichSeitig() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testNotRechtWinkelig() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(5);
		
		assertFalse(dreieck.rechtWinkelig());
	}
	
	@Test
	public void testIstCGroesserBKleinerA() {
		dreieck.setSeite_a(9);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(9);
		
		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void testIstAKeinDreieck() {
		dreieck.setSeite_a(-5);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(4);
		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void testBIstKeinDreieck() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(-3);
		dreieck.setSeite_c(4);
		assertFalse(dreieck.rechtWinkelig());
	}

	@Test
	public void testCIstKeinDreieck() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(-4);
		assertFalse(dreieck.rechtWinkelig());
	}
	@Test
	public void testAGroesserBC() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(4);
		assertTrue(dreieck.rechtWinkelig());
	}
	@Test
	public void testBGroesserAC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(4);
		assertTrue(dreieck.rechtWinkelig());
	}
	@Test
	public void testCGroesserAB() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(4);
		assertTrue(dreieck.rechtWinkelig());
	}

}

