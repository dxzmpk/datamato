package dataAlgorithms.dataStructures.queue.structure;

import dataAlgorithms.dataStructures.queue.model.QueueElement;

public class QueueByLinkedList implements queue {

    QueueElement tail = new QueueElement();

    QueueElement head = new QueueElement();

    public QueueByLinkedList(){
        tail.setField(666);
    }
    @Override
    public boolean enQueue(int newNum) {

        QueueElement newQueueElement = new QueueElement();
        newQueueElement.setField(newNum);
        if(head.getNext() == null){
            head.setNext(newQueueElement);
            tail.setNext(newQueueElement);
        }
        QueueElement oldQueueElement = tail.getNext();
        oldQueueElement.setNext(newQueueElement);
        tail.setNext(newQueueElement);
        return true;
    }

    @Override
    public int deQueue() {
        QueueElement resultElement = head.getNext();
        head.setNext(resultElement.getNext());
        return resultElement.getField();
    }

    public QueueElement getTail() {
        return tail;
    }

    public void setTail(QueueElement tail) {
        this.tail = tail;
    }

    public QueueElement getHead() {
        return head;
    }

    public void setHead(QueueElement head) {
        this.head = head;
    }
}
