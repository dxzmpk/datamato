package dataAlgorithms.dataStructures.queue.model;

public class QueueElement {

    private int field;

    private QueueElement next;

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public QueueElement getNext() {
        return next;
    }

    public void setNext(QueueElement next) {
        this.next = next;
    }
}
