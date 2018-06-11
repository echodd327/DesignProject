package cg.introduceParmObject109.after;

import java.util.Date;

/**
 * @author 01375126
 * @date 2018/6/8
 *  帐项
 */
public class Entry {

    public Entry(double value, Date chargeDate){
        this.chargeDate = chargeDate;
        this.value = value;
    }

    public Date getChargeDate() {
        return chargeDate;
    }

    public double getValue() {
        return value;
    }

    private Date chargeDate;
    private double value;
}
