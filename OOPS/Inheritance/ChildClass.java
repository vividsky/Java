package OOPS.Inheritance;

public class ChildClass {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println(obj.a);

        ParentClass obj1 = new Pclass2();
//        a is in both classes but parent class a will be executed because of compiler
        System.out.println("parent reference parent variable "+obj1.a);
//        fun1 is in both classes but child class one will be preferred because of JVM
        obj1.fun1();
//        c is not in parentClass hence it shows error, we need to cast it into pClass2
        System.out.println("parent reference child variable "+((Pclass2)obj1).c);

        Pclass2 obj2 = new Pclass2();
        //        here a from reference class will be preferred i.e. Pclass2
        System.out.println("child reference child variable"+obj2.a);

//        This will never work, We can have child object type as parent type but not vice versa to avoid run-time error
        Pclass2 obj3 = (Pclass2) new ParentClass();

    }
}
