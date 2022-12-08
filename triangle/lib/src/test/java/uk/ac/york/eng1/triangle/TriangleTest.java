package uk.ac.york.eng1.triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests for the {@link Triangle} class.
 */
public class TriangleTest {

  private Triangle triangle;

  @BeforeEach
  public void setup() {
    // Given a Triangle object...
    triangle = new Triangle();
  }

  @Test
  public void isosceles() {
    // When we classify a triangle with sides 4287 / 4287 / 3871...
    int triangleClass = triangle.classify(4287, 4287, 3871);

    // then we should see it as isosceles
    assertEquals(2, triangleClass,
        "Triangle with sides 4287/4287/3871 should be considered isosceles");
  }

  @Test
  public void isoscelesFirstThird() {
    int triangleClass = triangle.classify(4287, 3871, 4287);
    assertEquals(2, triangleClass,
        "Triangle with sides 4287/3871/4287 should be considered isosceles");
  }

  @Test
  public void isoscelesSecondThird() {
    int triangleClass = triangle.classify(3871, 4287, 4287);
    assertEquals(2, triangleClass,
        "Triangle with sides 3871/4287/4287 should be considered isosceles");
  }

  @Test
  public void allNegative() {
    int triangleClass = triangle.classify(-1, -1, -1);
    assertEquals(4, triangleClass, "Triangle with sides -1/-1/-1 should be considered invalid");
  }

  @Test
  public void tooShortFirst() {
    int triangleClass = triangle.classify(1, 4287, 3871);
    assertEquals(4, triangleClass, "Triangle with sides 1/4287/3871 should be considered invalid");
  }

  @Test
  public void tooShortSecond() {
    int triangleClass = triangle.classify(4287, 1, 3871);
    assertEquals(4, triangleClass, "Triangle with sides 4287/1/3871 should be considered invalid");
  }

  @Test
  public void tooShortThird() {
    int triangleClass = triangle.classify(4287, 3871, 1);
    assertEquals(4, triangleClass, "Triangle with sides 4287/3871/1 should be considered invalid");
  }

  @Test
  public void equilateral() {
    int triangleClass = triangle.classify(3, 3, 3);
    assertEquals(1, triangleClass, "Triangle with sides 3/3/3 should be considered equilateral");
  }

  @Test
  public void scalene() {
    int triangleClass = triangle.classify(3, 4, 5);
    assertEquals(3, triangleClass, "Triangle with sides 3/2/5 should be considered scalene");
  }

  @Test
  public void firstNegative() {
    int triangleClass = triangle.classify(-1, 2, 3);
    assertEquals(4, triangleClass, "Triangle with sides -1/2/3 should be considered invalid");
  }

  @Test
  public void firstSecondNegative() {
    int triangleClass = triangle.classify(-1, -2, 3);
    assertEquals(4, triangleClass, "Triangle with sides -1/-2/3 should be considered invalid");
  }

}
