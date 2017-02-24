package sortingAlgorithm;

/**
 * 插入排序
 * Created by Zhangww on 2016/10/26.
 */
public class Insertion {
    public static void sort(Comparable[] a){
        int N=a.length;
        Example example=new Example();
        for(int i=1;i<N;i++){
            for(int j=i;j>0 && example.less(a[j],a[j-1]);j--){
                example.exch(a,j,j-1);
            }
        }

    }
}
