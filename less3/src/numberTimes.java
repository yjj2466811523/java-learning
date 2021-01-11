import java.util.Scanner;

public class numberTimes {
    public static void main(String[] args) {
        System.out.print("Enter the integers between 1 and 100:");
        Scanner input = new Scanner(System.in);
        int i =0;
        int[] numbers = new int[100];
        int[] times = new int[100];
        for(i=0;;i++){
            numbers[i]=input.nextInt();

            if (numbers[i]==0)break;

            times[numbers[i]]++;
            System.out.println(numbers[i]+" occurs "+times[numbers[i]]+" times");
        }

    }
}
