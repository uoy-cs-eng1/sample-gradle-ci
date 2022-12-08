package uk.ac.york.eng1.triangle;

/**
 * Utility methods for triangles. 
 */
public class Triangle {

  /**
   * Classifies triangles according to the length of their sides.
   *
   * @param a First side of the triangle.
   * @param b Second side of the triangle.
   * @param c Third side of the triangle.
   * @return 1 if the triangle is equilateral, 2 if isosceles, 3 if scalene, and 4 if the sides do
   *     not represent a valid triangle.
   */
  public int classify(int a, int b, int c) {
    if (a <= 0 && b <= 0 && c <= 0) {
      return 4; // invalid
    }
    if (a <= c - b || b <= a - c || c <= b - a) {
      return 4; // invalid
    }
    if (a == b && b == c) {
      return 1; // equilateral
    }
    if (a == b || b == c || c == a) {
      return 2; // isosceles
    }
    return 3; // scalene
  }

}
