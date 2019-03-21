package dataAlgorithms.test.queue;
import dataAlgorithms.dataStructures.queue.structure.QuequeByArray;
import dataAlgorithms.dataStructures.queue.structure.QueueByLinkedList;
import dataAlgorithms.dataStructures.queue.structure.QueueSons;
import org.junit.Test;

public class QueueTest {
    @Test
    public void queueByArrayTest(){
        QuequeByArray queque = new QuequeByArray(1);
        queque.enQueue(10);
        queque.enQueue(43);
        queque.enQueue(4);
        queque.enQueue(23);
        int result = queque.deQueue();
        int result2 = queque.deQueue();
        System.out.println(result + "  "+result2);
        System.out.println(queque.getHead() + " " +queque.getTail());
    }

    @Test
    public void queueByLinkedListTest(){
        QueueByLinkedList queue = new QueueByLinkedList();
        queue.enQueue(2);
        queue.enQueue(5);
        queue.enQueue(7);
        int result1 = queue.deQueue();
        int result2 = queue.deQueue();
        System.out.println(queue.getTail().getField()+ "   "+ result2);
    }

    @Test
    public void initializerTest(){
        QueueSons queueSons = new QueueSons(1);
        System.out.println(queueSons.getMiddle() +  "    ");
    }

}
