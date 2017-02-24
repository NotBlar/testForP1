package designpatterns.command;

/**
 * Created by Zhangww on 2017/2/14.
 */
public class VipWindow implements Command{

    @Override
    public void execute() {
        System.out.println("VIP窗口，办理vip存款业务！");
    }
}
