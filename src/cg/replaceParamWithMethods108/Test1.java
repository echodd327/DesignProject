package cg.replaceParamWithMethods108;

/**
 * @author 01375126
 * @date 2018/6/8
 */
public class Test1 {

    private int quantity;
    private double itemPrice;

    public double getPrice(){
       return  discountedPrice();
    }

    private double discountedPrice(){
        if(getDiscountLevel() == 2) return getbasePrice()*0.1;
        else{
            return getbasePrice()*0.05;
        }
    }

    private double getbasePrice(){
        return quantity*itemPrice;
    }

    private int getDiscountLevel(){
        if(quantity>100) return 2;
        else return 1;
    }
}
