package org.ObjectOrientedFundamentals;

class Person {
    public String name;
    public int age;
}
class Person2 {
    private String name;
    private int age;
    private int birth;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2019); // 调用private方法
    }

    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}

class Person3 {
    private String name;

    public String getName() {
        return name; // 相当于this.name
    }
}
class Person4 {
    private String name;

    public void setName(String name) {
        this.name = name; // 前面的this不可少，少了就变成局部变量name了
    }
}

class Group {
    private String[] names;

    public void setNames(String... names) {
        this.names = names;
    }
}

class Group2 {
    private String[] names;

    public void setNames(String[] names) {
        this.names = names;
    }
}

class Person5 {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Person6 {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}

class Person7 {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Person8 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class TheMethod {
    public static void example1(){
        Person ming = new Person();
        ming.name = "Xiao Ming";
        ming.age = -99; // age设置为负数
        System.out.println(ming);

        Person2 ming2 = new Person2();
        ming2.setName("Xiao Ming"); // 对字段name赋值
        ming2.setAge(12); // 对字段age赋值
    }
    public static void example2(){
        Group g = new Group();
        g.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun"); // 传入3个String
        g.setNames("Xiao Ming", "Xiao Hong"); // 传入2个String
        g.setNames("Xiao Ming"); // 传入1个String
        g.setNames(); // 传入0个String
        System.out.println(g.getClass());

        Group2 g2 = new Group2();
        g2.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Jun"}); // 传入1个String[]
        g2.setNames(null);
        g.setNames(null);
    }
    public static void example3(){
        Person5 p = new Person5();
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值
        System.out.println(p.getAge()); // 15
        n = 20; // n的值改为20
        System.out.println(p.getAge()); // 15还是20?
    }
    public static void example4(){
        Person6 p = new Person6();
        String[] fullname = new String[] { "Homer", "Simpson" };
        p.setName(fullname); // 传入fullname数组
        System.out.println(p.getName()); // "Homer Simpson"
        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
        System.out.println(p.getName()); // "Homer Simpson"还是"Bart Simpson"?
        /***
         * 引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方（因为指向同一个对象嘛）。
         */

    }
    public static void example5(){
        Person7 p = new Person7();
        String bob = "Bob";
        p.setName(bob); // 传入bob变量
        System.out.println(p.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(p.getName()); // "Bob"还是"Alice"?
    }
    public static void example6(){
        Person8 ming = new Person8();
        ming.setName("小明");
        ming.setAge(12);
        System.out.println(ming.getAge());
    }
    public static void example7(){
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public Person(String name) {
                this(name, 18); // 调用另一个构造方法Person(String, int)
            }

            public Person() {
                this("Unnamed"); // 调用另一个构造方法Person(String)
            }
        }

    }
    public static void example8(){
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }
        // TODO: 给Person增加构造方法:
        Person ming = new Person("小明", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());

    }
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
//        example4();
//        example5();
//        example6();
        example8();
    }
}