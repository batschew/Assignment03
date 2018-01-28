package bigIntMethod;

import java.math.BigInteger;

public class BigIntMethod {
	
	// Property
	BigInteger bigInt;
	
	// Constructor
	public BigIntMethod(BigInteger bigInt) {
		setBigInteger(bigInt);
	}
	
	// Getter
	public BigInteger getBigInteger() {return bigInt;}
	// Setter
	public void setBigInteger(BigInteger bigInt) {this.bigInt = bigInt;}
	
	/**
	 * Tests if a given BigInteger is prime
	 */
	// Method
	public boolean testIfPrime(BigInteger bigInt) {
		boolean isPrime = true; // flag
		// if bigInt is two, return true
		if (bigInt.equals(2)) {
			return isPrime;
		} // else if bigInt is even, return false
		// test odd bigInts using remainder method?
	}

	@Override
	// To string method
	public String toString() {
		return "BigIntMethod [bigInt=" + bigInt + "]";
	}

}
