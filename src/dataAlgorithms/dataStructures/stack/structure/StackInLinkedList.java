package dataAlgorithms.dataStructures.stack.structure;

import dataAlgorithms.dataStructures.stack.model.StackElement;

public class StackInLinkedList {

    private StackElement top = new StackElement();

    public boolean push(int newNum){
        StackElement newStackElement = new StackElement();
        newStackElement.setField(newNum);
        StackElement oldStackElement = top.getNext();
        newStackElement.setNext(oldStackElement);
        top.setNext(newStackElement);
        return true;
    }

    public Integer pop(){
        if(top.getNext() != null){
            StackElement popedStackElement = top.getNext();
            top.setNext(popedStackElement.getNext());
            return popedStackElement.getField();
        } else {
            return null;
        }
    }

    public static void main(String[] args){
        StackInLinkedList stack = new StackInLinkedList();
        stack.push(1);
        stack.push(2);
        int num1 = stack.pop();
        int num2 = stack.pop();
        System.out.println(num1 + "   "+ num2);
    }

}
