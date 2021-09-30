import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String petName;
        int[] _perc;

        //Input string
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");
        System.out.print("What is your dog's name?");
        petName = reader.nextLine();
        System.out.print("Well then, I have this highly reliable report on " + petName);
        System.out.print("'s prestigious background right here.\n\n");
        System.out.println(petName + " is:\n");

        _perc = PercentageGenerator();
        System.out.println(
                _perc[0]+ "% St. Bernard\n" +
                _perc[1]+ "% Chihuahua\n" +
                _perc[2]+ "% Dramatic RedNosed Asian Pug\n" +
                _perc[3]+ "% Common Cur\n" +
                _perc[4]+ "% King Doberman"
        );

        System.out.println("\nWow, that's QUITE the dog!");
    }
    static int[] PercentageGenerator()
    {
        Random random = new Random();
        int[] perc = new int[5];
        int totalPercentage = 100;
        for (int i=0;i<4;i++)
        {
            perc[i] = random.nextInt(totalPercentage);
            totalPercentage -= perc[i];
        }
        perc[4] = totalPercentage;
        return perc;
    }
}
