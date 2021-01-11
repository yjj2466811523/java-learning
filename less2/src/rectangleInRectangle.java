import java.util.Scanner;

public class rectangleInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's cneter x-,y-coordinates,width, and height: ");
        Double x1=input.nextDouble();
        Double y1=input.nextDouble();

//        System.out.println(x1);
//        System.out.println(y1);

        Double width1= input.nextDouble();
        Double height1= input.nextDouble();


        System.out.print("Enter r2's cneter x-,y-coordinates,width, and height: ");
        Double x2=input.nextDouble();
        Double y2=input.nextDouble();

        Double width2= input.nextDouble();
        Double height2= input.nextDouble();

        int s=0;int t=0;

        s+=((x2-width2/2>x1-width1/2 && x2-width2/2<x1+width1/2) && (y2-height2/2>y1-height1/2 && y2-height2/2<y1+height1/2))?1:0;
        System.out.println(s);
        s+=((x2-width2/2>x1-width1/2 && x2-width2/2<x1+width1/2) && (y2+height2/2>y1-height1/2 && y2+height2/2<y1+height1/2))?1:0;
        System.out.println(s);
        s+=((x2+width2/2>x1-width1/2 && x2+width2/2<x1+width1/2) && (y2-height2/2>y1-height1/2 && y2-height2/2<y1+height1/2))?1:0;
        System.out.println(s);
        s+=((x2+width2/2>x1-width1/2 && x2+width2/2<x1+width1/2)&& (y2+height2/2>y1-height1/2 && y2+height2/2<y1+height1/2))?1:0;
        System.out.println(s);

        if(s==4){
            System.out.println("r2 is inside r1");
        }else if(s==0){
            System.out.println("r2 does not overlap r1");
        }else{
            System.out.println("r2 overlap r1");
        }
    }
}
