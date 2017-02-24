package designpatterns.observer;

/**
 * Created by Zhangww on 2017/2/13.
 */
public class observerTest {

    public static void main(String[] args) {
        /*BankAccount bankAccount=new BankAccount();
        bankAccount.setAmt(1000);*/

        BankAccount bankAccount=new BankAccount();
        CustomerBank customerBank=new CustomerBank();
        customerBank.setEmail("12346@qq.com");
        bankAccount.add(customerBank);
        bankAccount.setAmt(1000);
    }
}
