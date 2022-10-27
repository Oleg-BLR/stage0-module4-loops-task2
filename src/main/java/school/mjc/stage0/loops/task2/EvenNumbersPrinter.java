package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public static void main(String[] args) {
        printEvenNumbers(9);
    }
    public static void printEvenNumbers(int printTillInclusive) {
        int counter = 1;
        while (counter <= printTillInclusive) {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}

