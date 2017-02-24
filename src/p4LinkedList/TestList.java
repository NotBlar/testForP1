package p4LinkedList;

import java.util.Iterator;

/**
 * 测试链表
 * Created by Zhangww on 2016/10/21.
 */
public class TestList {
    public static void main(String[] args) {
        /*p4LinkedList.Queue<Integer> intNum=new p4LinkedList.Queue<Integer>();
        for(Integer i=0;i<10;i++){
            intNum.enQueue(i);
        }
        intNum.enQueue(858);

        Iterator<Integer> iterator= intNum.iterator();

        System.out.println(intNum.size());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        /*Stack<String> i=new Stack<>();
        String[] str=new String[]{"John","Bob","David","Catalina","Google"};
        for(String s:str){
            i.push(s);
        }
        i.pop();
        System.out.println("-------->This p4LinkedList.Stack's Size is:"+i.size());
        Iterator<String> sout= i.iterator();
        while (sout.hasNext()){
            System.out.println(sout.next());
        }*/

        Bag<String> ch=new Bag<>();
        String[] str=new String[]{"中","华","人","民","共","和","国"};
        for(String s:str){
            ch.add(s);
        }
        System.out.println(ch.size());
        Iterator<String> so=ch.iterator();
        while (so.hasNext()){
            System.out.println(ch.first);
            System.out.println(so.next());
        }

    }


}
