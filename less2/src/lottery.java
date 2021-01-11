import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, s = 0, j = 0, match = 0;
        String a, data;
        data = input.next();

//        System.out.print(data);
        a = String.valueOf((int) (Math.random() * 1000));
//        生成随机数
        for (i = 0; i < 3; i += 1) {
            s += (a.charAt(i) == data.charAt(i) ? 1 : 0);

            for (j = 0; j < 3; j += 1) {
                match += (data.charAt(i) == a.charAt(j) ? 1 : 0);

                if (data.charAt(i) == a.charAt(j)) {
                    break;
                }
            }
        }
//        匹配数字

        if (s == 3) {
            System.out.print("oh!! you get the $10000");
        } else if (match == 3) {
            System.out.print("oh!! you get the $3000");
        } else if (match == 1) {
            System.out.print("oh!! you get the $1000");
        } else {
            System.out.print("what a pity!!!");
        }
    }
//          根据判断结果输出
}
