package sortingAlgorithm;

/**
 * 排序算法模板
 * Created by Zhangww on 2016/10/26.
 */
public class Example {

    public static void sort(Comparable[] a){
        //
    }

    /**
     * v<w
     * @param v
     * @param w
     * @return
     */
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }


    /**
     * 交换位置
     */
    public static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    public static void show(Comparable[] a){
        for (int i=0;i<a.length;i++){
            if(i==a.length-1){
                System.out.println(a[i]);
            }else {
                System.out.print(a[i]+"-->");
            }
        }
    }

    /**
     * 测试数组元素是否有序
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a){
        for(int i=1;i<a.length;i++)
            if(less(a[i],a[i-1])) return false;
        return true;
    }



}
