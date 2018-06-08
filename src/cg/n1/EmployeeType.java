package cg.n1;

/**
 * 以State/Strategy取代类型码 P251
 * 以多态取代条件表达式 P279
 * 多态的好处在于，你不需要向对象询问"你是什么类型"而后根据得到的答案调用对象的某个行为-你只管调用该行为就行了，
 * 其他的多态机制都会为你安排妥当。
 * @author 01375126
 * @date 2018/5/21
 */
public abstract class EmployeeType {

    static final int ENGINEE = 0; //工程师
    static final int SALEMAN = 1;
    static final int MANAGER = 2;  //经理
    abstract int getTypeCode();

    static EmployeeType newType(int code){
        switch (code){
            case EmployeeType.ENGINEE:
                return new Engineer();
            case EmployeeType.SALEMAN:
                return new Saleman();
            case EmployeeType.MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorret Employee code");
        }
    }
    abstract int payAmount(Employee emp);

}
