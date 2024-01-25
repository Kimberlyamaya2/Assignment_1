import java.util.Scanner;

public class Sequence {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        int nums = scan.nextInt();
        long A[] = {0, 1, 2, 7, 20, 61, 182, 547, 1640,
                4921};
        System.out.println(NotFib(A, nums));

    }

    public static long NotFib(long [] A, int nums){

        long num1 = 0;
        long num2 = 1;


        //generate terms (subsequent)
        for (int i = 0; i < A.length; i++){
            //formula ni = (3*ni-1) + (2*ni-2)
            long term = (3 * num1) + ( 2 * num2);
            num1 = num2; // update term
            num2 = term; // update previous term
            //Sequence is equal to term in sequence
            if(A[i] == nums){
                System.out.print("Output: ");
                return i + 1; // add 1 to array to get location of Seq
            }
            else{
                //term is less to num in sequence
                if (nums < A[i]){
                    System.out.print("Output: ");
                    return i; //closet number to it
                }
            }
        }

        System.out.println(); // move to nxt line
        return A.length;
    }
}

