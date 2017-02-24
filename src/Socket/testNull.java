package Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Zhangww on 2016/12/28.
 */
public class testNull {
    public static void main(String[] args) {
        try {
            //System.out.println(InetAddress.getByName("192.168.5.40"));
            System.out.println(InetAddress.getLocalHost());
            System.out.println(InetAddress.getByName("127.0.0.1"));
        } catch (UnknownHostException e) {
            System.out.println("获取失败！");
        }
    }
}
