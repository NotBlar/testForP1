package sortingAlgorithm;

import java.util.Random;

/**
 * Created by Zhangww on 2016/10/26.
 */
public class Test4Sorting {
    public static void main(String[] args) {
        //Comparable[] a=new Comparable[]{1.0,25.0,14.0,48.11,11.0,9.2,20.56,102.36,45.78,0.0,78.1};
        //Comparable[] a=new Comparable[]{1,20,101,34,54,67,88,102,11,78,11,36,42,101,100};
        Comparable[] a=new Comparable[10000000];
        for(int i=0;i<a.length;i++){
            a[i]= new Random().nextInt(999999);
            new MaxPQ<Integer>(10000000).insert(new Random().nextInt(999999));

        }

        /*Random random=new Random();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10000000;i++){
            list.add(random.nextInt(99999999));
        }*/
        //                             0  1  2   3  4  5  6  7  8  9 10 11 12  13
        //Comparable[] a=new Comparable[]{1,5,2,4,8,7};
        //Comparable[] a=new Comparable[]{1,3,2,4,5,20,11,55,102,77,88,101,0,0};
        System.out.println("Algorithm is read to start！！！");
        long startTime=System.currentTimeMillis();
        //Selection.sort(a);
        //Insertion.sort(a);//
        //Shell.sort(a);//18s

        //Merge.sort(a);//4s
        //Collections.sort(list);//6s
        //Quick.sort(a);//3s
        //Example.show(a);
        //Quick3way.sort(a,0,a.length);

        long endTime=System.currentTimeMillis();
        System.out.println("算法消耗时间为"+(endTime-startTime)/1000+"秒");

        //System.out.println(Example.isSorted(a));
        //System.out.println("--------------------");
        //Example.show(a);
    }
}
