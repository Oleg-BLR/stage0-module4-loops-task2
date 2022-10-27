package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main(String[] args) {
//        printMultiplied(5);
        System.out.println();
//        printMultiplied(-5);
        System.out.println();
        printMultiplied(0);
    }

    public static void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int multiplication;
        if (multiplyByAndToInclusive > 0) {
            while (counter <= multiplyByAndToInclusive) {
                multiplication = counter * multiplyByAndToInclusive;
                System.out.println(multiplication);
                counter++;
            }
        } else if (multiplyByAndToInclusive < 0) {
            while (counter >= multiplyByAndToInclusive) {
                multiplication = counter * -1 * multiplyByAndToInclusive;
                System.out.println(multiplication);
                counter--;
            }
        } else {
            System.out.print("");
        }
    }
}
