package unittest.cs105;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.GaussianEaster;

public class GaussianEasterTester {
	private static final int maximumScore = 5;
	private static final int maximumAssignmentScore = 8;
	private static int totalScore;
	
	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Test
	public void check2001() throws Exception {
		assertEquals("Output should match!", "Month: 4 Day: 15", GaussianEaster.computeDate(2001));

		totalScore += 1;
	}

	@Test
	public void check2005() throws Exception {
		assertEquals("Output should match!", "Month: 3 Day: 27", GaussianEaster.computeDate(2005));

		totalScore += 1;
	}

	@Test
	public void check2009() throws Exception {
		assertEquals("Output should match!", "Month: 4 Day: 12", GaussianEaster.computeDate(2009));

		totalScore += 1;
	}

	@Test
	public void check2013() throws Exception {
		assertEquals("Output should match!", "Month: 3 Day: 31", GaussianEaster.computeDate(2013));

		totalScore += 1;
	}

	@Test
	public void check2014() throws Exception {
		assertEquals("Output should match!", "Month: 4 Day: 20", GaussianEaster.computeDate(2014));

		totalScore += 1;
	}
}
