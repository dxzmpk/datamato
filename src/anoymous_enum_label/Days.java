package anoymous_enum_label;

public enum Days{
    FRIDAY,SATURDAY,SUNDAY;

    private Days()
    {
        System.out.println("Constructor called for : " +
                this.toString());
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
