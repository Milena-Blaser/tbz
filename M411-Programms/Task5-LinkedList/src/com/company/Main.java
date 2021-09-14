package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add("Milena");
        linkedList.add("Blerinë");
        linkedList.add("Leandro");
        linkedList.add("Alisha");
        linkedList.add("Nuwera");
        linkedList.showElements(linkedList);
        linkedList.showElementsReversed(linkedList);
        linkedList.removeElement(linkedList, "Alisha");
        linkedList.showElements(linkedList);
        linkedList.addSpecificPosition("Diana", "Milena");
        linkedList.showElements(linkedList);
    }
}
