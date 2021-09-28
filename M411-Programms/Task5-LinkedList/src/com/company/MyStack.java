package com.company;
/*************************************************************
        Program:
        Author:Milena
        Date:21.09.2021
        Project:
        Description:
        **************************************************************/

public class MyStack {
    private Node first;
    private int listCount;

    public MyStack(){
        listCount = 0;
    }

    /**
     * Adds element to the top of the list
     * @param value
     */
    public void push(Object value){
        Node current = first;
        first = new Node(value);
        first.setNext(current);
        listCount++;
    }
    /**
     * Removes element to the top of the list
     */
    public Object pop(){
        Object value = first.getItem();
        first = first.getNext();
        listCount--;
        return value;
    }
    @Override
    public String toString() {
        Node current = ;
        String output = "";
        while (current != null) {
            output = "Node{" +
                    "item: " + current.getItem() +
                    "next: " + current.getNext() +
                    "}";
            current = current.getNext();
        }
        return output;
    }

}
