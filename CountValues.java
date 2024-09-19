import java.util.Scanner;

public class CountValues
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int negativeNum = 0;
        int positiveNum = 0;
        int zeroNum = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Enter 5 numbers:");
            int numbers = scanner.nextInt();

            if (numbers < 0 ){
                negativeNum++;
            }else if (numbers > 0){
                positiveNum++;
            }else {
                zeroNum++;
            }
        }

        System.out.println("Number of negative numbers are " + negativeNum);
        System.out.println("Number positive numbers are " + positiveNum);
        System.out.println("Numbers or zeros are " + zeroNum);
    }
}
