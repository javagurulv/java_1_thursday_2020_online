package student_aleksey_kodin.lesson6.javagurulv.moodle.primenumbers;

import java.util.ArrayList;

class PrimeNumbers {

    public static void main(String[] args) {
    int[] primeArray = new int[60];

    primeArray[0] = 2;
    int sum = 2;
    int primeCount = 1;

        for(int count = 3; count <= 500; count++) {
            for (int i : primeArray) {
                if(count == 17 || count == 71) break;
                if(count % i == 0)  break;

                if (i * i  > count) {
                    primeArray[primeCount] = count;
                    sum = sum + count;
                    primeCount++;
                    break;
                }
            }
             if(primeCount == 50) break;
        }
        System.out.println("If use Loop method:");
        System.out.print("sum = " + sum);
        System.out.print(" count = " + primeCount);
        System.out.println();
        System.out.println("If use algorithm Freshet Eratosthenes:");
        System.out.println(PrimeNumbersFreshetEratosthenes());

        int sumPrime = 2;
        int countPrime = 1;

        for (int count = 3; count <500; count++) {
            if (isPrime(count)) {
                if(count != 17 && count != 71) {
                    sumPrime = sumPrime + count;
                    countPrime++;
                }
            }
            if (countPrime == 50) break;

        }
        System.out.println("If use method isPrime:");
        System.out.print("sum = " + sumPrime);
        System.out.print(" count = " + countPrime);
    }
    static String  PrimeNumbersFreshetEratosthenes() {
        ArrayList<Integer> numberRange = new ArrayList<>();

        for (int count = 2; count <= 500; count++) {
            numberRange.add(count);
        }

        int position = 0;
            while (position < numberRange.size() - 1) {
                int finalX = numberRange.get(position);

                int startArrayLength = numberRange.size() - 1;

                numberRange.removeIf(i -> i % finalX == 0);

                numberRange.add(position,finalX);

                if (startArrayLength == numberRange.size() - 1) break; // Если размер массива не меняется, то подсчёт закончен.

                position++;
        }
        // Create output format
        int sum = 0;
        int primeCount = 0;
        for (int count = 0; count < 52; count++) {
            if (numberRange.get(count) != 17 && numberRange.get(count) != 71) {
                sum = sum + numberRange.get(count);
                primeCount++;
            }
        }
    return  "sum = " + sum + " count = " + primeCount;
    }
    static boolean isPrime(int number) {
        if(number % 2 == 0) return false;
        int x = 3;
        while(x * x <= number && number % x !=0) {
            x += 2;
        }
    return x * x > number;
    }
}
