package uk.ac.york.eng1.triangle;

public class Triangle {

	public int classify(int a, int b, int c) {
		if (a <= 0 && b <= 0 && c <= 0)
			return 4; // invalid
		if (a <= c - b || b <= a - c || c <= b - a)
			return 4; // invalid
		if (a == b && b == c)
			return 1; // equilateral
		if (a == b || b == c || c == a)
			return 2; // isosceles
		return 3; // scalene
	}

}
