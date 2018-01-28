/****************************************
 * Test main for BigIntMethod class
 * Bill Nicholson and Evan Batsch
 * nicholdw@ucmail.uc.edu
 *
 */
package bigIntMethod;

import java.math.BigInteger;

/**
 * @author Bill Nicholson
 */
public class Main {

	public static void main(String[] args) {

		TestCase testCases[] = {
							new TestCase("2", false),
				            new TestCase("3", true),
				            new TestCase("4", false),
				          	new TestCase("7", true),
				            new TestCase("97",true),
				            new TestCase("100",false),
				            new TestCase("101",false)
		};
		int testsPassed = 0, testsFailed = 0, testNumber = 0;
		BigIntMethod bigIntMethod = new BigIntMethod(new BigInteger("0"));
		for (TestCase tc : testCases) {
			testNumber++;
			boolean result = bigIntMethod.testIfPrime(new BigInteger(tc.test));
			if (result ==  tc.expectedResult) {
				testsPassed++;
			} else {
				testsFailed++;
				System.out.println("Test " + testNumber + " failed (" + tc.test + ") .");
			}
		}
		if (testsPassed == testCases.length) {
			System.out.println("All tests passed.");
		} else {
			System.out.println(testCases.length - testNumber + " tests failed.");
		}
		System.out.println();

	}
	private static class TestCase {
		public TestCase(String test, boolean expectedResult) {this.test = test; this.expectedResult = expectedResult;}
		public String test;
		public boolean expectedResult;
	}
}
