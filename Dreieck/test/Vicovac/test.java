package Vicovac;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import org.junit.*;

public class test {

	int s_a;
	int s_b;
	int s_c;

	private Dreieck dreieck;

	@Before
	public void setUp() {
		dreieck = new Dreieck(s_a, s_b, s_c);
	}

	@Test
	public void istDreieckSeiteANull() {

		dreieck.setSeite_a(0);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(2);
		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istDreieckSeiteBNull() {

		dreieck.setSeite_a(1);
		dreieck.setSeite_b(0);
		dreieck.setSeite_c(2);
		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istDreieckSeiteCNull() {

		dreieck.setSeite_a(1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(0);
		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istAPlusCIstB() {

		dreieck.setSeite_a(1);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(4);
		assertFalse(dreieck.istDreieck());
	}

	@Test
	public void istCPlusBIstA() {

		dreieck.setSeite_a(9);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(4);
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void istBPlusAIstC() {

		dreieck.setSeite_a(5);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(10);
		assertFalse(dreieck.istDreieck());
	}


	@Test
	public void ABKleinerNull() {

		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(5);
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void BCKleinerNull() {

		dreieck.setSeite_a(3);
		dreieck.setSeite_b(-1);
		dreieck.setSeite_c(-1);
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void ACKleinerNull() {

		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(2);
		dreieck.setSeite_c(-1);
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void ABKleinerC() {

		dreieck.setSeite_a(3);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(5);
		assertFalse(dreieck.istDreieck());
	}
	@Test
	public void BCKleinerA() {

		dreieck.setSeite_a(7);
		dreieck.setSeite_b(1);
		dreieck.setSeite_c(5);
		assertFalse(dreieck.istDreieck());
	}
	
	@Test
	public void CAKleinerA() {

		dreieck.setSeite_a(3);
		dreieck.setSeite_b(9);
		dreieck.setSeite_c(5);
		assertFalse(dreieck.istDreieck());
	}
	
	
	
}