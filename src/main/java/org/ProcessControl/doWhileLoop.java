package org.ProcessControl;

public class doWhileLoop {
    public static void main(String[] args) {
        example();
        example2();
    }
    public static void example() {
        int sum = 0;
        int n = 1;
        do {
            sum = sum + n;
            n ++;
        } while (n <= 100);
        System.out.println(sum);
    }
    public static void example2() {
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用do while计算M+...+N:
        do {
            sum = sum + m;
            m++;
        } while (m<=n);
        System.out.println(sum);
    }
}
