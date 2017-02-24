package p4LinkedList;

import java.util.Iterator;

/**
 * Created by Zhangww on 2016/10/25.
 */
public class Bag<Item> implements Iterable<Item> {

    private class Node{
        Item item;
        Node next;
    }

    public Node first;
    private int N;

    private boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    public void add(Item item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        N++;
    }

    public Iterator<Item> iterator(){
        return new IteratorList();
    }


    private class IteratorList implements Iterator<Item>{

        private Node current=first;

        @Override
        public void remove() {

        }

        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            Item item=current.item;
            current=current.next;
            return item;
        }
    }
}
