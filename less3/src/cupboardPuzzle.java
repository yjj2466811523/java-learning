public class cupboardPuzzle {
    public static void main(String[] args) {
        int i, j;
        int[] id = new int[101];

        for (i = 1; i <= 100; i++) {
            for(j = 1;j <= 100; j++) {
                if (j%i==0)id[j]=1-id[j];
            }
        }
        for(i=1;i<=100;i++){
            System.out.print(id[i]+" ");
        }

    }
}
