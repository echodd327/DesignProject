package cg.extractSubClass116.after;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public class LaborItem extends JobItem{


    private Employee employee;

    public LaborItem(int quantity, Employee employee) {
        super(quantity);  //暂时使用超类的protected构造函数
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }


    @Override
    public int getTotalPrice() {
        return this.employee.getRate()* this.getQuantity();
    }
}

