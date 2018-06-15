package cg.extractSuperClass117.after;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public class Department extends  Party{


    private Vector staffChildren = new Vector();

    public Department(String name){
       super(name);
    }
    /**
     * 年度成本
     */
    public int getAnnualCost(){
        Enumeration e = getStaff();
        int result = 0;
        while(e.hasMoreElements()){
            Employee employee = (Employee)e.nextElement();
            result += employee.getAnnualCost();
        }
        return result;
    }

    /**
     * Substitute Algorithm
     * @return
     */
    public int getHeadCount(){
        return staffChildren.size();
    }

    public Enumeration getStaff(){
        return staffChildren.elements();
    }

    public void addStaff(Party args){
        this.staffChildren.add(args);
    }


}
