public class CommonSubSequence {
    public static void main(String[] args) {

        String text1 = "abc";
        String text2 = "abc";


        int sum = CommonSequence(text1, text2);
        //System.out.println("The longest common sequence is " + CommonSequence(text1, text2));
        System.out.println("The length is: " + sum);

    }

    public static int CommonSequence(String text1, String text2) {

        int a = text1.length(); //obtain size
        int b = text2.length();
        int[][] c = new int[a + 1][b + 1]; //2D Array to store length

        //  Fill array
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    //length at the current position (i, j) is one plus length of sub that exclude matching characters
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    //two numbers as arguments and returns the one with the higher value
                    c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
                }
            }
        }
        return c[a][b];
    }
}
