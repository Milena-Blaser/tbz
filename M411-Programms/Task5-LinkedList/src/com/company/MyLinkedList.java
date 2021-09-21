package com.company;

/*************************************************************
 Program:
 Author:Milena
 Date:07-09-2021
 Project:
 Description:
 **************************************************************/

public class MyLinkedList {
    private Node head;
    private int listCount;

    public MyLinkedList() {
        head = new Node(null);
        listCount = 0;
    }

    public void add(Object value) {
        Node newElement = new Node(value);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newElement);
        listCount++;
    }

    public void addSpecificPosition(Object value, String position) {
        Node newElement = new Node(value);
        Node current = head;
        while (current.getItem() != position) {
            current = current.getNext();
        }

        newElement.setNext(current.getNext());
        current.setNext(newElement);
        current.setNext(newElement);
        listCount++;
    }

    public void showElements(MyLinkedList list) {
        Node current = head;
        for (int i = 0; i < list.getListCount(); i++) {
            System.out.println(current.getNext().getItem());
            current = current.getNext();
        }
    }

    public void showElementsReversed(MyLinkedList list) {

        int counter = list.getListCount();
        for (int i = 0; i < list.getListCount(); i++) {
            Node current = head;
            for (int j = 0; j < counter; j++) {
                current = current.getNext();
            }
            System.out.println(current.getItem());
            counter--;
        }

    }

    public void removeElement(MyLinkedList list, String search) {
        Node current = head.getNext();
        while (current.getNext() != null && current.getItem() != search) {
            if (current.getNext().getItem().equals(search)) {
                if (current.getNext().getNext() != (null)) {
                    Node next = current.getNext().getNext();
                    current.setNext(next);
                } else {
                    current.setNext(null);
                }
            }
            current = current.getNext();

        }
        listCount--;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getListCount() {
        return listCount;
    }

    public void setListCount(int listCount) {
        this.listCount = listCount;
    }

}
