package org.ProgramFundamentals;

public class array {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }
    public static void example1(){
        // 5位同学的成绩:
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        System.out.println(ns.length); // 5
        int n = 4;
        System.out.println(ns[n]); // 索引n不能超出范围
    }
    public static void example2(){
        int[] ns = new int[] { 68, 79, 91, 85, 62 };
        int[] ns2 = { 68, 79, 91, 85, 62 };
        System.out.println(ns.length); // 编译器自动推算数组大小为5
        System.out.println(ns2.length);
    }
    public static void example3(){
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
    }
}
