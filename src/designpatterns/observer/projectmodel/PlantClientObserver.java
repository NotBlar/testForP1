package designpatterns.observer.projectmodel;

/**
 *策略信抽象模型
 * Created by Zhangww on 2017/2/13.
 */
public interface PlantClientObserver {

    /**
     * 注册打招呼策略信触发
     * @param userid
     */
    void triggerRegistQPlan(long userid);

    /**
     * 每日打招呼策略信触发
     * @param userid
     */
    void triggerEveryDayQPlan(long userid);

    /**
     * 回复打招呼策略信触发
     * @param userid
     */
    void triggerDelayAPlan(long userid,long plan_userid,int QA_id);


}
