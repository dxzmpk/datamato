package inheritence;

import java.lang.reflect.Method;

public class Son extends OverridableMethods implements Foo{

    /**
     * 此方法依赖于可重写方法OverridableMethods.doSomething()
     * @return
     */
    @Override
    public int doSomething() {
        return super.doSomething();
    }

    public static void main(String[] args){
        Son mySon = new Son();
        Class c1 = mySon.getClass();
        Class[] interfaces = c1.getInterfaces();
        Method[] methods = c1.getDeclaredMethods();
        mySon.fool();
        for (Method method : methods
             ) {
            System.out.println(method.getName());
        }
    }
}
