import java.util.Scanner;

public class distinctNumbers {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers:");
        Scanner input = new Scanner(System.in);
        //获取输入对象

        int[] times = new int[10];
        int[] numbers = new int[10];
        int[] distinctNumbers = new int[10];
        //创建次数和数字的数组
        int t=0,i=0,j=0,index=0;
        for (i =0;i<10;i++){

            t=0;
            numbers[i]=input.nextInt();

            for (j =0;j<i;j++){
                if (numbers[i]==numbers[j]){
                    t=1;
                }
            }
            for(i=0;i<index;i++){
                System.out.println(distinctNumbers[index]);
            }
            if (t==1) {
                distinctNumbers[index] = numbers[i];
                index++;
            }

            times[numbers[i]]++;
        }//将输入数据存入数组中

        for (i =0;i<10;i++){
            if (times[numbers[i]]==1)System.out.println("The number of distinct number is"+" "+numbers[i]);
        }//输出没有重复过的数字


    }
}
