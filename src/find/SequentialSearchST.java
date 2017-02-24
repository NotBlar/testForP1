package find;

/**
 * 顺序查找(基于无序链表)
 * Created by Zhangww on 2016/11/15.
 */
public class SequentialSearchST<Key,Value> {

    private Node first;

    private class Node{
        Key key;
        Value value;
        Node next;

        public Node(Key key,Value value,Node node){
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }

    /**
     * 根据给定的键，返回相关联的值
     * @param key
     * @return
     */
    public Value get(Key key){
        for(Node x=first;x!=null;x=x.next){
            if(key.equals(x.value)) return x.value;
        }
        return null;
    }

    /**
     * 根据给定的键找到则更新其值，否则新建节点
     * @param key
     * @param value
     */
    public void put(Key key,Value value){
        for(Node x=first;x!=null;x=x.next){
            if(key.equals(x.key)){
                x.value=value;
                return;
            }
        }
        first=new Node(key,value,first);
    }

}
