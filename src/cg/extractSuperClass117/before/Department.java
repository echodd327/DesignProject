package cg.extractSuperClass117.before;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public class Department {

    private String name;
    private Vector staff = new Vector();

    public Department(String name){
        this.name = name;
    }

    /**
     * 年度成本
     */
    public int getTotalAnnualCost(){

        Enumeration e = getStaff();
        int result = 0;
        while(e.hasMoreElements()){
            Employee employee = (Employee)e.nextElement();
            result += employee.getAnnualCost();
        }
        return result;
    }

    public int getHeadCount(){
        return staff.size();
    }

    public Enumeration getStaff(){
        return staff.elements();
    }

    public void addStaff(Employee args){
        this.staff.add(args);
    }

    public String getName() {
        return name;
    }
}
