package org.ArrayOperation;

public class TraversalArray {
    public static void main(String[] args) {
//        example1();
//        example2();
        example3();
        example4();
    }
    public static void example1() {
        int[] ns = { 1, 4, 9, 16, 25 };
        for(int i=0; i<ns.length; i++) {
            int n = ns[i];
            System.out.println(n);
        }
    }
    public static void example2() {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) {
            System.out.println(n);
        }
    }
    public static void example3() {
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        System.out.println(String.format("%x",ns)); // 类似 [I@7852e922
    }
    public static void example4() {
        int[] ns = { 1, 1, 2, 3, 5, 8 };
        for (int n : ns) {
            System.out.print(n + ", ");
        }
    }
}
