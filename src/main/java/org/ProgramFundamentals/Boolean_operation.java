package org.ProgramFundamentals;

public class Boolean_operation {

    public static void main(String[] args) {
        example1();
        example2();
        example3();
    }
    public static void example1(){
        boolean isGreater = 5 > 3; // true
        int age = 12;
        boolean isZero = age == 0; // false
        boolean isNonZero = !isZero; // true
        boolean isAdult = age >= 18; // false
        boolean isTeenager = age >6 && age <18; // true

        System.out.println("isGreater = " + isGreater);
        System.out.println("isNonZero = " + isNonZero);
        System.out.println("isZero = " + isZero);
        System.out.println("isAdult = "+ isAdult);
        System.out.println("isTeenager = " + isTeenager);
    }
    public static void example2(){
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0); // 此处 5 / 0 不会报错
        System.out.println(result);
    }
    public static void example3(){
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age >= 6 && age < 12 ? true : false;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
