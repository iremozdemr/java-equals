public class Equals4 {
    public static void main(String[] args) {
        Person a = new Person("bob", 20);
        Person b = new Person("bob", 20);

        Person c = null;
        Person d = null;

        System.out.println(a==b);
        //false
        System.out.println(a.equals(b));
        //false

        System.out.println(c==d);
        //true
        System.out.println(c.equals(d));
        //exception
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}