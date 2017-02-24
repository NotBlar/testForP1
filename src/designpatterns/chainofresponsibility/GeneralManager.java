package designpatterns.chainofresponsibility;

/**
 * Created by Zhangww on 2017/2/10.
 */
public class GeneralManager extends Leader {
    @Override
    public void approve(Bill bill) {

        if(bill.getMoney()>=10000) {
            System.out.println("总经理审批!");
        }else if(super.getLeader()!=null){
            super.getLeader().approve(bill);
        }
    }
}
