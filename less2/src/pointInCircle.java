import java.util.Scanner;

public class pointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查询的x和y(以空格分开)如:1 2");
        String point = input.nextLine();

        int i,x,y=0;
        x=(int)point.charAt(0)-48;
        y=(int)point.charAt(2)-48;
//        System.out.print(point);
        if(x*x+y*y>=100){
            System.out.println("点在圆内");
        }else {
            System.out.println("点在圆外");
        }

    }
}
