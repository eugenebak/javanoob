package com.bakulin.leet;

public class CountPrimes {
	
	public int countPrimes(int n) {
		
		// Count a number of number primes less than n. n is not negative.
		boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
        	if (notPrime[i] == false) {
        		count++;
        		for (int j = 2; i * j < n; j++) {
        			notPrime[i * j] = true;
        		}
        	}
        }
		return count;
    }

}
