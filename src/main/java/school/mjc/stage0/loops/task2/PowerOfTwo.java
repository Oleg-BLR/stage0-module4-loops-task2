package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void main(String[] args) {
        printPower(0);
        printPower(4);
        printPower(-4);
    }

    public static void printPower(int power) {
        int counter = 1;
        long powerOfTwo = 0;
        if (power == 0) {
            System.out.println(1);
        } else if (power > 0) {
            System.out.println(1);
            while (counter <= power) {
                long powerOf = 2L;
                for (int i = 2; i <= counter; i++) {
                    powerOf = powerOf * 2;
                }
                powerOfTwo = powerOf;
                System.out.println(powerOfTwo);
                counter++;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
