import java.util.Scanner;


public class isSorted{
    public static void main(String[] args) {
        System.out.println("Enter list: ");
        Scanner input = new Scanner(System.in);

        int i,max;
        int[] numbers = new int[10];
        max = input.nextInt();

        for (i=0;i<max;i++){

            numbers[i]= input.nextInt();
//            System.out.println(numbers[i]);

        }
        System.out.print((isSort(numbers)==1)?"The list is already sorted":"The list is not sorted");
    }

    public static int isSort(int[] list){
        int max=0,i=0,t=0;

        max= list.length;

        for (i=0;i<max-1;i++){
            t=(list[i]<=list[i+1])?1:0;
            if (t==0)return 0;
        }
        return 1;
    }
}
