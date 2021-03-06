package designpatterns.chainofresponsibility;

/**
 * 领导审批抽象类
 * Created by Zhangww on 2017/2/10.
 */
public abstract class Leader {

    private Leader leader;

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public abstract void approve(Bill bill);
    //public abstract void approve(Document document);

}
