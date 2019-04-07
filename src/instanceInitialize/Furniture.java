package instanceInitialize;

public class Furniture {

    private Integer size = 5;

    static{
        type = "家具";
    }


    private static String type = "原始家具";


    public Furniture(){
        getType();
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
