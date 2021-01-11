import java.util.Scanner;

public class ISBN10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查询的ISBN-10的前九位:");
        String isbn = input.next();//获取输入对象


        int i,s =0;
        for(i=0;i<isbn.length();i+=1) {
            s += (i + 1) * ((int) isbn.charAt(i) - 48);
//            System.out.print(isbn.charAt(i));
//            System.out.print((int)isbn.charAt(i));
        }
        System.out.print("你的ISBN-10码为："+isbn);
        System.out.print(s%11);
    }
}
