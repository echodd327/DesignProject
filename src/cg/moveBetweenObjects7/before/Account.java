package cg.moveBetweenObjects7.before;

/**
 * @author 01375126
 * @date 2018/5/23
 */
public class Account {

    private AccountType type;
    private int dayOverdrawn;

    /**
     * 透支金额计费规则
     * @return
     */
    double overdraftCharge(){
        if(type.isPreminum()){
            double result = 10;
            if(dayOverdrawn>7) result+=(dayOverdrawn-7)*0.85;
            return result;
        }else
            return dayOverdrawn*1.75;
    }

    double bankCharge(){
        double result = 4.5;
        if(dayOverdrawn>0) result+=overdraftCharge();
        return result;
    }
}