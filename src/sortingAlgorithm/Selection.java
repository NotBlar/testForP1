package sortingAlgorithm;

/**
 * 选择排序
 * Created by Zhangww on 2016/10/26.
 */
public class Selection {
    public static void sort(Comparable[] a){
        int N=a.length;
        Example example=new Example();
        for(int i=0;i<N;i++){
            //最小元素的索引
            int min=i;
            for(int j=i+1;j<N;j++){
                //判断是否是最小元素
                if(example.less(a[j],a[min])){
                    min=j;
                }
            }
            //将最小元素和上个元素交换位置
            example.exch(a,i,min);
        }
    }
}
