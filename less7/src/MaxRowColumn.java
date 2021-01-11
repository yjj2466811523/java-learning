import java.util.*;
public class MaxRowColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int n = input.nextInt();
        System.out.println("----the random array is----");
        int[][] a = new int[n][n];

        int[] maxRow = new int[n],maxColumn = new int[n];

        int maxrow=0,maxcolumn = 0;

        for(int i = 0; i < n;++ i){
            for(int j = 0;j < n;++ j){
                a[i][j] = (int)(Math.random() * 2);
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

        int k = 0;

        for(int i = 0; i < n;++ i){
            int x = 0;
            for(int j = 0;j < n;++ j){
                if(a[i][j] == 1){
                    x ++;
                }
            }
            if(x > maxrow){
                maxrow = x;
                maxRow[0] = i;
                k = 1;
            }else if(x == maxrow){
                maxRow[k] = i;
                k++;
            }
        }
        System.out.print("The max row is: ");
        for(int i = 0;i < k;++i){
            System.out.print(maxRow[i]);
            if(i != k-1){
                System.out.print(",");
            }else System.out.println("");
        }
        k = 0;
        for(int j = 0; j < n;++ j){
            int x = 0;
            for(int i = 0;i < n;++ i){
                if(a[i][j] == 1){
                    x ++;
                }
            }
            if(x > maxcolumn){
                maxcolumn = x;
                maxColumn[0] = j;
                k = 1;
            }else if(x == maxcolumn){
                maxColumn[k] = j;
                k++;
            }
        }
        System.out.print("The max column is: ");
        for(int i = 0;i < k;++i){
            System.out.print(maxColumn[i]);
            if(i != k-1){
                System.out.print(",");
            }else System.out.println("");
        }
    }
}
