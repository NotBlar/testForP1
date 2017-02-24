package designpatterns.observer.projectmodel;

/**
 * Created by Zhangww on 2017/2/13.
 */
public class PlantClient implements PlantClientObserver {


    /**
     * 注册打招呼策略信触发
     *
     * @param userid
     */
    @Override
    public void triggerRegistQPlan(long userid) {
        /*UserClient userClient = userClientManagement.getOneUserClient(userid);
        if(userClient.isNotVipMale()){
            PlanTriggerMessageBean messageBean = new PlanTriggerMessageBean();
            messageBean.setUserid(userid);
            messageBean.setTime(new Date());
            messageBean.setPlan_type(PlanTypes.REGIST_Q);
            RedisPublisher.publish(RedisPubSubChannels.PLAN_TRIGGER,messageBean);
        }*/
    }

    /**
     * 每日打招呼策略信触发
     *
     * @param userid
     */
    @Override
    public void triggerEveryDayQPlan(long userid) {
        /*UserClient userClient = userClientManagement.getOneUserClient(userid);
        if(userClient.isNotVipMale()){
            PlanTriggerMessageBean messageBean = new PlanTriggerMessageBean();
            messageBean.setUserid(userid);
            messageBean.setTime(new Date());
            messageBean.setPlan_type(PlanTypes.REGIST_Q);
            RedisPublisher.publish(RedisPubSubChannels.PLAN_TRIGGER,messageBean);
        }*/
    }

    /**
     * 回复打招呼策略信触发
     *
     * @param userid
     */
    @Override
    public void triggerDelayAPlan(long userid, long plan_userid, int QA_id) {
        /*UserClient userClient = userClientManagement.getOneUserClient(userid);
        if(userClient.isNotVipMale()){
            PlanTriggerMessageBean messageBean = new PlanTriggerMessageBean();
            messageBean.setUserid(userid);
            messageBean.setTime(new Date());
            messageBean.setPlan_type(PlanTypes.REGIST_Q);
            RedisPublisher.publish(RedisPubSubChannels.PLAN_TRIGGER,messageBean);
        }*/
    }
}
