package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Zhangww on 2016/12/8.
 */
public class RandomTest {

    public static void main(String[] args) {


        List<String> str=new ArrayList<String>();
        str.add("1");
        str.add("2");

        for(String temp:str){
            if("2".equals(temp)){
                str.remove(temp);
            }
        }





        /*String str=Student.class.getResource("/").getPath();
        System.out.println(str);
*/
        /*for(int i=0;i<30;i++){
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(randomDelayTime(180,720)));
        }*/

    }

    public static void getResult(){
        String key = null;
        switch (key) {
            case "8000":
                System.out.print("8000");
                break;
            case "4000":
                System.out.print("8000");
                break;
            case "6001":
                System.out.print("8000");
                break;
            case "6002":
                System.out.print("8000");
                break;
            default:
                System.out.print("null");
                break;
        }
    }

    public static Date randomDelayTime(int min_delay_seconds, int max_delay_seconds){
        long min_delay_milliseconds = (long)min_delay_seconds*1000l;
        long max_delay_milliseconds = (long)max_delay_seconds*1000l;
        long ttime = System.currentTimeMillis()+(long)(Math.random()*(max_delay_milliseconds-min_delay_milliseconds+1l))+min_delay_milliseconds;
        return new Date(ttime);
    }


}
