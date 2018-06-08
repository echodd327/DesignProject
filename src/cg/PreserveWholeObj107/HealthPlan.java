package cg.PreserveWholeObj107;

/**
 * @author 01375126
 * @date 2018/6/8
 */
public class HealthPlan {

    private TemplateRange range;

    boolean withRange(TemplateRange roomRange){
        return range.include(roomRange);
    }
}
