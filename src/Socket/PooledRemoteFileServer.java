package Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 多线程服务端
 * Created by Zhangww on 2016/12/29.
 */
public class PooledRemoteFileServer {

    protected int maxConnections;
    protected int listenPort;

    protected ServerSocket serverSocket;

    public PooledRemoteFileServer(int maxConnections, int listenPort) {
        this.maxConnections = maxConnections;
        this.listenPort = listenPort;
    }

    /**
     * 初始化线程池
     */
    public void setUpHandlers(){
        System.out.println("初始化线程池开始.");
        for (int i=0;i<maxConnections;i++){
            PooledConnectionHandler currentHandler=new PooledConnectionHandler();
            new Thread(currentHandler,"Handler"+i).start();
            System.out.println("Handler"+i+"启动");
        }
        System.out.println("初始化线程池结束.");
    }

    /**
     * 接收客户端请求
     */
    public void acceptConnections(){
        try {

            //设置要监听的端口，以及连接请求队列的长度
            ServerSocket serverSocket=new ServerSocket(listenPort,40);
            Socket incommingConnection=null;

            while (true){
                incommingConnection=serverSocket.accept();

                //创建Socket输入流
                InputStream is=incommingConnection.getInputStream();
                DataInputStream dis=new DataInputStream(is);

                //创建Socket输出流
                OutputStream os=incommingConnection.getOutputStream();
                DataOutputStream dos=new DataOutputStream(os);

                //手动输入信息
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                String info2Client;
                String info4Server;

                //获取客户端发送的信息
                info4Server=dis.readUTF();
                System.out.println("【多线程服务端发起： "+new SimpleDateFormat("HH:mm:ss").format(new Date())+"】客户端:"+info4Server);
                info2Client=br.readLine();

                //向客户端发送手动写入的信息
                dos.writeUTF(info2Client);
                System.out.println("【多线程服务端发起： "+new SimpleDateFormat("HH:mm:ss").format(new Date())+"】服务端:"+info2Client);

                handleConnection(incommingConnection);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 线程池处理Socket请求
      * @param connection2Handle
     */
    protected void handleConnection(Socket connection2Handle){
        PooledConnectionHandler.processRequest(connection2Handle);
    }


    public static void main(String[] args) {

        //设置最大线程数，以及监听端口
        PooledRemoteFileServer server=new PooledRemoteFileServer(10,4545);

        //初始化线程池
        server.setUpHandlers();

        //接收客户端请求
        server.acceptConnections();
    }

}
