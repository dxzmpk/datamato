package designPattern.sinleton;

/**
 * 单例模式 -- 懒加载
 */
public class Singleton {

    private int field = 100;
    private static Singleton singleton; //饿汉式加载，private static final Sinleton = new Singleton();

    public static Singleton getInstance(){
        if(singleton ==null ){
            singleton = new Singleton();
        }
        return singleton;
    }

    private Singleton(){
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }
}
