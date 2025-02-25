package org.ProgramFundamentals;

/**
 * https://liaoxuefeng.com/books/java/quick-start/basic/integer/index.html
 */
public class Integer_Arithmetic {
    public static void main(String[] args) {
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);

        int x = 12345 / 67; // 184
        System.out.println(String.format("两个整数相除只能得到结果的整数部分: %d ",x));
        int y = 12345 % 67; // 12345÷67的余数是17
        System.out.println(y);

//        yiChu();
//        ziZengziJian();
//        yiWei();
//        yiWei2();
//        yiWei3();
//        weiYunSuan();
//        qiangZhi();
        lianXi();

    }
    public static void lianXi(){
        int n = 100;
        // TODO: sum = 1 + 2 + ... + n
        int sum = (1+n)*n/2;
        System.out.println(sum);
//        System.out.println(sum == 5050 ? "测试通过" : "测试失败");
    }
    public static void qiangZhi(){
        short s = 1234;
        int i = 123456;
        int x = s + i; // s自动转型为int
//        short y = s + i; // 编译错误!
        int ii = 12345;
        short ss = (short) ii; // 12345

        int i1 = 1234567;
        short s1 = (short) i1; // -10617
        System.out.println(s1);
        int i2 = 12345678;
        short s2 = (short) i2; // 24910
        System.out.println(s2);
    }
    public static void weiYunSuan(){
        int n;
        n = 0 & 0; // 0
        n = 0 & 1; // 0
        n = 1 & 0; // 0
        n = 1 & 1; // 1
        System.out.println(n);

        n = 0 | 0; // 0
        n = 0 | 1; // 1
        n = 1 | 0; // 1
        n = 1 | 1; // 1

        int i = 167776589; // 00001010 00000000 00010001 01001101
        int j = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println(i & j); // 167776512
    }
    public static void yiWei3(){
        /*
        还有一种无符号的右移运算，使用>>>
        它的特点是不管符号位，右移后高位总是补0
        因此，对一个负数进行>>>右移，它会变成正数，原因是最高位的1变成了0：
        * */
        int n = -536870912;
        int a = n >>> 1;  // 01110000 00000000 00000000 00000000 = 1879048192
        int b = n >>> 2;  // 00111000 00000000 00000000 00000000 = 939524096
        int c = n >>> 29; // 00000000 00000000 00000000 00000111 = 7
        int d = n >>> 31; // 00000000 00000000 00000000 00000001 = 1
        System.out.println(String.format("a = %d, b = %d, c = %d, d = %d", a, b, c, d));
    }
    public static void yiWei2(){
        int n = -536870912;
        int a = n >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
        int b = n >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
        int c = n >> 28; // 11111111 11111111 11111111 11111110 = -2
        int d = n >> 29; // 11111111 11111111 11111111 11111111 = -1
        System.out.println(String.format("a = %d, b = %d, c = %d, d = %d", a, b, c, d));
    }
    public static void yiWei(){
        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
        int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
        int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
        int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912
        System.out.println(String.format("a = %d, b = %d, c = %d, d = %d", a, b, c, d));
    }
    public static void ziZengziJian(){
        int n = 3300;
        n++; // 3301, 相当于 n = n + 1;
        System.out.println(n);
        n--; // 3300, 相当于 n = n - 1;
        System.out.println(n);
        int y = 100 + (++n); // 不要这么写
        System.out.println(y);
    }
    public static void yiChu(){
//        int x = 2147483640;
//        int y = 15;
//        int sum = x + y;
//        System.out.println(sum); // -2147483641

        long x = 2147483640;
        long y = 15;
        long sum = x + y;
        System.out.println(sum); // 2147483655
    }
}
