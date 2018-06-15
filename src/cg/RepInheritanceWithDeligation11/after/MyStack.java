package cg.RepInheritanceWithDeligation11.after;

import java.util.Vector;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public class MyStack {

    private Vector vector = new Vector();

    public void push(Object element){
        vector.insertElementAt(element,0);
    }

    public Object pop(){
        Object result = vector.firstElement();
        vector.removeElementAt(0);
        return result;
    }
    public int size(){
        return vector.size();
    }
    public boolean isEmpty(){
        return vector.isEmpty();
    }
}
