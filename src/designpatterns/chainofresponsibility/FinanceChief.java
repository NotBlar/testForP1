package designpatterns.chainofresponsibility;

/**
 * Created by Zhangww on 2017/2/10.
 */
public class FinanceChief extends Leader {
    @Override
    public void approve(Bill bill) {

        bill.setLeader(new GeneralManager());
        System.out.println("财务经理审批，修改状态为16000");
        bill.setMoney(16000);

        /*if(bill.getMoney()>=5000&&bill.getMoney()<10000) {
            System.out.println("财务经理审批!");
            super.getLeader().approve(bill);
        }else if(super.getLeader()!=null){
            System.out.println("财务经理审批结束，提交上一级审批");
            super.getLeader().approve(bill);
        }*/
    }
}
