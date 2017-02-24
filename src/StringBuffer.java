import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Zhangww on 2016/9/12.
 */
public class StringBuffer {
    public static void main(String[] args) {
        /*String up="OPT1234";
        String s="OPT";
        if(!up.startsWith(s)){
            System.out.println("头错误");
        }
        Long up_id = Long.parseLong(up.substring(s.length()));
        if(up_id<=10000l){
            System.out.println(up_id);
            System.out.println("位数错误");
        }*/

        /*for (int i = 0; i < 100; i++) {

            System.out.println(getNum());
        }*/

        //prcticeStacek();
        //pricticeHashMap();
        //testTimeStamp();
        //testString(1);

        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,0-3);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));

       /*for(int i=0;i<8;i++){
           int j=random.nextInt(8)+1;

           randList.add(j);


       }*/
       /*List<Integer> list=new ArrayList<>();
       for(int i=0;i<10;i++){
           list.add(i);
       }
       list.remove(0);

        Iterator it=list.iterator();
       while (it.hasNext()){
           System.out.println(it.next());

       }
        System.out.println("--------"+list.get(0));*/

        //System.out.println(getStringBuilder());

        /*Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,(0-3));
        Date date=calendar.getTime();
        System.out.println(date);*/






       /*List<Integer> result=getRandom(list,8);
        for(int i:result){

            System.out.println(i);
        }*/




        /*int arr[]=new int[8];
        int i=0;
        while (randList.size()<8){
            int j=random.nextInt(8)+1;
            if(randList.add(j)){
                arr[i]=j;
                i++;
            }
        }*/

        /*Iterator<Integer> iterator=randList.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }*/



//        Integer time=Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
//        Date date=new Date(time);
//        System.out.println(date==new Date());

        //System.out.println(System.currentTimeMillis()%4l);
//        Calendar calendar=Calendar.getInstance();
//        calendar.set(Calendar.DAY_OF_MONTH,1);
//        int tempdate = Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(calendar.getTime()));
//        while(201611==(tempdate/100)){
//
//            System.out.println(tempdate);
//            calendar.add(Calendar.DAY_OF_MONTH,1);
//            tempdate = Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(calendar.getTime()));
//            System.out.println(tempdate);
//            System.out.println("----------------");
//        }


    }

    public static String getStringBuilder(){
        StringBuilder SQL=new StringBuilder("update");
        SQL.append(" user_info");
        SQL.append(" set ");
        SQL.append(" userid=#{alipayOrder.userid},");
        SQL.append(" out_trade_no=#{alipayOrder.out_trade_no},");
        SQL.append(" _status=#{alipayOrder._status},");
        SQL.append(" seller_email=#{alipayOrder.seller_email},");
        SQL.append(" buyer_email=#{alipayOrder.buyer_email},");
        SQL.append(" subject=#{alipayOrder.subject},");
        SQL.append(" total_fee=#{alipayOrder.total_fee},");
        SQL.append(" trade_no=#{alipayOrder.trade_no},");
        SQL.append(" gmt_create=#{alipayOrder.gmt_create},");
        SQL.append(" guide_userid=#{alipayOrder.guide_userid},");
        SQL.append(" updatetime=#{alipayOrder.updatetime},");
        SQL.deleteCharAt(SQL.length()-1);
        SQL.append(" where id=#{alipayOrder.id};");
        return SQL.toString();
    }



    public static void getRandom(int size){
        HashSet<Integer> randList=new HashSet<>();
        Random random=new Random();
        int arr[]=new int[size];
        int i=0;
        while (randList.size()<size){

            int j=random.nextInt(size);
            if(randList.add(j)){
                arr[i]=j;
                i++;
            }

        }
        for(int j=0;j<arr.length;j++){

            System.out.print(arr[j]+",");
        }
    }

    private static List<Integer> getRandom(List<Integer> source ,int size ){
        List<Integer> target = new ArrayList<>();
        if(source!=null&&!source.isEmpty()){
            while(!source.isEmpty()&&target.size()<size){
                int sourceSize = source.size();
                int random = (int)(Math.random()*sourceSize);
                target.add(source.get(random));
                source.remove(random);
            }
        }
        return target;
    }


    public static String getNum() {
        String str = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        //String uuid = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        String ranEight = String.format("%08d", new Random().nextInt(99999999));
        String result = str + ranEight;
        return result;
    }

    public static void prcticeStacek(){
        p4LinkedList.Stack stack=new p4LinkedList.Stack<>();
        for(int i=0;i<10;i++){
            stack.push(i);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }

    public static void pricticeHashMap(){
        Map<String,Integer> hashMap=new HashMap<>();
        for(int i=0;i<10;i++){
            hashMap.put("obj"+i,i);
        }

        for (Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            String key= entry.getKey();
            int value= entry.getValue();
            System.out.println(key+"------->"+value);
        }

    }

    public static void testTimeStamp(){
        String dynamicTime="2016-10-19 11:42:35";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime=sdf.format(new Date());
        try {
            long value=sdf.parse(nowTime).getTime()-sdf.parse(dynamicTime).getTime();
            System.out.println("相差分钟数"+value/(1000*60));
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void testString(int key){
        String str="一起去那啥!";
        switch (key){
            case 1:str="一起去吃饭去";
                break;
            case 2:str="一起去喝酒";
                break;
            default:str="一起回家去！";
        }
        System.out.println(str);
    }
}





