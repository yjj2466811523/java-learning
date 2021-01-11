import java.util.Arrays;
import java.util.Scanner;

public class arrayMerged {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0;

        System.out.print("Enter the list1:");
        int max1= input.nextInt();
        int[] numbers1 = new int[max1];

        for(i=0;i<max1;i++){
            numbers1[i]=input.nextInt();
        }

        System.out.print("Enter the list2:");
        int max2 = input.nextInt();
        int[] numbers2 = new int[max2];

        for(i=0;i<max2;i++){
            numbers2[i]=input.nextInt();
        }

        int[] mergedNumbers = new int[max1+max2];
        mergedNumbers=merge(numbers1,numbers2);

        for(i=0;i<max1+max2;i++){
            System.out.print(mergedNumbers[i]+" ");
        }
    }

    public static int[] merge(int[] list1,int[] list2){
        int[] list3= new int[list1.length+list2.length];

        for (int i=0;i<list1.length;i++){
            list3[i]=list1[i];
        }

        for(int j=0;j<list2.length;j++){
            list3[(j+list1.length)]=list2[j];
        }

        Arrays.sort(list3,0,list1.length+list2.length);

        return list3;
    }
}
