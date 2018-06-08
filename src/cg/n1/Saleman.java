package cg.n1;

/**
 * @author 01375126
 * @date 2018/5/21
 */
public class Saleman extends EmployeeType{

    @Override
    int getTypeCode() {
        return SALEMAN;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary()+emp.getCommission();
    }
}
