public class LongestCommonSubString {
    public static void main(String [] args){
        String text1 = "gears of war";
        String text2 = "History of warriors";
        System.out.print("Longest Common Substring: " + CommonSubString(text1, text2));
    }

    public static String CommonSubString(String text1, String text2){
        int a = text1.length(); //length of string
        int b = text2.length();
        int first = 0;
        int last = a;

        int [][] target = new int[a+1][b+1];


        for(int i =1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    target[i][j] = target[i-1][j-1] + 1;
                }
                if(target[i][j] > first){
                    first = target[i][j];
                    last = i;
                }
            }
        }
//no common subsequence
        if (first == 0){
            return " ";
        }

    //extract a substring starting from the position last - first up to the position last
        return text1.substring(last - first, last);
    }
}
