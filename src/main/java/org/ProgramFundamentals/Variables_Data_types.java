package org.ProgramFundamentals;

public class Variables_Data_types {
    public static void main(String[] args) {
//        types_int();
//        types_boolean();
//        types_float();
//        types_char();   // 字符类型
//        types_static();
        var_keyword();
    }
    protected static void var_keyword(){
        StringBuilder sb = new StringBuilder();
        var sb2 = new StringBuilder();
        sb2.append("abc!!");
        System.out.println(sb2.toString());
    }
    protected static void types_static(){
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
//        PI = 300; // compile error!
        System.out.println(area);
    }
    protected static void types_char(){
        // 字符类型
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);
    }
    protected static void types_float(){
        float f1 = 3.14f;
        System.out.println(f1);
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        System.out.println(f2);
//        float f3 = 1.0; // 错误：不带f结尾的是double类型，不能赋值给float

        double d = 1.79e308;
        System.out.println(d);
        double d2 = -1.79e308;
        System.out.println(d2);
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println(d3);
    }
    protected static void types_boolean(){
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        System.out.println(isGreater);
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
        System.out.println(isAdult);
    }
    protected static void types_int(){
            int i = 2147483647;
            System.out.println(i);
            int i2 = -2147483648;
            System.out.println(i2);
            int i3 = 2_000_000_000; // 加下划线更容易识别
            System.out.println(i3);
            int i4 = 0xff0000; // 十六进制表示的16711680
            System.out.println(i4);
            int i5 = 0b1000000000; // 二进制表示的512
            System.out.println(i5);

            long n1 = 9000000000000000000L; // long型的结尾需要加L
            System.out.println(n1);
            long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
            System.out.println(n2);
//        int i6 = 900L; // 错误：不能把long型赋值给int
    }
}
