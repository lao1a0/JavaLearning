package JavaCoreClasses;

import java.math.BigInteger;

public class Big_Integer {
    public static void main(String[] args) {
//            example1();
            example2();
            example3();
    }
    public static void example1() {
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000

    }
    public static void example2() {
        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger sum = i1.add(i2); // 12345678902469135780
        System.out.println(sum);
    }
    public static void example3() {
        BigInteger i = new BigInteger("123456789000");
        System.out.println(i.longValue()); // 123456789000
//        System.out.println(i.multiply(i).longValueExact()); // java.lang.ArithmeticException: BigInteger out of long range

        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f); // Infinity
    }
}
