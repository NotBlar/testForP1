package sortingAlgorithm;

/**
 * 快速排序
 * Created by Zhangww on 2016/11/3.
 */
public class Quick {

    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    /**
     * 快速排序
     * @param a
     * @param lo
     * @param hi
     */
    private static void sort(Comparable[] a,int lo,int hi){
        if(hi<=lo) return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }


    /**
     * 排序切分
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    private static int partition(Comparable[] a,int lo,int hi){
        int i=lo,j=hi+1;
        Comparable v=a[lo];
        Example example=new Example();
        while (true){
            while(example.less(a[++i],v)) if(i==hi) break;
            while(example.less(v,a[--j])) if(j==lo) break;
            if(i>=j) break;
            example.exch(a,i,j);
        }
        example.exch(a,lo,j);
        return j;
    }
}
