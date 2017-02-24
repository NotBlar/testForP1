package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhangww on 2017/2/13.
 */
public class BankAccount {

    private String name;
    private double amt;

    List<BankObserver> bankObserverList=new ArrayList<BankObserver>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmt() {
        return amt;
    }

    /**
     * 添加观察者
     * @param bankObserver
     */
    public void add(BankObserver bankObserver){
        bankObserverList.add(bankObserver);
    }

    /**
     * 删除观察者
     * @param bankObserver
     */
    public void remove(BankObserver bankObserver){
        bankObserverList.remove(bankObserver);
    }

    public void notifyAmt(){
        for(int i=0;i<bankObserverList.size();i++){
            BankObserver bankObserver=(BankObserver) bankObserverList.get(i);
            bankObserver.update(amt);
        }
    }

    public void setAmt(double amt) {
        this.amt = amt;
        /*CustomerBank customerBank=new CustomerBank();
        customerBank.setEmail("12345678@qq.com");
        customerBank.notifyEmail(amt);*/
        notifyAmt();
    }
}
