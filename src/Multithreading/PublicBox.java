package Multithreading;

/**
 * Created by Zhangww on 2017/1/3.
 */
public class PublicBox {

    public static void main(String[] args) {

        PublicBox publicBox=new PublicBox();

    }




    private int apple=0;

    /**
     * 生产
     */
    public synchronized void increase(){

        while (6==apple){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        apple++;
        System.out.println("生产第"+apple+"个产品");
        notify();
    }


    /**
     * 消费
     */
    public synchronized void decreace(){

        while (0==apple){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        apple--;
        System.out.println("消费第"+apple+"个产品");
        notify();
    }

}
