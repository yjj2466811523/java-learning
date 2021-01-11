import java.util.*;

public class DuplicateElementsRemove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the ten numbers: ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0;i < 10;++i){
            a.add(input.nextInt());
        }
        System.out.print("-------After Removing-------\n");
        remove(a);
    }
    public static void remove(ArrayList<Integer> b){
        Set<Integer> setList = new HashSet<>();
        for(int i = 0;i < 10;++i){
            int s = b.get(i);
            if(!setList.contains(s)){
                System.out.print(s + " ");
                setList.add(s);
            }
        }
    }
}
