import java.util.Scanner;

public class intersection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter xl , yl , x 2 , y 2 , x 3 , y 3 , x 4 , y 4 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double lineEndPointy1 = (y1 - y2);
        double lineEndPointy2 = (y3 - y4);
        double lineEndPointx1 = -(x1 - x2);
        double lineEndpointx2 = -(x3 - x4);

        if(lineEndPointy1 * lineEndpointx2 - lineEndPointy2 * lineEndPointx1 == 0)System.out.println("The two lines are parallel");
    }
}
