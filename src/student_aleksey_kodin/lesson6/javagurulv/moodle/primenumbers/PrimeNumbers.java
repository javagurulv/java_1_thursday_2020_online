package student_aleksey_kodin.lesson6.javagurulv.moodle.primenumbers;

import java.util.ArrayList;

public class PrimeNumbers {

    public static void main(String[] args) {
    int[] primeArray = new int[100];

    primeArray[0] = 2;
    int sum = 2;
    int primeCount = 1;

        for(int count = 3; count <= 500; count++) {

            for (int i:primeArray) {
                if( count == 17 || count == 71) break;
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
        System.out.print("sum = " + sum);
        System.out.print(" count = " + primeCount);
        System.out.println();
        System.out.println("If use algorithm Freshet Eratosthenes");
        System.out.println(PrimeNumbersFreshetEratosthenes(500));
    }
    static String  PrimeNumbersFreshetEratosthenes(int range) {
        ArrayList<Integer> numberRange = new ArrayList<>();
        int primeCount = 1;

        for (int count = 2; count <= range; count++) {
            numberRange.add(count);
        }
        for (int element = 0; element < numberRange.size() - 1; element++) {
            for (int count = primeCount; count <= numberRange.size() - 1; count++) {
               if(numberRange.get(count) % numberRange.get(element) == 0) {
                    numberRange.remove(count);
                }
            }
            primeCount++;
        }
        int sum = 0;
        primeCount = 0;
        for (int count = 0; count < 52; count++) {
            if (numberRange.get(count) == 17 || numberRange.get(count) == 71) {
                sum = sum;
            } else {
                sum = sum + numberRange.get(count);
                primeCount++;
            }
        }
    return  "sum = " + sum + " count = " + primeCount;
    }
}
