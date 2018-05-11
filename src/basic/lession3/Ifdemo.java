package basic.lession3;

public class Ifdemo {
    public static void main(String[] args) {
        int a = 0;
        a++;
        ++a;
        System.out.println(a++);//先输出a，在赋值
        System.out.println(++a);//先赋值，在输出
        int b = 0;
        b += 1;
        System.out.println(b );
        String str1 = "hellow ";
        String str2 = "world";
        String str3 = str1+str2;
        System.out.println(str3);
        String str4 = true ? "我为真":"我为假";
        String str5 = true ? "我为假":"我为真";
        System.out.println(str4);
    }
}
