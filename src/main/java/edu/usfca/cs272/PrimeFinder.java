package edu.usfca.cs272;

import java.util.TreeSet;

/**
 * Finds primes, with an inefficient single-threaded implementation made
 * somewhat less inefficient with multithreading using a work queue.
 *
 * @author CS 272 Software Development (University of San Francisco)
 * @version Spring 2022
 */
public class PrimeFinder {
	/**
	 * A terrible and naive approach to determining if a number is prime.
	 *
	 * @param number to test if prime
	 * @return true if the number is prime
	 */
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = number - 1; i > 1; i--) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	/*
	 * This is an intentionally TERRIBLE implementation to cause a long-running
	 * calculation. There really is no realistic use of this approach.
	 */

	/**
	 * Returns a collection of all primes less than or equal to the max value.
	 *
	 * @param max the maximum value to evaluate if prime
	 * @return all prime numbers found up to and including max
	 * @throws IllegalArgumentException if parameters not 1 or greater
	 */
	public static TreeSet<Integer> trialDivision(int max) throws IllegalArgumentException {
		if (max < 1) {
			throw new IllegalArgumentException("Parameters must be 1 or greater.");
		}

		TreeSet<Integer> primes = new TreeSet<Integer>();

		for (int i = 1; i <= max; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}

		return primes;
	}

	/**
	 * Uses a work queue to find all primes less than or equal to the maximum
	 * value. The number of threads must be a positive number greater than or
	 * equal to 1.
	 *
	 * @param max the maximum value to evaluate if prime
	 * @param threads number of worker threads (must be positive)
	 * @return all prime numbers found up to and including max
	 * @throws IllegalArgumentException if parameters not 1 or greater
	 */
	public static TreeSet<Integer> findPrimes(int max, int threads) throws IllegalArgumentException {
		if (max < 1 || threads < 1) {
			throw new IllegalArgumentException("Parameters must be 1 or greater.");
		}

		/*
		 * TODO Multithread this implementation using a work queue with one task per
		 * number being tested. The work completed should be calling isPrime on a
		 * single number and SAFELY adding that number to a set if it is prime.
		 */
		throw new UnsupportedOperationException("Not yet implemented.");
	}

	/*
	 * TODO Add additional classes or methods as needed. Make sure to create work
	 * (or tasks) instead of workers here!
	 */

	/**
	 * Demonstrates this class.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		int max = 100;
		int threads = 3;

		// see if the single and mutli threaded versions return the same result
		System.out.println("Comparing prime numbers:");
		System.out.println(trialDivision(max));
		System.out.println(findPrimes(max, threads));
		System.out.println();
	}
}
