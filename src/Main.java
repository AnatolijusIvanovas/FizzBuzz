// Simple FizzBuzz implementation for numbers from -100 to 100.

public class Main {
    public static void main(String[] args) {
        for (int i = -100; i < 101; i++) {
            if (i != 0 && i%3 == 0) System.out.print("Fizz");
            if (i != 0 && i%5 == 0) System.out.print("Buzz");
            if (i == 0 || i%3 != 0 && i%5 != 0) System.out.print(i);
            System.out.print("\n");
        }
    }
}