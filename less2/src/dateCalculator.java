import java.util.Scanner;

public class dateCalculator {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        int year,month,day,yearOfCentury,century,h;

        System.out.println("Enter Year:");

        year=input1.nextInt();

        System.out.println("Enter month:");

        month=input2.nextInt();

        System.out.println("Enter the day of the month: 1-31:");

        day=input3.nextInt();

        if(month==1||month==2){
            month+=12;
            year-=1;
        }

        yearOfCentury=year%1000;
        century=year/100;

//        System.out.println(k/4);

        h=(day+((26*(month+1))/10)+yearOfCentury+yearOfCentury/4+century/4+5*century)%7;
//        System.out.println(h);
        System.out.print("the day of the week is: ");
        switch(h){
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;

        }


    }


}
