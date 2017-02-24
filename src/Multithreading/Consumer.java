package Multithreading;

/**
 * 消费者
 * Created by Zhangww on 2017/1/3.
 */
public class Consumer implements Runnable{

    private PublicBox publicBox;

    public Consumer(PublicBox publicBox){
        this.publicBox=publicBox;
    }

    @Override
    public void run() {

        for (int i=0;i<10;i++){
            try {
                System.out.println("Con i:"+i);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publicBox.decreace();
        }
    }
}
