package uk.ac.york.eng1.triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TriangleTest {

	private Triangle t;

	@BeforeEach
	public void setup() {
		// Given a Triangle object...
		t = new Triangle();
	}

	@Test
	public void isosceles() {
		// When we classify a triangle with sides 4287 / 4287 / 3871...
		int triangleClass = t.classify(4287, 4287, 3871);

		// then we should see it as isosceles
		assertEquals(2, triangleClass, "Triangle with sides 4287/4287/3871 should be considered isosceles");
	}

	@Test
	public void isoscelesBC() {
		int triangleClass = t.classify(4287, 3871, 4287);
		assertEquals(2, triangleClass, "Triangle with sides 4287/3871/4287 should be considered isosceles");
	}

	@Test
	public void isoscelesAC() {
		int triangleClass = t.classify(3871, 4287, 4287);
		assertEquals(2, triangleClass, "Triangle with sides 3871/4287/4287 should be considered isosceles");
	}
	
	@Test
	public void allNegative() {
		int triangleClass = t.classify(-1, -1, -1);
		assertEquals(4, triangleClass, "Triangle with sides -1/-1/-1 should be considered invalid");
	}
	
	@Test
	public void aTooShortFirst() {
		int triangleClass = t.classify(1, 4287, 3871);
		assertEquals(4, triangleClass, "Triangle with sides 1/4287/3871 should be considered invalid");
	}

	@Test
	public void aTooShortSecond() {
		int triangleClass = t.classify(4287, 1, 3871);
		assertEquals(4, triangleClass, "Triangle with sides 4287/1/3871 should be considered invalid");
	}

	@Test
	public void aTooShortThird() {
		int triangleClass = t.classify(4287, 3871, 1);
		assertEquals(4, triangleClass, "Triangle with sides 4287/3871/1 should be considered invalid");
	}
	
	@Test
	public void equilateral() {
		int triangleClass = t.classify(3, 3, 3);
		assertEquals(1, triangleClass, "Triangle with sides 3/3/3 should be considered equilateral");
	}
	
	@Test
	public void scalene() {
		int triangleClass = t.classify(3, 4, 5);
		assertEquals(3, triangleClass, "Triangle with sides 3/2/5 should be considered scalene");
	}

	@Test
	public void firstNegative() {
		int triangleClass = t.classify(-1, 2, 3);
		assertEquals(4, triangleClass, "Triangle with sides -1/2/3 should be considered invalid");
	}

	@Test
	public void firstSecondNegative() {
		int triangleClass = t.classify(-1, -2, 3);
		assertEquals(4, triangleClass, "Triangle with sides -1/-2/3 should be considered invalid");
	}
	
}
