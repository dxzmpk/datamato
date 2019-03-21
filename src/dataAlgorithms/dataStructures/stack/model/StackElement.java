package dataAlgorithms.dataStructures.stack.model;

public class StackElement {

    private int field;

    private StackElement next;

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public StackElement getNext() {
        return next;
    }

    public void setNext(StackElement next) {
        this.next = next;
    }
}
