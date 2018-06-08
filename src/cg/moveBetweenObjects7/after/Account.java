package cg.moveBetweenObjects7.after;

/**
 * @author 01375126
 * @date 2018/5/23
 */
public class Account {

    private AccountType type;
    private int dayOverdrawn;

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public int getDayOverdrawn() {
        return dayOverdrawn;
    }

    public void setDayOverdrawn(int dayOverdrawn) {
        this.dayOverdrawn = dayOverdrawn;
    }

    /**
     * 透支金额计费规则
     * @return
     */
    double overdraftCharge(){
        return type.overdraftCharge(this);
    }

    double bankCharge(){
        double result = 4.5;
        if(dayOverdrawn>0) result+= type.overdraftCharge(this);
        return result;
    }
}