package designPattern.sinleton;

public class test1 {
    public static void main(String[] args){
        Sinleton1 sinleton = Sinleton1.INSTANCE;
        System.out.println(sinleton.toString());
    }
}
