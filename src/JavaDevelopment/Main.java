package JavaDevelopment;

import java.awt.image.ImageProducer;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        System.out.println(getPrimes(100));

    }

    public static List<Integer> getPrimes(int count) {
        List<Integer> primes = new ArrayList<>();
        if (count > 0) {
            primes.add(2);
            for (int i = 3; primes.size() < count ; i = i + 2) {
                if (isPrime(i, primes)) {
                    primes.add(i);
                }
            }
        }
        return primes;
    }

    private static  boolean isPrime(int number, List<Integer> primes) {
        double sqrt = Math.sqrt(number);
        for (int n: primes) {
            if (n > sqrt) {
                return true;
            }
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }
}

