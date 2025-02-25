package org.ProcessControl;

public class whileLoop {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }
    public static void example1() {
        int sum = 0; // 累加的和，初始化为0
        int n = 1;
        while (n <= 100) { // 循环条件是n <= 100
            sum = sum + n; // 把n累加到sum中
            n ++; // n自身加1
        }
        System.out.println(sum); // 5050
    }
    public static void example2() {
        int sum = 0;
        int n = 0;
        while (n <= 100) {
            n ++;
            sum = sum + n;
        }
        System.out.println(sum);
    }
    public static void example3() {
        int sum = 0;
        int n = 1;
        while (n > 0) {
            sum = sum + n;
            n ++;
        }
        System.out.println(n); // -2147483648
        System.out.println(sum);
    }
    public static void example4() {
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用while计算M+...+N:
        while (m<=n) {
            sum = sum + m;
            m ++;
        }
        System.out.println(sum);
    }
}
