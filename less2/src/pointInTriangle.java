import java.util.Scanner;

public class pointInTriangle {
    public static void main(String[] args) {
        String []ns =new String[5];

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查询的x和y(以空格分开)如:1 2");
        Double x = input.nextDouble();
        Double y = input.nextDouble();

//        System.out.print(x);
//        System.out.print(y);

        if(x>0 && y>0 && y<-0.5*x+100){
            System.out.println("The point is in the triangle!");
        }else{
            System.out.println("The point is not in the triangle!");
        }
    }
}
