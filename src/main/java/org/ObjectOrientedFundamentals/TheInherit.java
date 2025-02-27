package org.ObjectOrientedFundamentals;

public class TheInherit {
    public static void example1(){
        class Person {
            private String name;
            private int age;

            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public int getAge() {
                return age;
            }
            public void setAge(int age) {
                this.age = age;
            }
        }

        class Student extends Person {
            // 不要重复name和age字段/方法,
            // 只需要定义新增score字段/方法:
            private int score;

            public int getScore() {
                return score;
            }
            public void setScore(int score) {
                this.score = score;
            }
        }
    }

    public static void example2(){
//        class Person {
//            private String name;
//            private int age;
//        }
        /**
         * protected关键字可以把字段和方法的访问权限控制在继承树内部
         * */
        class Person {
            protected String name;
            protected int age;
        }
        class Student extends Person {
            public String hello() {
                return "Hello, " + name; // 编译错误：无法访问name字段
            }
            public String hello2() {
                return "Hello, " + super.name;
            }
        }
    }
    public static void example3(){
        class Person {
            protected String name;
            protected int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        class Student extends Person {
            protected int score;

            public Student(String name, int age, int score) {
                super(name, age);
                this.score = score;
            }
        }
        Student s = new Student("Xiao Ming", 12, 89);

        Person p = s; // upcasting, ok
        Object o1 = p; // upcasting, ok
        Object o2 = s; // upcasting, ok

        Person p1 = new Student("Xiao Ming", 12, 89);; // upcasting, ok
        Person p2 = new Person("Xiao Ming", 12);
        Student s1 = (Student) p1; // ok
//        Student s2 = (Student) p2; // runtime error! ClassCastException!

        /**
         * instanceof实际上判断一个变量所指向的实例是否是指定类型，或者这个类型的子类。如果一个引用变量为null，那么对任何instanceof的判断都为false。
         * */
        Person p3 = new Person("Xiao Ming", 12);;
        System.out.println(p3 instanceof Person); // true
        System.out.println(p3 instanceof Student); // false

        Student s3 =  new Student("Xiao Ming", 12, 89);;
        System.out.println(s3 instanceof Person); // true
        System.out.println(s3 instanceof Student); // true

        Student n = null;
        System.out.println(n instanceof Student); // false
    }
    public static void example4(){
//        public sealed class Shape permits Rect, Circle, Triangle {
//
//        }

        class Book {
            protected String name;
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
        }

//        class Student extends Book {
//            protected int score;
//        }
        class Student extends Person {
            protected Book book;
            protected int score;
        }
    }
    public static void example5(){
        class Person {
            protected String name;
            protected int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public int getAge() { return age; }
            public void setAge(int age) { this.age = age; }
        }

        class Student extends Person {
            protected int score;

            public Student(String name, int age, int score) {
                super(name, age);
                this.score = score;
            }

            public int getScore() { return score; }
        }

        class PrimaryStudent extends Student {
            // TODO
            int grade;
            public PrimaryStudent(String name, int age, int score, int grade) {
                super(name, age, score);
                this.grade = grade;
            }
        }
        Person p = new Person("小明", 12);
        Student s = new Student("小红", 20, 99);
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        Student ps = new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());

    }
    public static void main(String[] args) {
        example3();
        example5();
    }
}
