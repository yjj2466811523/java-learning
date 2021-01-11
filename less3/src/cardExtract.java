public class cardExtract {
    public static void main(String[] args) {

        int i,t=0;int s=0;int[] colorCount = new int[4];String[] card =new String[16];

        int pokenumber,flowercolor;
        String strtmp="";
        while(s!=4){

            t++;

            pokenumber=(int)(Math.random()*13);
            flowercolor = (int)(Math.random()*4);
            //生成随机数

            switch(pokenumber){
                case 0:
                    strtmp=(" King ");
                    break;
                case 1:
                    strtmp=(" Ace ");
                    break;
                case 2:
                    strtmp=(" 2 ");
                    break;
                case 3:
                    strtmp=(" 3 ");
                    break;
                case 4:
                    strtmp=(" 4 ");
                    break;
                case 5:
                    strtmp=(" 5 ");
                    break;
                case 6:
                    strtmp=(" 6 ");
                    break;
                case 7:
                    strtmp=(" 7 ");
                    break;
                case 8:
                    strtmp=(" 8 ");
                    break;
                case 9:
                    strtmp=(" 9 ");
                    break;
                case 10:
                    strtmp=(" 10 ");
                    break;
                case 11:
                    strtmp=(" Jack ");
                    break;
                case 12:
                    strtmp=(" Queen ");
                    break;
            }
            switch(flowercolor){
                case 0:
                    colorCount[0]+=1;
                    if(colorCount[0]==1)System.out.println(strtmp+"of"+" "+"Spades");
                    break;
                case 1:
                    colorCount[1]+=1;
                    if(colorCount[1]==1)System.out.println(strtmp+"of"+" "+"Hearts");
                    break;
                case 2:
                    colorCount[2]+=1;
                    if(colorCount[2]==1)System.out.println(strtmp+"of"+" "+"Clubs");
                    break;
                case 3:
                    colorCount[3]+=1;
                    if(colorCount[3]==1)System.out.println(strtmp+"of"+" "+"Diamonds");
                    break;
            }
            //根据随机数生成花色数组和数字数组

            s=0;//初始化s

            for(i=0;i<4;i++){
                s+=(colorCount[i]>0?1:0);
            }
            //判断是否四个花色都已经出现

        }

        System.out.print(" Numbers of Picks:"+t);
        //输出产生随机数的次数

    }
}
