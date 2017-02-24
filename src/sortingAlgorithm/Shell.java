package sortingAlgorithm;

/**
 * 希尔排序
 * Created by Zhangww on 2016/10/26.
 */
public class Shell {
    public static void sort(Comparable[] a){
        int N=a.length;
        int h=1;
        Example example=new Example();
        while (h<N/3) h=3*h+1;
        while (h>=1){
            //System.out.println("h:"+h);
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&example.less(a[j],a[j-h]);j-=h){
                    //System.out.println("j="+j+";"+(j>h)+"&&"+example.less(a[j],a[j-h])+",j-h="+(j-h));
                    //System.out.println(a[j]+"--"+a[j-h]);
                    //example.show(a);
                    example.exch(a,j,j-h);
                }
            }
            h=h/3;
        }
    }
}
