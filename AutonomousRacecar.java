import java.util.Random;
import java.util.Scanner;

public class AutonomousRacecar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int speed = 0;
        int seedValue;
        int newRandom;
        int threshold;

        System.out.println("Please enter the seed for the random number generator:");
        seedValue = scan.nextInt();

        System.out.println("Please enter the threshold:");
        threshold = scan.nextInt();

        Random random = new Random(seedValue);

        System.out.println("Starting the car...");
        System.out.print("Current speed: ");
        int seed = 0;

        do {
            seed += 5;
            System.out.print(seed + "...");
            newRandom = random.nextInt((threshold * 10)) + 1;
        } while (newRandom >= threshold);

        System.out.print("Done!");
        speed = seed;

        System.out.println("\nMaximum run speed: "  + speed);

    }
}
