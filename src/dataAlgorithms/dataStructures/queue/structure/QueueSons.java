package dataAlgorithms.dataStructures.queue.structure;

import dataAlgorithms.dataStructures.queue.structure.QuequeByArray;

public class QueueSons extends QuequeByArray {
    private int middle = getFromStart();
    private int start = 10;
//    {
//        middle = 6;
//    }

    public int getFromStart(){
        return getStart();
    }

    public QueueSons(int others){
        this(others, 2);
    }

    public QueueSons(int a, int b){
        super(1);
    }

    public void testPrivateInfo(){
        setHead(7);
    }

    public int getMiddle() {
        return middle;
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
}
