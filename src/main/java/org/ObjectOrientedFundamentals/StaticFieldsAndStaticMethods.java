package org.ObjectOrientedFundamentals;

public class StaticFieldsAndStaticMethods {
    public static void main(String[] args) {
        SPerson ming = new SPerson("Xiao Ming", 12);
        SPerson hong = new SPerson("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
        SPerson.number = 99;
        System.out.println(SPerson.number);

        SPerson.setNumber(999);
        System.out.println(SPerson.number);
    }
}
class SPerson {
    public String name;
    public int age;

    public static int number;

    public SPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setNumber(int value) {
        number = value;
    }
}

interface SSPerson {
    public static final int MALE = 1;
    public static final int FEMALE = 2;
}

interface STPerson {
    // 编译器会自动加上public static final:
    int MALE = 1;
    int FEMALE = 2;
}