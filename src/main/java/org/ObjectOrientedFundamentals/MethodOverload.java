package org.ObjectOrientedFundamentals;

public class MethodOverload {
    public static void example1(){
        class Hello {
            public void hello() {
                System.out.println("Hello, world!");
            }

            public void hello(String name) {
                System.out.println("Hello, " + name + "!");
            }

            public void hello(String name, int age) {
                if (age < 18) {
                    System.out.println("Hi, " + name + "!");
                } else {
                    System.out.println("Hello, " + name + "!");
                }
            }
        }

        String s = "Test string";
        int n1 = s.indexOf('t');
        int n2 = s.indexOf("st");
        int n3 = s.indexOf("st", 4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
    
    public static void example2(){

        class Person {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setName(String name, String name2 ) {
                this.name = name+" "+name2;
            }
        }
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
    public static void main(String[] args) {
//        example1();
        example2();
    }
}
