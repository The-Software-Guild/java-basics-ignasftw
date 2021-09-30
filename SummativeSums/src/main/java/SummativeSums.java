public class SummativeSums {
    public static void main(String[] args) {
        System.out.println("--- exec-maven-plugin:1.2.1:exec (default-cli) @ Unit1 ---");
        int[][] array ={
                { 1, 90, -33, -55, 67, -16, 28, -55, 15 },
                { 999, -60, -77, 14, 160, 301 },
                { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }
        };
        for (int i=0;i<array.length;i++)
        {
            System.out.println("#"+(i+1)+" Array Sum: " + ArraySum(array[i]));
        }
    }

    static int ArraySum(int[] array){
        int sum=0;
        for (int i=0;i< array.length;i++){
            sum +=array[i];
        }
        return sum;
    }
}
