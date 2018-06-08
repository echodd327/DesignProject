package cg.moveBetweenObjects7.after;

/**
 * @author 01375126
 * @date 2018/5/23
 */
public class Person {

    private String name;
    private TelephoneNumber telephoneNumber;

    public String getTelphoneNumber(){
        return telephoneNumber.getTelephoneNumber();
    }

    public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
