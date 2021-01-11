import java.util.Arrays;
import java.util.Scanner;

public class nameSort {
    public static void main(String[] args) {
        System.out.print("Please enter the numbers of the student：");
        Scanner input = new Scanner(System.in);

        int max =input.nextInt();
        //获取数组最大值——学生个数

        int i=0 ;
        int [] scores = new int[max];
        String[] names = new String[max];
        //初始化变量及数组

        for (i=0;i<max;i++){
            System.out.print("请输入第"+(i+1)+"位同学的名字和成绩：");

            names[i]=input.next();
            scores[i]=input.nextInt();
        }//获取i位同学的名字和成绩并存入数组

        Arrays.sort(names);

        for (i=0;i<max;i++)System.out.println(names[i]+scores[i]);
    }
}
