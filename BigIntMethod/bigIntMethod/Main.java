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

		String testCases[] = {
							new testCase("2", false),
				            new testCase("3", true),
				            new testCase("4", false),
				          	new testCase("7", true),
				            new testCase("97",true),
				            new testCase("100",false)
				            new testCase("101",false)
		};
		int testPassed = 0, testFailed = 0, testNumber = 0;
		BigIntegerMethod bigIntegerMethod = new BigIntegerMethod();
		for (testCase tc : testCases) {
			testNumber++;
			boolean result = bigIntegerMethod.testIfPrime(tc.test);
			if (result ==  tc.expectedResult) {
				testPassed++;
			} else {
				testFailed++;
				System.out.println("Test " + testNumber + " failed (" + tc.test + ") .");
			}
		}
		if (testNumber == testCases.length) {
			System.out.println("All tests passed.");
		} else {
			System.out.println(testCases.length - testNumber + " tests failed.");
		}
		System.out.println();

	}
	private class testCase {
		public testCase(String test, boolean expectedResult) {this.test = test; this.expectedResult = expectedResult;}
		public String test;
		public boolean expectedResult;
	}
}
