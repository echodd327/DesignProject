package cg.extractSubClass116.after;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public class PartsItem extends  JobItem {
    private int unitPrice;

    public PartsItem(int unitPrice, int quantity) {
        super(quantity);
        this.unitPrice = unitPrice;
    }

    @Override
    public int getTotalPrice() {
        return this.getUnitPrice()*this.getQuantity();
    }

    public int getUnitPrice() {
        return unitPrice;
    }
}
