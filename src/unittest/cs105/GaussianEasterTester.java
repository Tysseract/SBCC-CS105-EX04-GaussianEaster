package unittest.cs105;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.Main;

public class GaussianEasterTester {
	private static final int maximumScore = 5;
	private static final int maximumAssignmentScore = 8;
	private static int totalScore;
	
	private PrintStream oldOut;
	private InputStream oldIn;
	private ByteArrayOutputStream baos;
	private ByteArrayInputStream bais;

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

	public void runTest(int year) {
		this.bais = new ByteArrayInputStream((new Integer(year) + " ").toString().getBytes());
		System.setIn(this.bais);		
	}
	
	@Before
	public void setUp() {
		this.baos = new ByteArrayOutputStream();
		this.oldOut = System.out;
		this.oldIn  = System.in;
		System.setOut(new PrintStream(baos));
	}

	@After
	public void tearDown() {
		System.setOut(this.oldOut);
		System.setIn(this.oldIn);
		
		this.baos.reset();
	}

	@Test
	public void check2001() throws Exception {
		runTest(2001);
		Main.main(null);
		System.out.flush();

		assertEquals("Output should match!", "Year: Month: 4 Day: 15", this.baos.toString() );

		totalScore += 1;
	}

	@Test
	public void check2005() throws Exception {
		runTest(2005);
		Main.main(null);
		System.out.flush();

		assertEquals("Output should match!", "Year: Month: 3 Day: 27", this.baos.toString() );

		totalScore += 1;
	}

	@Test
	public void check2009() throws Exception {
		runTest(2009);
		Main.main(null);
		System.out.flush();

		assertEquals("Output should match!", "Year: Month: 4 Day: 12", this.baos.toString() );

		totalScore += 1;
	}

	@Test
	public void check2013() throws Exception {
		runTest(2013);
		Main.main(null);
		System.out.flush();

		assertEquals("Output should match!", "Year: Month: 3 Day: 31", this.baos.toString() );

		totalScore += 1;
	}

	@Test
	public void check2014() throws Exception {
		runTest(2014);
		Main.main(null);
		System.out.flush();

		assertEquals("Output should match!", "Year: Month: 4 Day: 20", this.baos.toString() );

		totalScore += 1;
	}
}
