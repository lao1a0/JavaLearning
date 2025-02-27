package JavaCoreClasses;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringsAndEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        example1();
//        example2();
//        example3();
//        example4();
//        example5();
//        example6();
//        example7();
//        example8();
//        example9();
//        example10();
//        example11();
        example12();
    }

    public static void example1() {
        String s = "Hello";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
    }

    public static void example2() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public static void example3() {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    public static void example4() {
        Object[] t = {
                // 是否包含子串:
                "Hello".contains("ll"), // true
                "Hello".indexOf("l"), // 2
                "Hello".lastIndexOf("l"), // 3
                "Hello".startsWith("He"), // true
                "Hello".endsWith("lo"), // true
                "Hello".substring(2),// "llo"
                "Hello".substring(2, 4),//"ll"
                "  \tHello\r\n ".trim(), "\u3000Hello\u3000".strip(), // "Hello"
                " Hello ".stripLeading(), // "Hello "
                " Hello ".stripTrailing(), // " Hello"
        };
        for (Object s : t) {
            System.out.println(s);
        }
    }

    public static void example5() {
        String s = "hello";
        s = s.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        System.out.println(s);
        s = "hello";
        s = s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
        System.out.println(s);
        s = "A,,B;C ,D";
        s = s.replaceAll("[,;\\s]+", ","); // "A,B,C,D"
        System.out.println(s);
    }

    public static void example6() {
        String s = "A,B,C,D";
        String[] ss = s.split(","); // {"A", "B", "C", "D"}
        System.out.println(Arrays.toString(ss));
    }

    public static void example7() {
        String[] arr = {"A", "B", "C"};
        String s = String.join("***", arr); // "A***B***C"
        System.out.println(s);
    }

    public static void example8() {
        String s = "Hi %s, your score is %d!";
        System.out.printf((s) + "%n", "Alice", 80);
        System.out.printf("Hi %s, your score is %.2f!%n", "Bob", 59.5);
    }

    public static void example9() {
        String.valueOf(123); // "123"
        String.valueOf(45.67); // "45.67"
        String.valueOf(true); // "true"
        String.valueOf(new Object()); // 类似java.lang.Object@636be97c
//        要把字符串转换为其他类型，就需要根据情况。例如，把字符串转换为int类型：

        int n1 = Integer.parseInt("123"); // 123
        int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
//        把字符串转换为boolean类型：

        boolean b1 = Boolean.parseBoolean("true"); // true
        boolean b2 = Boolean.parseBoolean("FALSE"); // false
//        要特别注意，Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer：

        Integer.getInteger("java.version"); // 版本号，11

    }

    public static void example10() {
        char[] cs = "Hello".toCharArray(); // String -> char[]
        String s = new String(cs); // char[] -> String
//        如果修改了char[]数组，String并不会改变：

        // String <-> char[]
        cs[0] = 'X';
        System.out.println(cs);
        System.out.println(s);
    }

    public static void example11() {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }

    public static void example12() throws UnsupportedEncodingException {
        byte[] b1 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
        byte[] b2 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
        byte[] b3 = "Hello".getBytes("GBK"); // 按GBK编码转换
        byte[] b4 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换

        String s1 = new String(b3, "GBK"); // 按GBK转换
        String s2 = new String(b4, StandardCharsets.UTF_8); // 按UTF-8转换

    }
}
class Score {
    private int[] scores;
    public Score(int[] scores) {
//        this.scores = scores;
        this.scores = Arrays.copyOf(scores, scores.length);
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}