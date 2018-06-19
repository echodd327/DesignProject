package cg.replaceCodeWithStategy.after;

/**
 * @author 01375126
 * @date 2018/6/19
 */
public class Engineer extends  EmployeeType {
    @Override
    int getTypeCode() {
       return Employee.ENGINEER;
    }

    @Override
    int payAmount(Employee employee) {
        return employee.getMonthSalary();

    }
}
