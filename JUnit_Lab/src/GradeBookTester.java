import static org.junit.Assert.*;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

public class GradeBookTester {

      private GradeBook g1;

      @Before

      public void setUp() {

            g1 = new GradeBook(5);

            g1.addScore(50);

            g1.addScore(75);

      }

      @After

      public void tearDown() {

            g1 = null;

      }

      @Test
      public void testAddScore() {
        assertEquals(2.0, g1.getScoreSize(), 0.01);

        assertTrue(g1.toString().equals("50.0 75.0 "));
      }

      @Test

      public void testSum() {
    	    assertEquals(125, g1.sum(), .0001);
    	  }

      @Test

      public void testMinimum() {
    	    assertEquals(50.0, g1.minimum(), .0001);
    	  }

      @Test

      public void testFinalScore() {
    	    assertEquals(75.0, g1.finalScore(), .0001);
    	  }

}