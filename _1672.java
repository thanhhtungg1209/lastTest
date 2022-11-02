import java.util.Arrays;

public class _1672 {

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) { 
            int rowSum = 0;
            for (int col = 0; col < accounts[row].length; col++) { 
                rowSum = rowSum + accounts[row][col]; 
            }
            if (rowSum > max) { 
                max = rowSum;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };

        System.out.println(maximumWealth(accounts));
    }
}