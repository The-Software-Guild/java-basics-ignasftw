/**
 * @author Ignotas Burba
 * @version 01.10.2021
 */
public class SummativeSums {
    /**
     * METHOD: Main method where the program starts
     */
    public static void main(String[] args) {
        //Print the name of the program
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");
        //Declare a matrix which contains array of int arrays
        int[][] array ={
                { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
                { 999, -60, -77, 14, 160, 301 },
                { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }
        };
        //FOR all arrays in array variable cycle through
        for (int i=0;i<array.length;i++)
        {
            //Print out the sum answer
            System.out.println("#"+(i+1)+" Array Sum: " + arraySum(array[i]));
        }
    }

    /**
     * METHOD: Returns an int which is the sum of the int array
     * @param  array an array including all numbers
     * @return      int which is the sum of an array
     */
    static int arraySum(int[] array){
        //Set the initial sum to zero
        int sum=0;
        //FOR all int in the array
        for (int i=0;i< array.length;i++){
            //Add the int to the sum
            sum +=array[i];
        }
        return sum;
    }
}
