package com.xiu.factory.fourone;

public abstract class ParallelService {
	
	public abstract void waitWorking(String host,int port,String workType);
	
	public abstract void waitWroking(String workType);
}
