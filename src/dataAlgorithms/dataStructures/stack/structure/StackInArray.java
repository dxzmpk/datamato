package dataAlgorithms.dataStructures.stack.structure;

public class StackInArray {

    private int stack[] = new int[100];
    private int top = 0;
    public boolean insert(int element){
        top ++;
        stack[top] = element;
        return true;
    }

    public boolean deleteTop(){
        if(top > 0){
            top --;
            return true;
        } else {
            return false;
        }
    }

    public int getTop(){
        return stack[top];
    }

    public static void main(String[] args){
        StackInArray stack = new StackInArray();
        String dump = "dump1";
        String j = "dump1";
        StackInArray stack1 = new StackInArray();
        System.out.println(dump.hashCode());
        System.out.println(j.hashCode());
        stack.insert(1);
        stack.insert(4);
        stack.deleteTop();
        int test = stack.getTop();
        System.out.println(test);
    }
}
