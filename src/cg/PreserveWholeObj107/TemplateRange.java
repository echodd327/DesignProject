package cg.PreserveWholeObj107;

/**
 * @author 01375126
 * @date 2018/6/8
 */
public class TemplateRange {

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    private int low;
    private int high;



    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    boolean include(TemplateRange range){
        return (range.getLow()>this.getLow() && range.getHigh() < this.getHigh());
    }

}
