package cg.RepInheritanceWithDeligation11.before;

import java.util.Vector;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public class MyStack extends Vector {

    public void push(Object element){
        insertElementAt(element,0);
    }

    public Object pop(){
        Object result = firstElement();
        removeElementAt(0);
        return result;
    }
}
