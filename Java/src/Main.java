/**
 * @author CSY
 * @version 0.0.0
 */

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

@SuppressWarnings("unused")
abstract class Animal {
    public static final String type = "java.Animal";

    /**
     * 返回当前类的type静态属性值
     * @return String 类型
     */
    public static String showType() {
        return type;
    }

    /**
     * 打印任意类型
     * @param v T 类型
     * @param <T> 任意类型
     */
    public static <T extends Comparable<T>> void print(T v) {
        System.out.println(v);
    }
}

@Deprecated
interface Live {}

@SuppressWarnings("unused")
class Person extends Animal implements Serializable {
    @java.io.Serial
    private static final long serialVersionUID = -239977016058713300L;

    public static final String type = "Human";

    enum Sex {
        Male,
        Female,
        Unknown,
    }

    private String name;
    private Sex sex;
    private int age;

    public Person() {
        setName("Unknown");
        setSex(Sex.Unknown);
        setAge(0);
    }

    public Person(String name, Sex sex, int age) {
        setName(name);
        setSex(sex);
        setAge(age);
    }

    public static String showType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null)
            this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        if(sex == Sex.Male || sex == Sex.Female)
            this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "java.Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person person = new Person();
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        return getAge() == person.getAge() && getName().equals(person.getName()) && sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), sex, getAge());
    }
}

@SuppressWarnings("unused")
final class Son extends Person {
    public Son() {
    }

    public Son(String name, Sex sex, int age) {
        super(name, sex, age);
    }
}

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] a = new int[10];

        Person p = new Person() {
            @Override
            public String toString() {
                return "In main: " + super.toString();
            }
        };
        System.out.println(p);
        System.out.println(Person.showType());

        Son s = new Son();
        System.out.println(s);

        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        input.close();
        System.out.println(v);
    }
}