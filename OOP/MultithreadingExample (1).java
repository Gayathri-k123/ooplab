import java.util.Scanner;

class MultiplicationTable extends Thread {
    public void run() {
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class PrimeNumbers implements Runnable {
    private int N;

    public PrimeNumbers(int N) {
        this.N = N;
    }

    public void run() {
        int count = 0, num = 2;
        System.out.println("First " + N + " Prime Numbers:");
        while (count < N) {
            if (isPrime(num)) {
                System.out.println(num + " ");
                count++;
            }
            num++;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of prime numbers to generate: ");
        int N = scanner.nextInt();

        MultiplicationTable tableThread = new MultiplicationTable();
        PrimeNumbers primeTask = new PrimeNumbers(N);
        Thread primeThread = new Thread(primeTask);

        tableThread.start();
        primeThread.start();

        try {
            tableThread.join();
            primeThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Multithreading demonstration completed.");
        scanner.close();
    }
}
