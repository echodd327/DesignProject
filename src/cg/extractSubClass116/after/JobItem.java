package cg.extractSubClass116.after;

/**
 * @author 01375126
 * @date 2018/6/12
 */
public abstract  class JobItem {


    private int quantity;

    public  JobItem(int quantity){
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

    public abstract int getTotalPrice();



}
