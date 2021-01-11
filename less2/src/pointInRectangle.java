import java.util.Scanner;

public class pointInRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查询的x和y(以空格分开)如:1 2");
        String point = input.nextLine();

        int i,x,y=0;
        x=(int)point.charAt(0)-48;
        y=(int)point.charAt(2)-48;


        if(x>-5 && x<5 && y<5 && y>-5){
            System.out.println("Point is in the Rectangle");
        }else{
            System.out.println("Point is not in the Rectangle");
        }

    }
}
