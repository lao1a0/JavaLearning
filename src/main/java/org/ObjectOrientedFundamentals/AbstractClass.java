package org.ObjectOrientedFundamentals;

abstract class person {
    public abstract void run();
}

public class AbstractClass {


    static class Student extends person {
        @Override
        public void run() {
            System.out.println("Student.run");
        }
    }

    static class Teacher extends person {
        @Override
        public void run() {

        }
    }
    public void runTwice(person p) {
        p.run(); // Person没有run()方法，会导致编译错误
        p.run();
    }
    public static void example() {
        person p = new Student();
        p.run();

        person s = new Student();
        person t = new Teacher();
        // 不关心Person变量的具体子类型:
        s.run();
        t.run();
        // 同样不关心新的子类是如何实现run()方法的：
        person e = new Employee();
        e.run();
    }

    public static void main(String[] args) {
        example();
    }

    private static class Employee extends person {
        public void run() {
            System.out.println("Employee");
        }
    }
}


