package org.ProgramFundamentals;

public class Floating_point_operation {
    public static void main(String[] args) {
        lianXi();
        lianXi2();
        lianXi3();
        lianXi4();
    }
    public static void lianXi(){
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;

        System.out.println(x);
        System.out.println(y);

        // 比较x和y是否相等，先计算其差的绝对值:
        double r = Math.abs(x - y);
        // 再判断绝对值是否足够小:
        if (r < 0.00001) {
            // 可以认为相等
            System.out.println("相等");
        } else {
            // 不相等
            System.out.println("不相等");
        }
    }
    public static void lianXi2(){
        int n = 5;
        double d = 1.2 + 24.0 / n; // 6.0
        System.out.println(d);
    }
    public static void lianXi3(){
        double d1 = 0.0 / 0; // NaN
        double d2 = 1.0 / 0; // Infinity
        double d3 = -1.0 / 0; // -Infinity
        System.out.println(String.format("%.2f %.2f %.2f", d1,d2,d3));
    }
    public static void lianXi4(){
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        // TODO:
        double r1 = 0;
        double r2 = 0;
        r1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        r2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}