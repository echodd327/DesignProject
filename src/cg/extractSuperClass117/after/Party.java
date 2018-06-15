package cg.extractSuperClass117.after;

/**
 * @author 01375126
 * @date 2018/6/15
 */
public abstract  class Party {


    protected String name;

    protected  Party(String name){
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public abstract  int getAnnualCost();
}
