package org.ArrayOperation;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        example1();
        System.out.println("******************************");
        example2();
        System.out.println("******************************");
        example3();
        System.out.println("******************************");
        example4();

    }
    public static void example1() {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(ns.length); // 3
    }
    public static void example2() {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        int[] arr0 = ns[0];
        System.out.println(arr0.length); // 4
        int[][] ns2 = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 }
        };
        for (int[] arr : ns2) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(ns2));
        System.out.println(Arrays.deepToString(ns2));
    }
    public static void example3() {
        int[][][] ns = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11},
                        {12, 13}
                },
                {
                        {14, 15, 16},
                        {17, 18}
                }
        };
        System.out.println(Arrays.deepToString(ns));
    }
    public static void example4() {
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 }, // 学生甲的语数英成绩
                { 68, 72, 64 }, // 学生乙的语数英成绩
                { 95, 91, 89 }, // ...
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double sum = 0;
        for(int i=0; i<scores.length; i++) {
            int tmp=0;
            for(int j=0; j<scores[i].length; j++) {
                tmp+=scores[i][j];
            }
            sum+=tmp;
        }
        double average = 0;
        average = sum/(scores.length*scores[0].length);
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
