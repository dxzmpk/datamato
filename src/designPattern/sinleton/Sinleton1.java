package designPattern.sinleton;

import java.io.IOException;
import java.util.Properties;

public class Sinleton1 {

    static final Sinleton1 INSTANCE;
    private String info;
    static {
        try {
            Properties pro = new Properties();
            pro.load(Sinleton1.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANCE = new Sinleton1(pro.getProperty("info"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Sinleton1(String info){
        this.info = info;
    }

    @Override
    public String toString() {
        return "Sinleton1{" +
                "info='" + info + '\'' +
                '}';
    }
}
