package org.ProcessControl;

import java.util.Scanner;

public class IfConditionalJudgment {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }
    public static void example1() {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
    }
    public static void example2() {
//        String s1 = null;
//        if (s1.equals("hello")) {
//            System.out.println("hello");
//        }
        String s1 = null;
        if (s1 != null && s1.equals("hello")) {
            System.out.println("hello");
        }
        else {
            System.out.println("no hello");
        }
    }
    public static void example3() {
        /*
        请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。
        BMI = 体重(kg) / 身高(m)的平方
        BMI结果：
        过轻：低于18.5
        正常：18.5 ~ 25
        过重：25 ~ 28
        肥胖：28 ~ 32
        非常肥胖：高于32
        * */
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble(); // kg
        double height = scanner.nextDouble(); // m
        double input = weight / (height*height);
        System.out.printf("您的BMI为：%.2f\n",input);
        if(input<18.5) {
            System.out.println("过轻");
        }
        else if (input <25)
        {
            System.out.println("正常");
        }
        else if (input <28)
        {
            System.out.println("过重");
        }
        else if (input <32)
        {
            System.out.println("肥胖");
        }
        else
        {
            System.out.println("非常肥胖");
        }

    }
}
