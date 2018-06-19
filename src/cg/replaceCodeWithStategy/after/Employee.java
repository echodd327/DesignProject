package cg.replaceCodeWithStategy.after;

public class Employee {

    private int type;
    static final int ENGINEER = 0; //工程师,对表现优异工程师，可升级为经理
    static final int SALEMAN = 1;  //销售员
    static final int MANAGER = 2;   //经理

    private EmployeeType employeeType;

    private int monthSalary; //月薪水
    private int commsission;
    private int bonus;

    Employee(int type){
       setType(type);
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        switch (type){
            case ENGINEER:
                employeeType = new Engineer();
                break;
            case SALEMAN:
                employeeType = new Saleman();
                break;
            case MANAGER:
                employeeType = new Manager();
                break;
                default:
                    throw new  IllegalArgumentException("Incorret type!");
        }
    }

    int payAmount(){
        return employeeType.payAmount(this);
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public int getCommsission() {
        return commsission;
    }

    public int getBonus() {
        return bonus;
    }
}
