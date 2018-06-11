package cg.introduceParmObject109.before;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 01375126
 * @date 2018/6/8
 */
public class Account {

    private Vector entries = new Vector();
    double getFlowBetween(Date start, Date end){
        double result = 0;
        Enumeration e = entries.elements();
        while(e.hasMoreElements()){
            Entry each = (Entry) e.nextElement();
            if(each.getChargeDate().equals(start) || each.getChargeDate().equals(end) || each.getChargeDate().after(start) || each.getChargeDate().before(end)){
                result+=each.getValue();
            }
        }
        return result;
    }
}
