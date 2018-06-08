package cg.moveBetweenObjects7.before;

/**
 * @author 01375126
 * @date 2018/5/23
 */
public class Person {

    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getTelphoneNumber(){
        return "("+officeAreaCode + ")"+ officeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
