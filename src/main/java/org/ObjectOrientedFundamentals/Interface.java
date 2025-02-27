package org.ObjectOrientedFundamentals;

public class Interface {
    abstract class Person {
        public abstract void run();
        public abstract String getName();
    }

//    interface Person2 {
//        void run();
//        String getName();
//    }

//    class Student implements Person2 {
//        private String name;
//
//        public Student(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public void run() {
//            System.out.println(this.name + " run");
//        }
//
//        @Override
//        public String getName() {
//            return this.name;
//        }
//    }

//    interface Hello {
//        void hello();
//    }
//
//    interface Person3 extends Hello {
//        void run();
//        String getName();
//    }

//    interface Person {
//        String getName();
//        default void run() {
//            System.out.println(getName() + " run");
//        }
//    }

//    class Student implements Person {
//        private String name;
//
//        public Student(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return this.name;
//        }
//    }
    interface Person55 {
        String getName();
        default void run() {
            System.out.println(getName() + " run");
        }
    }

    static class Student55 implements Person55 {
        private String name;

        public Student55(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
    public static void  main(String[] args) {
        Interface obj = new Interface() {};

        Person55 p = new Student55("Xiao Ming");
        p.run();
    }
}

