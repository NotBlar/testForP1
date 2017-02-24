package Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SocketClient客户端，用于发起请求
 * Created by Zhangww on 2016/12/28.
 */
public class SocketClient {


    public static void main(String[] args) {
        /*Socket socket=null;

        OutputStream os=null;
        InputStream is=null;
        DataOutputStream dos=null;
        DataInputStream dis=null;*/


        try {

            //创建Socket客户端
            InetAddress address=InetAddress.getByName("192.168.5.40");
            Socket socket=new Socket(address,5555);

            //创建输入流
            InputStream is=socket.getInputStream();
            DataInputStream dis=new DataInputStream(is);

            //创建输出流
            OutputStream os=socket.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);

            //os.write("你好，程序员！".getBytes());
            //socket.shutdownOutput();

            //手动输入信息
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String info2Server;
            String info4Client;

            while (true){

                //读取手动输入信息
                info2Server=br.readLine();
                System.out.println("【"+new SimpleDateFormat("HH:mm:ss").format(new Date())+"】客户端:"+info2Server);

                //将手动输入信息发送给服务端
                dos.writeUTF(info2Server);

                //读取服务端返回的信息，该方法为阻塞方法
                info4Client=dis.readUTF();
                System.out.println("【"+new SimpleDateFormat("HH:mm:ss").format(new Date())+"】服务端:"+info4Client);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /*if(null!=os){
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
            }*/
        }
    }



}
