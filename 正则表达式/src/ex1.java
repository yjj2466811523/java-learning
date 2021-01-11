import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("numberFind Processing:");

        Scanner stringToInput = new Scanner(System.in);
        String strToMatch ="";
        strToMatch += stringToInput.nextLine();

        Scanner stringPattern = new Scanner(System.in);
        String pattern =stringPattern.next();
        //获取输入的需要匹配的字符串和pattern

        boolean isMatch = Pattern.matches(pattern,strToMatch);
        System.out.println(isMatch);
        //判断是否匹配成功

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(strToMatch);
        if (m.find()){
            System.out.print(m.group().length()-1);

            System.out.println("Found value: "+m.group(0));
            System.out.println("Found value: "+m.group(1));
            System.out.println("Found value: "+m.group(2));
            System.out.println("Found value: "+m.group(3));
        }
        //正则表达式的捕获组学习

    }
}
