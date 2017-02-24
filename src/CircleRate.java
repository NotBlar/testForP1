import java.util.Scanner;

/**
 * Created by Zhangww on 2017/1/3.
 */
public class CircleRate {

    public static void main(String[] args){
        int n;
        double PI;
        System.out.println("蒙特卡洛概率计算圆周率：");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入点的数量：");
        n=input.nextInt();
        PI=MontePI(n);
        System.out.println("圆周率："+PI);
    }



    public static double MontePI(int n){
        double PI;
        double x,y;
        int i,sum;
        sum=0;
        for(i=1;i<n;i++){
            x=Math.random();
            y=Math.random();
            if((x*x+y*y)<1){
                sum++;
            }
        }
        PI=4.0*sum/n;
        return PI;
    }
}
