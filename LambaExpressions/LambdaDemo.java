package LambaExpressions;

interface Cab {
    void bookCab(int num);
}
public class LambdaDemo {
    public static void main(String[] args) {
        Cab cab = num -> System.out.println("hello world");
        cab.bookCab(23);

        Cab cab2 = new Cab() {
            @Override
            public void bookCab(int num) {
                System.out.println("hello world 2");
            }
        };
    }
}
