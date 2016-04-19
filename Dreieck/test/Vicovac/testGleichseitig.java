package Vicovac;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class testGleichseitig {

	int s_a;
	int s_b;
	int s_c;

	private Dreieck dreieck;

	@Before
	public void setUp() throws Exception {
		dreieck = new Dreieck(s_a, s_b, s_c);
	}

	@Test
	public void testGleicheSeitenAll() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		assertTrue(dreieck.gleichSeitig());
	}
	@Test
	public void testGleicheSeitenAllZero() {
		dreieck.setSeite_a(0);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(0);
		assertFalse(dreieck.gleichSeitig());
	}
	@Test
	public void testAundCGleich() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		assertFalse(dreieck.gleichSeitig());

	}

	@Test
	public void testBundCGleich() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(2);
		assertFalse(dreieck.gleichSeitig());

	}

	@Test
	public void testAllesNegativ() {
		dreieck.setSeite_a(-2);
		dreieck.setSeite_b(-2);
		dreieck.setSeite_c(-2);
		assertFalse(dreieck.gleichSeitig());
	}



	@Test
	public void testAlleVerschiden() {
		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(3);
		assertFalse(dreieck.gleichSeitig());
	}
}