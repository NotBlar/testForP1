package designpatterns.command;

/**
 * Created by Zhangww on 2017/2/14.
 */
public class CommonWindow implements Command {

    @Override
    public void execute() {
        System.out.println("普通窗口，办理普通存取款业务");
    }

}
