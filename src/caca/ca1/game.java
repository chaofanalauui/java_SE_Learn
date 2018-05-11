package caca.ca1;
import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("猜猜");
        System.out.println("请出拳(1.剪刀，2.石头，3.布）（请选择序号）");
        while(true) {
            int ren = in.nextInt();
            int computer = (int) (Math.random() * 3) + 1;
            String kang = "布";
            String kang2 = "布";
            switch (ren) {
                case 1:
                    kang = "剪刀";
                    break;
                case 2:
                    kang = "石头";
                    break;
                case 3:
                    kang = "布";
                    break;
            }
            switch (computer) {
                case 1:
                    kang2 = "剪刀";
                    break;
                case 2:
                    kang2 = "石头";
                    break;
                case 3:
                    kang2 = "布";
                    break;
            }
            if (ren == computer) {
                System.out.println("平局了!    你出的是" + kang + "电脑出得是" + kang2);
            } else if (ren == 1 && computer == 2) {
                System.out.println("你输了#-_-    你出的是" + kang + "电脑出得是" + kang2);
            } else if (ren == 2 && computer == 3) {
                System.out.println("你输了#-_-    你出的是" + kang + "电脑出得是" + kang2);
            } else if (ren == 3 && computer == 1) {
                System.out.println("你输了#-_-    你出的是" + kang + "电脑出得是" + kang2);
            } else if (ren == 1 && computer == 3){
                System.out.println("你赢了#-_-    你出的是" + kang + "电脑出得是" + kang2);
            }else if (ren == 2 && computer == 1){
                System.out.println("你赢了#-_-    你出的是" + kang + "电脑出得是" + kang2);
            }else if (ren == 3 && computer == 2){
                System.out.println("你赢了#-_-    你出的是" + kang + "电脑出得是" + kang2);
            }
            else{
                System.out.println(" 输入错误！请输入1（剪刀），2（石头），3（布）");
            }



        }
    }
}
