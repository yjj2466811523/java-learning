import java.util.Scanner;

public class circleInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        Double x1=input.nextDouble();
        Double y1=input.nextDouble();
        Double r1=input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        Double x2=input.nextDouble();
        Double y2=input.nextDouble();
        Double r2=input.nextDouble();

        double dis = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        if(dis <= Math.abs(r1 - r2)){
            System.out.println("circle2 is inside circle1");
        }else if(dis <= (r1 + r2)){
            System.out.println("circle2 overlaps circle1");
        }else{
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
