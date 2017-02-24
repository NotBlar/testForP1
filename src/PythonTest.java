/**
 * Created by Zhangww on 2016/11/8.
 */
public class PythonTest {
    public static void main(String[] args) {
        num(6);
    }

    public static void num(int max){
        int n=0,a=1,b=1;

        while (n<max){
            System.out.println(b);
            b=a+b;
            n=n+1;
        }

    }
}
