package find;

/**
 * Created by Zhangww on 2016/11/15.
 */
public class BST<Key extends Comparable<Key>,Value> {

    private Node root;

    private class Node{

        private Key key;
        private Value value;
        private Node right,left;
        private int N;

        public Node(Key key,Value value,int N){
            this.key=key;
            this.value=value;
            this.N=N;
        }

    }

    public int size(){
        return size(root);
    }

    private int size(Node x){
        if(x==null) return 0;
        else return x.N;
    }

//    public Value get(Key key){
//        for(Node x = root;x!=null;x=)
//    }
}
