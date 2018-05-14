package util.other;

import java.util.Date;

public final class Period {
	
	private Date start ;
	private Date end;
	
	public Period(Date start,Date end){
		if(start.compareTo(end) > 0){
			throw new IllegalArgumentException(start +" after "+ end);
		}
		this.start = start;
		this.end = end;
	}

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
	
	
	
}
