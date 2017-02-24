package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 取号机
 * Created by Zhangww on 2017/2/14.
 */
public class Lotto {

    private List<Command> list=new ArrayList<Command>();

    public void doCommand(){
        for(int i=0;i<list.size();i++){

            Command command=(Command) list.get(i);
            command.execute();
        }
    }

    public void addCommand(Command command){
        list.add(command);
    }

}
