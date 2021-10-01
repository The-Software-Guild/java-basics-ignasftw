import java.util.Random;
import java.util.Scanner;
/**
 * @author Ignotas Burba
 * @version 01.10.2021
 */
public class DogGenetics {
    public static void main(String[] args) {
        //Declare a scanner which will be used for input
        Scanner reader = new Scanner(System.in);
        //Declare a String which will store petName
        String petName;
        //Declare an int array which will store 5 random percentage values which sums to 100
        int[] perc;
        //Declare a String to store dog breeds
        String[] breeds = {"St. Bernard", "Chihuahua","Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};

        //Print the name of the software
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");
        //Print a question about the dog's name
        System.out.print("What is your dog's name?");
        //Read the pet's name
        petName = reader.nextLine();
        //Print introduction about fake information including the pet's name
        System.out.print("Well then, I have this highly reliable report on " + petName);
        System.out.print("'s prestigious background right here.\n\n");
        System.out.println(petName + " is:\n");

        //Call a method which will return an int array with 5 random percentage values
        perc = percentageGenerator(breeds.length);

        //FOR all breeds
        for (int i=0;i< breeds.length;i++)
        {
            //Print fake information about percentages with breed names
            System.out.println(perc[i]+"% "+breeds[i]);
        }
        System.out.println("\nWow, that's QUITE the dog!");
    }

    /**Uses random to generate 5 random percentage values that add to 100
     * @param numberCount number of random numbers should be generated
     * @return an array containing 5 random values which add to 100
     * */
    static int[] percentageGenerator(int numberCount)
    {
        //Declare random which will generate numbers
        Random random = new Random();
        //Declare an array which will return random values
        int[] perc = new int[numberCount];
        //Declare an int which is the total sum
        int totalPercentage = 100;
        //FOR all-1 values
        for (int i=0;i<perc.length;i++)
        {
            //Generate random value between 0 and 99
            perc[i] = random.nextInt(totalPercentage);
            //Subtract that random number from total percentage
            totalPercentage -= perc[i];
        }
        //Assign the remainder of the total percentage
        perc[perc.length-1] = totalPercentage;
        return perc;
    }
}
