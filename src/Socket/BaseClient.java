package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 基础的socket客户端
 * Created by Zhangww on 2016/12/28.
 */
public class BaseClient {


    public static void main(String[] args) {

        Socket socket=null;
        InputStream is=null;
        OutputStream os=null;

        try {

            //设置远程IP地址
            //InetAddress address=InetAddress.getByName("127.0.0.1");
            //设置交互的端口号
            socket=new Socket("127.0.0.1",4545);
            //获取Socket输出流
            os=socket.getOutputStream();
            //向服务端发送信息
            os.write("这里是客户端！".getBytes());
            //关闭输出流
            socket.shutdownOutput();

            //获取Socket输入流
            is=socket.getInputStream();
            byte[] buffer=new byte[1024];
            int len;
            String str="";
            while ((len=is.read(buffer))!=-1){
                str+=new String(buffer,0,len);
            }

            //输出服务端的回复信息
            System.out.println(str);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null!=socket){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.gc();
        }

    }

}
