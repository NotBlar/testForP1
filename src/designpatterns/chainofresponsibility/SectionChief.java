package designpatterns.chainofresponsibility;

/**
 * Created by Zhangww on 2017/2/10.
 */
public class SectionChief extends Leader {

    @Override
    public void approve(Bill bill) {

        bill.setLeader(new DepartmentChief());
        System.out.println("处长审批，改变状态为2000！");
        bill.setMoney(2000);

        /*if(bill.getMoney()<1000) {
            System.out.println("处长审批!");
            super.getLeader().approve(bill);
        }else if(super.getLeader()!=null){
            System.out.println("处长审批结束，提交上一级审批");
            super.getLeader().approve(bill);
        }*/

    }
}
