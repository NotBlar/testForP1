package designpatterns.command;

/**
 * Created by Zhangww on 2017/2/14.
 */
public class CommandTest {

    public static void main(String[] args) {
        Command commonWindow=new CommonWindow();
        Command vipWindow=new VipWindow();

        Lotto lotto=new Lotto();
        lotto.addCommand(commonWindow);
        lotto.addCommand(vipWindow);
        lotto.doCommand();
    }

}
