package cg.moveBetweenObjects7.after;

/**
 * @author 01375126
 * @date 2018/5/23
 */
public class AccountType {

    public boolean isPreminum(){
        return true;
    }

    /**
     * 透支金额计费规则
     * @return
     */
    double overdraftCharge(Account account){
        if(isPreminum()){
            double result = 10;
            if(account.getDayOverdrawn()>7) result+=(account.getDayOverdrawn()-7)*0.85;
            return result;
        }else
            return account.getDayOverdrawn()*1.75;
    }

}
