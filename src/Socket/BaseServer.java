package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 基础的Socket服务端
 * Created by Zhangww on 2016/12/28.
 */
public class BaseServer {

    public static void main(String[] args) {

        ServerSocket serverSocket=null;
        Socket socket=null;
        InputStream is=null;
        OutputStream os=null;

        try {

            //设置监听的端口
            serverSocket=new ServerSocket(4545);
            socket=serverSocket.accept();


            //获取Socket输入流
            is=socket.getInputStream();
            byte[] buffer=new byte[1024];
            int len;
            String str="";
            while ((len=is.read(buffer))!=-1){
                str+=new String(buffer,0,len);
            }

            //获取客户端输入的信息
            System.out.println(str);

            //向客户端发送信息
            os=socket.getOutputStream();
            os.write("这里是服务端".getBytes());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.gc();
        }


    }
}
