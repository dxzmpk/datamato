package designPattern.sinleton;

public class test {

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getField());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.getField());
    }
}
