import java.util.Arrays;

public class stringSort {
    public static void main(String[] args) {
        System.out.print(sortStr("acb"));
    }
    public static String sortStr(String string){
        String str= string;
        String sortedStr="";
        String[] strTemp = new String[string.length()];

        for(int i=0;i<str.length();i++){
            strTemp[i]= String.valueOf(str.charAt(i));
        }

        Arrays.sort(strTemp);

        for(int j=0;j<strTemp.length;j++){
            sortedStr+=strTemp[j];
        }

        return sortedStr;
    }
}
