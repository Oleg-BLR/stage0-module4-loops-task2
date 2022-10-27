package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(19);
    }

    public static void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter <= printToInclusive) {
            if (isPrime(counter) == true) {
                System.out.println(counter);
            }
            counter++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
