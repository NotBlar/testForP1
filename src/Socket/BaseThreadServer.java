package Socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 服务端线程
 * Created by Zhangww on 2016/12/29.
 */
public class BaseThreadServer extends Thread{

    private DataInputStream dis;

    public BaseThreadServer(DataInputStream dis){
        this.dis=dis;
    }


    @Override
    public void run() {

        String info4Server;

        try {
            while (true){
                info4Server=dis.readUTF();
                System.out.println("【"+new SimpleDateFormat("HH:mm:ss").format(new Date())+"】客户端:"+info4Server);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

        super.run();
    }
}
