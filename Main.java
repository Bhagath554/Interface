interface MyInterface

{
/*Compiler will treat them as :
 * public abstract void method1();
 * public abstract void method2();
 */



public void method1();

public void method2();
}
class Main implements MyInterface{
    public void method1()
    {
        System.out.println("Implementation of Method1");
    }
    public void method2()
    {
        System.out.println("Implementation of Method2");
    }
    public static void main(String arg[])
    {
        MyInterface obj = new Main();
        obj.method1();
        obj.method2();
    }
}
