package p4LinkedList;

import java.util.Iterator;

/**
 * 先进先出队列
 * Created by Zhangww on 2016/10/21.
 */
public class Queue<Item> implements Iterable<Item> {

    private Node first;//最早添加的节点的链表
    private Node last;//最近添加的节点的链表
    private int N;//队列元素数量

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first==null;
    }
    public int size(){
        return N;
    }

    /**
     * 向表尾添加元素
     * @param item
     */
    public void enQueue(Item item){
        Node oldlast=last;
        last=new Node();
        last.item=item;
        last.next=null;
        if(isEmpty()) first=last;
        else oldlast.next=last;
        N++;
    }

    /**
     * 从表头删除元素
     * @return
     */
    public Item deQueue(){
        Item item=first.item;
        first=first.next;
        if(isEmpty()) last=null;
        N--;
        return item;
    }

    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{

        private Node current=first;

        /**
         * 是否存在下一个元素
         * @return
         */
        public boolean hasNext(){
            return current!=null;
        }

        /**
         * 删除一个元素
         */
        public void remove(){
            Item item=first.item;
            first=first.next;
            N--;
        }

        /**
         * 遍历元素
         * @return
         */
        public Item next(){
            Item item=current.item;
            current=current.next;
            return item;
        }
    }





}


