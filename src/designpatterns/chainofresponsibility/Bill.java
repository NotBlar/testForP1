package designpatterns.chainofresponsibility;

/**
 * 出差报支单
 * Created by Zhangww on 2017/2/10.
 */
public class Bill {

    private String name;
    private double money;
    private Leader leader;

    public Bill(){
        this.leader=new SectionChief();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public void approve(){
        this.leader.approve(this);
    }
}
