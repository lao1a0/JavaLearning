package org.ProcessControl;

public class forLoop {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
        example4();
    }
    public static void example1() {
        int sum = 0;
        for (int i=1; i<=100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void example2() {
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int i=0; i<ns.length; i++) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println("sum = " + sum);
    }
    public static void example3() {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) {
            System.out.println(n);
        }
    }
    public static void example4() {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=ns.length-1; i>=0; i--) {
            System.out.println(ns[i]);
        }
    }
}
