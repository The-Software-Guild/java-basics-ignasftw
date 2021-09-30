import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int maxbpm;
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---\nWhat is your age?");
        maxbpm = 220 - reader.nextInt();
        System.out.println(
                "Your maximum heart rate should be " + maxbpm + " beats per minute\n" +
                "Your target HR Zone is " + String.format("%.0f", (maxbpm * 0.5)) + " - " + String.format("%.0f", (maxbpm * 0.85)) + " beats per minute");
    }
}
