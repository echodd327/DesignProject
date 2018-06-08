package cg.n1;

/**
 * @author 01375126
 * @date 2018/5/21
 */
public class Employee {

    private EmployeeType type;
//    private int _type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    Employee(int type){
        setType(type);
    }

    public int getType() {
        return type.getTypeCode();
    }

    public void setType(int _type) {
        type = EmployeeType.newType(_type);
    }

    int payment(){
        return type.payAmount(this);
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
