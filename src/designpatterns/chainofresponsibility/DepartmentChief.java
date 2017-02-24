package designpatterns.chainofresponsibility;

/**
 * Created by Zhangww on 2017/2/10.
 */
public class DepartmentChief extends Leader {

    @Override
    public void approve(Bill bill) {

        bill.setLeader(new FinanceChief());
        System.out.println("部长审批，修改状态为6000");
        bill.setMoney(6000);

        /*if(bill.getMoney()>=1000&&bill.getMoney()<5000) {
            System.out.println("部长审批！");
            super.getLeader().approve(bill);
        }else if(super.getLeader()!=null){
            System.out.println("部长审批结束，提交上一级审批！");
            super.getLeader().approve(bill);
        }*/
    }
}
