package cg.extractSuperClass117.before;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public class Employee {

    private String name;
    private String id;
    private int annualCost;

    public Employee(String name,String id,int annualCost){
        this.name = name;
        this.annualCost = annualCost;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    /**
     * 年度成本
     */
    public int getAnnualCost() {
        return annualCost;
    }

    public String getId() {
        return id;
    }
}
