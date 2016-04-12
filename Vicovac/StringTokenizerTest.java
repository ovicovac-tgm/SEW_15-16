package Vicovac;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.junit.Test;

public class StringTokenizerTest {

	StringTokenizer s;

	@Test
	public void testNextTokenWithSpaceDelimiter() {
		s = new StringTokenizer("this is a test");
		s.nextToken();
	}

	@Test
	public void testNextTokenWithTabulatorDelimiter() {
		s = new StringTokenizer("this\t is a test");
		s.nextToken();
	}
	@Test
	public void testNextTokenWithAnfangDelimiter() {
		s = new StringTokenizer("this\r is a test");
		s.nextToken();
	}
	@Test
	public void testNextTokenWithFormfeedDelimiter() {
		s = new StringTokenizer("this\f is a test");
		s.nextToken();
	}
	@Test (expected=NoSuchElementException.class)
	public void testNextTokenWithoutExistingToken() {
		s = new StringTokenizer("");
		s.nextToken();
	}
}
