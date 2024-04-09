public class Equals1 {
    public static void main(String[] args) {
        String one = "hello world";
        String two = "hello world";

        Object o = one;
        Object t = two;

        if(one.equals(two)){
            System.out.println("they are the same");
        }
        if(o.equals(t)){
            System.out.println("they are the same");
        }
    }
}