package Multithreading;

/**
 * Created by Zhangww on 2017/1/3.
 */
public class Producer implements Runnable{

    private PublicBox publicBox;

    public Producer(PublicBox publicBox){
        this.publicBox=publicBox;
    }


    @Override
    public void run() {

        for (int i=0;i<10;i++){
            try {
                System.out.println("pro i: "+i);
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            publicBox.increase();
        }

    }
}
