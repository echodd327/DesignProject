package cg.introduceParmObject109.after;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 01375126
 * @date 2018/6/8
 */
public class Account {

    private Vector entries = new Vector();
    double getFlowBetween(DateRange range){
        double result = 0;
        Enumeration e = entries.elements();
        while(e.hasMoreElements()){
            Entry each = (Entry) e.nextElement();
            if(range.include(each.getChargeDate())){
                result+=each.getValue();
            }
        }
        return result;
    }

    public static void main(String[] args){
        Account account = new Account();
        Date start = null;
        Date end = null;
        double flow = account.getFlowBetween(new DateRange(start,end));
    }
}
