package OOPS.Inheritance;

public class Pclass2 extends ParentClass {
    int a = 30;
    int c = 40;

//    Here fun1() function is overridden function of parent class, to make it clear we add annotation @Override
    @Override
    public void fun1() {
        System.out.println("from pclass2 fun1");
    }

    public void Fun1() {
        System.out.println("Different fun1 function");
    }
//    Here fun1() is different from Fun1() ans fun1() is overridden

}
