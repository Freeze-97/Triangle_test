/**
 * 
 */
package triangleTest;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * Scalene - No two sides are equal
 * Isosceles - Two equal sides
 * Equilateral - Three sides of equal length
 */

/**
 * @author Tommy Yasi
 *
 */
public class TestTriangle {

	Triangle triangle;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		triangle = new Triangle();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {}

	@Test
	public void test1() {
		assertEquals("Scalene", triangle.getType(3, 4, 5));
	}
	
	@Test
	public void test2() {
		assertEquals("Equilateral", triangle.getType(3, 3, 3));
	}
	
	@Test
	public void test3() {
		assertEquals("Isosceles", triangle.getType(3, 4, 3));
	}
}
