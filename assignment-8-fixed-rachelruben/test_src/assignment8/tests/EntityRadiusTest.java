package assignment8.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Test;

import assignment8.Entity;
import test.cse131.UnitTestUtils;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class EntityRadiusTest {
	@Test
	public void testZombie() {
		double x = 0.3;
		double y = 0.4;
		Entity zombie = new Entity(true, x, y);
		assertTrue(zombie.isZombie());
		assertEquals(x, zombie.getX(), UnitTestUtils.zeroDelta());
		assertEquals(y, zombie.getY(), UnitTestUtils.zeroDelta());
		assertThat(zombie.getRadius(), greaterThan(0.0));
	}

	@Test
	public void testNonzombie() {
		double x = 0.5;
		double y = 0.7;
		Entity nonzombie = new Entity(false, x, y);
		assertFalse(nonzombie.isZombie());
		assertEquals(x, nonzombie.getX(), UnitTestUtils.zeroDelta());
		assertEquals(y, nonzombie.getY(), UnitTestUtils.zeroDelta());
		assertThat(nonzombie.getRadius(), greaterThan(0.0));
	}
}
