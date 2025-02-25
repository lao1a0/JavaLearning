package org.ProgramFundamentals;

public class Characters_and_Strings {
    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
        example5();
    }
    public static void example1(){
        String s1 = "Hello";
        String s2 = "world";
        String s = s1 + " " + s2 + "!";
        System.out.println(s); // Hello world!
    }
    public static void example2(){
        int age = 25;
        String s = "age is " + age;
        System.out.println(s); // age is 25
    }
    public static void example3(){
        String s = "hello";
        System.out.println(s); // 显示 hello
        s = "world";
        System.out.println(s); // 显示 world
    }
    public static void example4(){
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t是"hello"还是"world"?
    }
    public static void example5() {
        // 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
        int a = 72;       // Unicode码对应的字符是 'H'
        int b = 105;      // Unicode码对应的字符是 'i'
        int c = 65281;    // Unicode码对应的字符是 '，'（全角逗号）

        // 将每个int值转换为对应的字符
        char charA = (char) a;
        char charB = (char) b;
        char charC = (char) c;

        // 拼接成字符串
        String s = "" + charA + charB + charC;

        // 输出结果
        System.out.println(s);
    }
}
