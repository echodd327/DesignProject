package cg.moveBetweenObjects7.after;

/**
 * @author 01375126
 * @date 2018/5/23
 */
public class TelephoneNumber {

    private String areaCode;
    private String number;

    public String getTelephoneNumber(){
        return "("+ getAreaCode() + ")" + getNumber();
    }
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
