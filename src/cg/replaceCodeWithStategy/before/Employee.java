package cg.replaceCodeWithStategy.before;

public class Employee {

    private int type;
    static final int ENGINEER = 0; //工程师,对表现优异工程师，可升级为经理
    static final int SALEMAN = 1;  //销售员
    static final int MANAGER = 2;   //经理

    private int monthSalary; //月薪水
    private int commsission;
    private int bonus;

    Employee(int type){
        this.type = type;
    }


    int payAmount(){
        switch(type){
            case ENGINEER:
                return monthSalary;
            case SALEMAN:
                return monthSalary + commsission;
            case MANAGER:
                return monthSalary + bonus;
                default:
                    throw new RuntimeException(("Inconcreet Employee"));
        }
    }
}
