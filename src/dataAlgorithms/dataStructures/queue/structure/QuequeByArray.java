package dataAlgorithms.dataStructures.queue.structure;

public class QuequeByArray implements queue {

    private int head = 0, tail = 0;

    public int[] queueNum = new int[100];

    public QuequeByArray(int head) {
        this.head = head;
    }

    @Override
    public boolean enQueue(int newNum) {
        queueNum[tail] = newNum;
        tail ++;
        return true;
    }

    @Override
    public int deQueue() {
        int result = queueNum[head];
        head ++;
        return result;
    }


    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int[] getQueueNum() {
        return queueNum;
    }

    public void setQueueNum(int[] queueNum) {
        this.queueNum = queueNum;
    }
}
