import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        int a1=0,a2=0,a3=0;

        System.out.println("Please input the first number:");
        a1=input1.nextInt();
        System.out.println("Please input the second number:");
        a2=input2.nextInt();
        System.out.println("Please input the third number:");
        a3=input3.nextInt();

        if(a1+a2<=a3 || a1+a3<=a2 || a2+a3<=a1 ){
            System.out.print("ERROR!!!!!!");
        }else{
            System.out.println("GOOD JOB!!!! and the sum is :");
            System.out.print(a1+a2+a3);
        }
    }
}
