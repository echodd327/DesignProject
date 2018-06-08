package cg.PreserveWholeObj107;

/**
 * @author 01375126
 * @date 2018/6/8
 */
public class Room {

    private TemplateRange daysTemplateRange;

    boolean withinPlan(HealthPlan plan){
        return plan.withRange(getDaysTemplateRange());
    }

    public TemplateRange getDaysTemplateRange() {
        return daysTemplateRange;
    }

    public void setDaysTemplateRange(TemplateRange daysTemplateRange) {
        this.daysTemplateRange = daysTemplateRange;
    }
}
