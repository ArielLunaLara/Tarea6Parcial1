package oop.collections;
import oop.collections.LinkedList.*;

public class Main {
    public static void main(String args[]){
        LinkedList  linkedList = new LinkedList();

        linkedList.addAtTail("uno");
        linkedList.addAtTail("dos");
        linkedList.addAtTail("tres");
        linkedList.addAtFront("3");
        linkedList.addAtFront("2");
        linkedList.addAtTail("1");


        int indexIterator = 0;
        while (indexIterator < linkedList.size()){
            System.out.println(linkedList.getAt(indexIterator));
            indexIterator++;
        }
    }
}
