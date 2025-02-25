package org.ArrayOperation;

public class TheConstructor {
    public static void main(String[] args) {
        example1();
    }
    public static void example1() {
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return this.name;
            }

            public int getAge() {
                return this.age;
            }
        }

        Person p = new Person("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }

    public static void example2() {

        class Person {
            private String name;
            private int age;

            public Person() {
            }
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return this.name;
            }

            public int getAge() {
                return this.age;
            }
        }
        Person p = new Person(); // 编译错误:找不到这个构造方法
    }
}

