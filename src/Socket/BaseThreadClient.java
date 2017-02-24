package Socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by Zhangww on 2016/12/29.
 */
public class BaseThreadClient extends Thread{

    private DataOutputStream dos;
    private BufferedReader br;

    public BaseThreadClient(DataOutputStream dos,BufferedReader br){
        this.dos=dos;
        this.br=br;
    }

    @Override
    public void run() {

        try {

            String info;
            info=br.readLine();
            dos.writeUTF(info);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        super.run();
    }
}
