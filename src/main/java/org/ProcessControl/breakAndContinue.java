package org.ProcessControl;

import java.util.Arrays;

public class breakAndContinue {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
        example4();
    }
    public static void example1() {
        int sum = 0;
        for (int i=1; ; i++) {
            sum = sum + i;
            if (i == 100) {
                break;
            }
        }
        System.out.println(sum);
    }
    public static void example2() {
        for (int i=1; i<=10; i++) {
            System.out.println("i = " + i);
            for (int j=1; j<=10; j++) {
                System.out.println("j = " + j);
                if (j >= i) {
                    break;
                }
            }
            // break跳到这里
            System.out.println("breaked");
        }
    }
    public static void example3() {
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(Arrays.toString(ns));
    }
    public static void example4() {
        int[] ns = { 1, 4, 9, 16, 25 };
        // 倒序打印数组元素:
        for (int i = ns.length-1; i >=0; i--) {
            System.out.println(ns[i]);
        }
    }
}
