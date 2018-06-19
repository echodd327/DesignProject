package cg.replaceCodeWithStategy.after;

/**
 * @author 01375126
 * @date 2018/6/19
 */
public class Saleman extends  EmployeeType {

    @Override
    int getTypeCode() {
        return Employee.SALEMAN;
    }

    @Override
    int payAmount(Employee employee) {
        return employee.getMonthSalary() + employee.getBonus();
    }
}
