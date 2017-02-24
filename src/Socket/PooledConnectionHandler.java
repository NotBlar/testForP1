package Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 多线程客户端
 * Created by Zhangww on 2016/12/29.
 */
public class PooledConnectionHandler implements Runnable{


    public PooledConnectionHandler(){

    }

    protected Socket socket;

    protected static List pool=new LinkedList();



    @Override
    public void run() {

        while (true){

            synchronized (pool){
                while (pool.isEmpty()){
                    try {
                        //无请求时等待
                        pool.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //从池中取出socket进行处理
                System.out.println("开始处理第"+pool.size()+"个请求");
                socket=(Socket) pool.remove(0);
            }
            handleConnection();
            System.out.println("请求处理完毕,剩余请求数量为:"+pool.size());
        }

    }

    /**
     * 向线程池添加请求
     * @param request2Handle
     */
    public static void processRequest(Socket request2Handle){
        synchronized (pool){
            //添加当前索引的Socket对象
            pool.add(pool.size(),request2Handle);
            System.out.println("添加请求中,当前池中请求数为:"+pool.size());
            //唤醒所有阻塞线程
            pool.notifyAll();
            System.out.println("请求添加完毕！");
        }
    }

    /**
     * 向服务端发送信息
     */
    public void handleConnection(){
        try {


            InetAddress address=InetAddress.getByName("192.168.5.40");
            Socket socket=new Socket(address,4545);

            //创建输入流
            InputStream is=socket.getInputStream();
            DataInputStream dis=new DataInputStream(is);

            //创建输出流
            OutputStream os=socket.getOutputStream();
            DataOutputStream dos=new DataOutputStream(os);

            //手动输入信息
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String info2Server;
            String info4Client;

            while (true) {

                //读取手动输入信息
                info2Server = br.readLine();
                System.out.println("【多线程客户端发起： " + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "】客户端:" + info2Server);

                //将手动输入信息发送给服务端
                dos.writeUTF(info2Server);

                //读取服务端返回的信息，该方法为阻塞方法
                info4Client = dis.readUTF();
                System.out.println("【多线程客户端发起： " + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "】服务端:" + info4Client);
            }
            //关闭相关的流
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
            }*/


        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void main(String[] args) {
        new PooledConnectionHandler().handleConnection();
    }
}
