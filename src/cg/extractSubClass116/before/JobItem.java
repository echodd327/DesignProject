package cg.extractSubClass116.before;

/**
 * @author 01375126
 * @date 2018/6/12
 */
public class JobItem {

    private int unitPrice;
    private int quantity;
    private boolean isLabor;
    private Employee employee;
    public JobItem(int unitPrice,int quantity, boolean isLabor, Employee employee){
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.isLabor = isLabor;
        this.employee = employee;
    }
    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice(){
        return this.getUnitPrice()*this.getQuantity();
    }
    public int getUnitPrice() {
       return isLabor? employee.getRate():unitPrice;
    }
}
