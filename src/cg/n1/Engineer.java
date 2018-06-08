package cg.n1;

/**
 * @author 01375126
 * @date 2018/5/21
 */
public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return ENGINEE;

    }
    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }
}
