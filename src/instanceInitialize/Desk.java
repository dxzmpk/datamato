package instanceInitialize;

public class Desk extends Furniture{
    private Integer capacity = 13;
    static {
        type = "桌子";
    }
    private static String type;
    public String getType() {
        System.out.println("桌子的种类方法");
        return null;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
