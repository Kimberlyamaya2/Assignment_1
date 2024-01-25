
import java.util.Scanner;

public class NotFibbonacci {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of terms: ");
        int nums = scan.nextInt();
        //print/ gerneraye sequence
        Notfibbonacci(nums);
    }

    public static void Notfibbonacci (int nums){

        long num1 = 0; // previous num
        long num2 = 1;  // num before previous one

        //print first term
        System.out.print(num1 + "\n" + num2 + "\n");

        //generate terms (subsequent)
        for (int i = 0; i < nums; i++){
                    //formula ni = (3*ni-1) + (2*ni-2)
                    long term = (3 * num1) + ( 2 * num2);
                    //print terms
                    System.out.print(term + " \n");

                    num1 = num2; // update term
                    num2 = term; // update previous term
        }

        System.out.println(); // move to nxt line
    }
}
