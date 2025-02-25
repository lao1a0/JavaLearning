package org.ProcessControl;

import java.util.Scanner;

public class inputAndOutput {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
//        example4();
        example5();
    }
    public static void example1(){
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
    }
    public static void example2(){
        double d = 12900000;
        System.out.println(d); // 1.29E7
    }
    public static void example3(){
        double d = 3.1415926;
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
    }
    public static void example4(){
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
    public static void example5(){
//        请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入上次考试成绩: ");
        float lastScore = scanner.nextFloat();
        System.out.println("请输入本次考试成绩");
        float thisScore = scanner.nextFloat();
        System.out.println(String.format("成绩提高了：%.2f%%", (thisScore-lastScore)/lastScore*100));
    }
}

