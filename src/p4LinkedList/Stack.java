package p4LinkedList;

import java.util.Iterator;

/**
 * Created by Zhangww on 2016/10/25.
 */
public class Stack<Item> implements Iterable<Item> {

    private Node first;//栈顶最近添加的元素
    private int N;

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    private class Node{
        Item item;
        Node next;
    }

    /**
     * 压栈
     * @param item
     */
    public void push(Item item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        N++;
    }

    /**
     * 出栈
     * @return
     */
    public Item pop(){
        Item item=first.item;
        first=first.next;
        N--;
        return item;
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
