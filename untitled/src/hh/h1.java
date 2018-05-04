package hh;

import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.print("请输入你的年龄");
        int age = scan.nextInt();
        System.out.println("你的姓名是；" + name);
        System.out.println("你的年龄是；" + age);

*/
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a1 = sca.nextInt();
        System.out.println("请输入运算符号：");
        String a2 = sca.next();
        System.out.println("请输入第二个数：");
        int a3 = sca.nextInt();
        int b1 = 0;


        if (a2.equals("+"))
        {
            b1 = a1 + a3;
            System.out.print("运算结果为:" + b1);}
         else if (a2.equals("-"))
         {
             b1 = a1-a3;
                System.out.print("运算结果为:" + b1);
        }
        else if (a2.equals("*"))
        {
            b1 = a1*a3;
            System.out.print("运算结果为:" + b1);
        }

        else if(a2.equals("/"))
        {
            b1 = a1/a3;
            System.out.print("运算结果为:" + b1);
        }


        }
    }

