package util.other;

import java.util.Date;

public final class Period1 {
	
	private Date start ;
	private Date end;
	
	public Period1(Date start,Date end){
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
		if(start.compareTo(end) > 0){
			throw new IllegalArgumentException(start +" after "+ end);
		}
		
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
