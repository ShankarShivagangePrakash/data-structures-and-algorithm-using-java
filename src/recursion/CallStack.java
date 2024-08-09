package recursion;

public class CallStack {

    public static void method3(){
        System.out.println("Three");
    }

    public static void method2(){
        method3();
        System.out.println("Two");
    }

    public static void method1(){
        method2();
        System.out.println("One");
    }

    public static void main(String[] args) {
        method1();
    }
}
