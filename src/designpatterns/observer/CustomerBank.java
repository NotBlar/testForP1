package designpatterns.observer;

/**
 * Created by Zhangww on 2017/2/13.
 */
public class CustomerBank implements BankObserver{

    private String email;

    private String telePhone;

    private String qq;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    /*public void notifyEmail(double amt){
        System.out.println("账户金额发生变动，发送电子邮件到"+email+",金额为:"+amt);
    }*/

    @Override
    public void update(double amt) {
        System.out.println("账户金额发生变动，发送电子邮件到"+email+",金额为:"+amt);
    }
}
