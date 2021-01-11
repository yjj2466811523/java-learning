import java.util.Scanner;

public class bubleSort {
    public static void main(String[] args) {
        System.out.print("Enter the 10-number numberlist:");
        Scanner input = new Scanner(System.in);

        int i,j=0;Double[] numbers = new Double[10];Double temp;

        for (i=0;i<10;i++){
            numbers[i]=input.nextDouble();
        }

        for (i=0;i<10;i++){
            for(j=i+1;j<=9;j++){
                if(numbers[i]>=numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }//冒泡排序
        for(i=0;i<10;i++){
            System.out.println(numbers[i]);
        }
    }
}
