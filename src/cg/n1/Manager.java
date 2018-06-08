package cg.n1;

/**
 * @author 01375126
 * @date 2018/5/21
 */
public class Manager extends  EmployeeType {
    @Override
    int getTypeCode() {
        return MANAGER;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary()+emp.getBonus();
    }
}
