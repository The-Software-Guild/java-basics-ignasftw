import java.util.Scanner;

public class HealthyHearts {

    /**Static method which runs a simple calculator for maximum and recommended beats per minute
    *   After inputting their age in terminal information about beats per minute will be presented
    */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Print out the software name and ask what is their age.
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---\nWhat is your age?");
        //The maximum heart rate should be 220 - their age.
        int maxBpm = 220 - reader.nextInt();
        //The target heart rate zone is the 50 - 85% of the maximum.
        System.out.println(
                "Your maximum heart rate should be " + maxBpm + " beats per minute\n" +
                "Your target HR Zone is " + String.format("%.0f", (maxBpm * 0.5)) + " - " + String.format("%.0f", (maxBpm * 0.85)) + " beats per minute");
    }
}
