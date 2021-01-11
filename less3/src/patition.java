import java.util.Scanner;

public class patition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();int temp;
        int[] numbers= new int[max+1];
        for(int i=0;i<max;i++){
            numbers[i]=input.nextInt();
        }
        numbers[max]=max+1;
        int t=0;
        for(int i=0;i<max+1;i++){

            if(numbers[t]>numbers[i]){
                temp=numbers[i];

                for(int j =i;j>0;j--){
                    numbers[j]=numbers[j-1];
                }
                numbers[t]=temp;
                t++;
            }

        }

        for(int i =0 ;i<max+1;i++){
            System.out.print(numbers[i]+" ");
        }

    }

}
