public class RemoveElement {
    public static void main(String [] args){

        //Improvise code

        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        //output
        System.out.print("Output: " + removeElement(nums, val) + " ");


        //modified new array
        System.out.print("New Array: [" );
          for(int i = 0; i  < removeElement(nums, val); i++){
              System.out.print(nums[i] + " , ");
          }
        System.out.print("]");

    }
    public static int removeElement(int [] nums, int val){

        // LEETCODE Promblem
        int k = 0;



       for(int i = 0; i < nums.length; i++){
           // num not equal to val
          if(nums[i] != val){
              //current element assigned to nums[k]
            nums[k] = nums[i];
            //move to the next position in the modified array
            k++;
          }
          else{
             if(val < nums[i]){
                  return i;
              }
          }

       }

      return k;

    }
}


