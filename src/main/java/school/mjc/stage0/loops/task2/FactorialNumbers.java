package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {
        printFactorialRow(7);
//        printFactorialRow(2);
//        printFactorialRow(3);
//        printFactorialRow(0);
    }
    public static void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        if (printToInclusive == 0) {
            System.out.println(factorial);
        } else {
            int counter = 1;
            while (counter <= printToInclusive) {
                factorial = factorial * counter;
                System.out.println(factorial);
                counter++;
            }
        }
    }
}
