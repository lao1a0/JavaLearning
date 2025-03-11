package JavaCoreClasses;

import java.util.HexFormat;
import java.util.Random;

public class Commonly_Used_Utility_Classes {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
//        example4();
        example5();

    }

    public static void example1() {
//        求绝对值：
        Math.abs(-100); // 100
        Math.abs(-7.8); // 7.8
//        取最大或最小值：
        Math.max(100, 99); // 100
        Math.min(1.2, 2.3); // 1.2
//        计算xy次方：
        Math.pow(2, 10); // 2的10次方=1024
        Math.sqrt(2); // 1.414...
//        计算ex次方：
        Math.exp(2); // 7.389...
//        计算以e为底的对数：
        Math.log(4); // 1.386...
//        计算以10为底的对数：
        Math.log10(100); // 2
//        三角函数：
        Math.sin(3.14); // 0.00159...
        Math.cos(3.14); // -0.9999...
        Math.tan(3.14); // -0.0015...
        Math.asin(1.0); // 1.57079...
        Math.acos(1.0); // 0.0
//        Math还提供了几个数学常量：
        double pi = Math.PI; // 3.14159...
        double e = Math.E; // 2.7182818...
        System.out.println(pi);
        System.out.println(e);
        System.out.println(Math.sin(Math.PI / 6));   // sin(π/6) = 0.5
//        生成一个随机数x，x的范围是0 <= x < 1：
        Math.random(); // 0.53907... 每次都不一样

    }

    public static void example2() {
        // 如果我们要生成一个区间在[MIN, MAX)的随机数，可以借助Math.random()实现，计算如下：
        // 区间在[MIN, MAX)的随机数
        double x = Math.random(); // x的范围是[0,1)
        double min = 10;
        double max = 50;
        double y = x * (max - min) + min; // y的范围是[10,50)
        long n = (long) y; // n的范围是[10,50)的整数
        System.out.println(y);
        System.out.println(n);
    }

    public static void example3() {
        byte[] data = "Hello".getBytes();
        HexFormat hf = HexFormat.of();
        String hexData = hf.formatHex(data); // 48656c6c6f
        System.out.println(hexData);
    }
    public static void example4() {
        HexFormat hf = HexFormat.ofDelimiter(" ").withPrefix("0x").withUpperCase();
        // 0x48 0x65 0x6C 0x6C 0x6F
        System.out.println(hf.formatHex("Hello".getBytes()) );
        byte[] bs = HexFormat.of().parseHex("48656c6c6f");
        System.out.println(new String(bs));
    }
    public static void example5() {
        Random r = new Random();
        r.nextInt(); // 2071575453,每次都不一样
        r.nextInt(10); // 5,生成一个[0,10)之间的int
        r.nextLong(); // 8811649292570369305,每次都不一样
        r.nextFloat(); // 0.54335...生成一个[0,1)之间的float
        r.nextDouble(); // 0.3716...生成一个[0,1)之间的double

        Random rr = new Random(12345);
        for (int i = 0; i < 10; i++) {
            System.out.println(rr.nextInt(100));
        }
        // 51, 80, 41, 28, 55...
    }
}