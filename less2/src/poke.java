import java.util.Scanner;

public class poke {
    public static void main(String[] args) {

        int colornumber,pokenumber;
        String a,b;


        b = String.valueOf((int) (Math.random() * 4));
        colornumber = (int)b.charAt(0)-48 ;

        a = String.valueOf((int) (Math.random() * 13));
        pokenumber = (int)a.charAt(0)-48 ;

//        System.out.println(b);

        System.out.print("The card you picked is");

        switch(pokenumber){
            case 0:
                System.out.print(" King ");
                break;
            case 1:
                System.out.print(" Ace ");
                break;
            case 2:
                System.out.print(" 2 ");
                break;
            case 3:
                System.out.print(" 3 ");
                break;
            case 4:
                System.out.print(" 4 ");
                break;
            case 5:
                System.out.print(" 5 ");
                break;
            case 6:
                System.out.print(" 6 ");
                break;
            case 7:
                System.out.print(" 7 ");
                break;
            case 8:
                System.out.print(" 8 ");
                break;
            case 9:
                System.out.print(" 9 ");
                break;
            case 10:
                System.out.print(" 10 ");
                break;
            case 11:
                System.out.print(" Jack ");
                break;
            case 12:
                System.out.print(" Queen ");
                break;
        }
        System.out.print("of");
        switch(colornumber) {
            case 0:
                System.out.print(" Hearts ");
                break;
            case 1:
                System.out.print(" Diamonds ");
                break;
            case 2:
                System.out.print(" Spades ");
                break;
            case 3:
                System.out.print(" Clubs ");
                break;
        }
    }
}
