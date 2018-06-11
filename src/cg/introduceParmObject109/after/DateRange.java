package cg.introduceParmObject109.after;

import java.util.Date;

/**
 * @author 01375126
 * @date 2018/6/11
 */
public class DateRange {

    public DateRange(Date start,Date end){
        this.start = start;
        this.end = end;
    }

    private Date start;
    private Date end;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public boolean include(Date arg){
        return arg.equals(start) || arg.equals(end)
                || arg.after(start) || arg.before(end);
    }
}
