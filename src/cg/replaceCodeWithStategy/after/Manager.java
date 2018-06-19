package cg.replaceCodeWithStategy.after;

/**
 * @author 01375126
 * @date 2018/6/19
 */
public class Manager extends EmployeeType {

    @Override
    int getTypeCode() {
        return Employee.MANAGER;
    }

    @Override
    int payAmount(Employee employee) {
        return employee.getMonthSalary()  + employee.getCommsission();
    }
}
