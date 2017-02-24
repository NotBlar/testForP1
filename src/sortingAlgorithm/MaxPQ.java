package sortingAlgorithm;

/**
 * 基于优先队列的堆排序
 * Created by Zhangww on 2016/11/10.
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N=0;

    public MaxPQ(int maxN){
        pq=(Key[])new Comparable[maxN+1];
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    /**
     * 向队列插入一个值
     * @param v
     */
    public void insert(Key v){
        pq[++N] =v;//增加数组长度
        swim(N);
    }

    /**
     * 删除最大元素
     * @param v
     * @return
     */
    public Key delMax(Key v){
        //pq[1]=v;
        //sink(1);
        //return pq[--N];

        Key max=pq[1];
        exch(1,N--);
        pq[N+1]=null;
        sink(1);
        return max;
    }

    /**
     * 上浮
     * @param k
     */
    private void swim(int k){
        while (k>1&&less(k/2,k)){
            exch(k/2,k);
            k=k/2;
        }
    }

    /**
     * 下沉
     * @param k
     */
    private void sink(int k){
        while (2*k<=N){
            int j=2*k;
            if(j<N&&less(j,j+1)) j++;
            if(!less(k,j)) break;
            exch(k,j);
            k=j;
        }
    }

    private void exch(int i,int j){
        Key t=pq[i];pq[i]=pq[j];pq[j]=t;
    }

    private boolean less(int i,int j){
        return pq[i].compareTo(pq[j])<0;
    }
}
