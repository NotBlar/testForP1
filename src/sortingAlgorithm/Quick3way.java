package sortingAlgorithm;

/**
 * 三项切分的快速排序
 * Created by Zhangww on 2016/11/4.
 */
public class Quick3way {

    public static void sort(Comparable[] a,int lo,int hi){
        sort3(a,lo,hi);
    }



    private static void sort3(Comparable[] a,int lo,int hi){

        if(hi<=lo) return;
        int lt=lo,i=lo+1,gt=hi;
        Comparable v=a[lo];
        Example example=new Example();
        while(i<=gt){
            int cmp=a[i].compareTo(v);
            if(cmp<0) example.exch(a,lt++,i++);
            if(cmp>0) example.exch(a,i,gt--);
            else i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }
}
