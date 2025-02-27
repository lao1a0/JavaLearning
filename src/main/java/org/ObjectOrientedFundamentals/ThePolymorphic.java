package org.ObjectOrientedFundamentals;

public class ThePolymorphic {
    public static void example1() {
        class Person {
            public void run() {
                System.out.println("Person.run");
            }
        }
        class Student extends Person {
            @Override
            public void run() {
                System.out.println("Student.run");
            }
        }

        Person p = new Student();
        p.run(); // 应该打印Person.run还是Student.run?
    }

    public static void example2() {
        class Person {
            public void run() {
                System.out.println("Person.run");
            }
        }

        class Student extends Person {
            // 不是Override，因为参数不同:
            public void run(String s) {
                System.out.println("Student.run");
            }
            // 不是Override，因为返回值不同:
//            public int run() {
//                System.out.println("Student.run");
//                return 0;
//            }
        }
    }

    public static void example3() {
        class Person {
            String name;
            @Override
            public String toString() {
                return "Person:name=" + name;
            }

            // 比较是否相等:
            @Override
            public boolean equals(Object o) {
                // 当且仅当o为Person类型:
                if (o instanceof Person) {
                    Person p = (Person) o;
                    // 并且name字段相同时，返回true:
                    return this.name.equals(p.name);
                }
                return false;
            }

            // 计算hash:
            @Override
            public int hashCode() {
                return this.name.hashCode();
            }
        }
    }

    public static void example4() {
        class Person {
            protected String name;
            public String hello() {
                return "Hello, " + name;
            }
        }

        class Student extends Person {
            @Override
            public String hello() {
                // 调用父类的hello()方法:
                return super.hello() + "!";
            }
        }
    }
    public static void example5() {
        class Person {
            protected String name;
            public final String hello() {
                return "Hello, " + name;
            }
        }

//        class Student extends Person {
//            // compile error: 不允许覆写
//            @Override
//            public String hello() {
//
//            }
//        }
    }

    public static void example6() {
        final class Person {
            protected String name;
        }

        // compile error: 不允许继承自Person
//        class Student extends Person {
//        }
    }
    public static void main(String[] args) {
        example1();

        // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
        Income[] incomes = new Income[] {
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}
