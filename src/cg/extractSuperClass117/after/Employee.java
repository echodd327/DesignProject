package cg.extractSuperClass117.after;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public class Employee extends  Party{


    private String id;
    private int annualCost;

    public Employee(String name,String id,int annualCost){
        super(name);
        this.annualCost = annualCost;
        this.id = id;
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

    public int headCount(){
        return 1;
    }
}
