package Task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList implements Iterable{
    protected Node head;

    public LinkedList(final Node head) {
        this.head = head;
    }

    public LinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public void setHead(final Node head) {
        this.head = head;
    }

    public void add(final int value) {
        final Node temporary = new Node();
        temporary.setValue(value);
        temporary.setNext(head);
        head = temporary;
    }

    public void delete() {
        if (head == null)
            throw new NoSuchElementException();
        head = head.getNext();
    }

    public int size() {
        int size = 0;

        if (head == null){
            return size;
        }

        Node headPointer = head;

        while (headPointer != null){
            ++size;
            headPointer = headPointer.getNext();
        }

        return size;
    }

    public int get() {
        Node headPointer = head;

        if (head == null){
            return 0;
        }

        while(headPointer.getNext() != null){
            headPointer=headPointer.getNext();
        }
        return headPointer.getValue();
    }

    public void clear() {
        head = null;
    }
    public void print() {
        Node headPointer = head;

        while (headPointer != null) {
            System.out.print(headPointer.getValue() + "\n");
            headPointer = headPointer.getNext();
        }
    }

    private class ListIterator implements Iterator {
        Node next = head;

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Integer next() {
           final Integer value = next.getValue();
           next = next.getNext();
           return value;
        }
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }
}
